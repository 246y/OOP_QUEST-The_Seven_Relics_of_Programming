import java.util.*;

interface Hintable {
    String getHint();
}

abstract class Relic {
    private final String name;
    private final String concept;

    public Relic(String name, String concept) {
        this.name = name;
        this.concept = concept;
    }

    public String getName() { return name; }
    public String getConcept() { return concept; }

    
    public final boolean playPuzzle(Scanner sc, Player player) {
        System.out.println("\n===== LEVEL: EASY =====");
        if (!easy(sc)) return false;

        System.out.println("\n===== LEVEL: MEDIUM =====");
        if (!medium(sc)) return false;

        System.out.println("\n===== LEVEL: HARD =====");
        if (!hard(sc)) return false;

        player.collectRelic(getName());
        return true;
    }

    protected abstract boolean easy(Scanner sc);
    protected abstract boolean medium(Scanner sc);
    protected abstract boolean hard(Scanner sc);
}

class Player {
    private String name;
    private int relicsCollected;
    private List<String> inventory = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public int getRelicsCollected() { return relicsCollected; }

    public void collectRelic(String name) {
        relicsCollected++;
        inventory.add(name);
    }

    public List<String> getInventory() { return Collections.unmodifiableList(inventory); }
}



class ClassesRelic extends Relic implements Hintable {
    public ClassesRelic() { super("Relic of Forms (Class)", "Relic of Forms"); }
    public String getHint() { return "Think: blueprints used to create objects."; }

    @Override
    protected boolean easy(Scanner sc) {
        System.out.println("EASY: \"I define structure and behavior, but I am not an object. I am the ... ?\"");
        System.out.println("A) Method  \tB) Class  \tC) Instance  \tD) Variable");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().trim().toUpperCase();
            if (ans.equals("H")) {
                System.out.println("Hint: " + getHint());
                continue;
            }
            if (ans.equals("B")) {
                System.out.println("Correct!");
                return true;
            }
            System.out.println("Incorrect. Try again.");
        }
    }

    @Override
    protected boolean medium(Scanner sc) {
        System.out.println("MEDIUM: \"What keyword is used to create a class in Java?\"");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().trim();
            if (ans.equalsIgnoreCase("class")) return true;
            System.out.println("Wrong. Try again.");
        }
    }

    @Override
    protected boolean hard(Scanner sc) {
        System.out.println("HARD: \"True or False: A class can contain both fields and methods.\"");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().trim().toLowerCase();
            if (ans.equals("true")) return true;
            System.out.println("Incorrect.");
        }
    }
}

class ObjectsRelic extends Relic {
    public ObjectsRelic() { super("Relic of Being (Objects)", "Relic of Being"); }

    @Override
    protected boolean easy(Scanner sc) {
        System.out.println("\"Which statement is true about objects?\"");
        System.out.println("1) An object is an instance of a class.");
        System.out.println("2) An object defines the blueprint for a class.");
        System.out.print("Your answer: ");

        while (true) {
            String s = sc.nextLine();
            if (s.equals("1")) return true;
            System.out.println("Wrong.");
        }
    }

    @Override
    protected boolean medium(Scanner sc) {
        System.out.println("MEDIUM: \"True or False: Objects store data in fields.\"");
        System.out.print("Your answer: ");

        while (true) {
            String s = sc.nextLine().toLowerCase();
            if (s.equals("true")) return true;
            System.out.println("Wrong.");
        }
    }

    @Override
    protected boolean hard(Scanner sc) {
        System.out.println("HARD: \"Objects access shared behavior through what?\"");
        System.out.println("A) Inheritance  \tB) Methods  \tC) Keywords  \tD) Interfaces");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toUpperCase();
            if (ans.equals("B")) return true;
            System.out.println("Try again.");
        }
    }
}


class InheritanceRelic extends Relic implements Hintable {
    public InheritanceRelic() { super("Relic of Roots (Inheritance)", "Relic of Roots"); }
    public String getHint() { return "Keyword: extends"; }

    @Override
    protected boolean easy(Scanner sc) {
        System.out.println("EASY: Fill: 'class Dog ____ Animal'");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("extends")) return true;
            if (ans.equalsIgnoreCase("H")) System.out.println("Hint: extends");
            else System.out.println("Wrong.");
        }
    }

    @Override
    protected boolean medium(Scanner sc) {
        System.out.println("MEDIUM: \"True or False: Child classes inherit fields and methods.\"");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toLowerCase();
            if (ans.equals("true")) return true;
            System.out.println("Wrong.");
        }
    }

    @Override
    protected boolean hard(Scanner sc) {
        System.out.println("HARD: \"What do we call the class being inherited from?\"");
        System.out.println("A) Parent class  \tB) Child class  \tC) Final class");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toUpperCase();
            if (ans.equals("A")) return true;
            System.out.println("Incorrect.");
        }
    }
}


class PolymorphismRelic extends Relic {
    public PolymorphismRelic() { super("Relic of Many Faces (Polymorphism)", "Relic of Many Faces"); }

    @Override
    protected boolean easy(Scanner sc) {
        System.out.println("EASY: 'Animal a = new Dog(); a.sound(); What concept allows this?'");
        System.out.println("A) Encapsulation  \tB) Polymorphism  \tC) Abstraction  \tD) Interface");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toUpperCase();
            if (ans.equals("B")) return true;
            System.out.println("Wrong.");
        }
    }

    @Override
    protected boolean medium(Scanner sc) {
        System.out.println("MEDIUM: \"True or False: Polymorphism allows different classes to be treated as one type.\"");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toLowerCase();
            if (ans.equals("true")) return true;
            System.out.println("Incorrect.");
        }
    }

    @Override
    protected boolean hard(Scanner sc) {
        System.out.println("HARD: \"Runtime polymorphism is achieved using what?\"");
        System.out.println("A) Method Overloading  \tB) Method Overriding");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toUpperCase();
            if (ans.equals("B")) return true;
            System.out.println("Wrong.");
        }
    }
}


class AbstractionRelic extends Relic implements Hintable {
    public AbstractionRelic() { super("Relic of Shadows(Abstraction)", "Relic of Shadows"); }
    public String getHint() { return "Keyword: abstract"; }

    @Override
    protected boolean easy(Scanner sc) {
        System.out.println("EASY: \"Which keyword creates an abstract class?\"");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("abstract")) return true;
            System.out.println("Wrong.");
        }
    }

    @Override
    protected boolean medium(Scanner sc) {
        System.out.println("MEDIUM: \"True or False: Abstract classes can have abstract methods.\"");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toLowerCase();
            if (ans.equals("true")) return true;
            System.out.println("Incorrect.");
        }
    }

    @Override
    protected boolean hard(Scanner sc) {
        System.out.println("HARD: \"Which provides 100% abstraction?\"");
        System.out.println("A) Class  \tB) Interface");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toUpperCase();
            if (ans.equals("B")) return true;
            System.out.println("Wrong.");
        }
    }
}


class EncapsulationRelic extends Relic {
    public EncapsulationRelic() { super("Relic of Shields(Encapsulation)", "Relic of Shields"); }

    @Override
    protected boolean easy(Scanner sc) {
        System.out.println("EASY: Why make fields private?");
        System.out.println("1) To hide state and control access.");
        System.out.println("2) To increase speed.");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine();
            if (ans.equals("1")) return true;
            System.out.println("Wrong.");
        }
    }

    @Override
    protected boolean medium(Scanner sc) {
        System.out.println("MEDIUM: \"True or False: Encapsulation protects data.\"");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toLowerCase();
            if (ans.equals("true")) return true;
            System.out.println("Wrong.");
        }
    }

    @Override
    protected boolean hard(Scanner sc) {
        System.out.println("HARD: \"Which access modifier restricts fields the most?\"");
        System.out.println("A) public  \tB) protected  \tC) private");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toUpperCase();
            if (ans.equals("C")) return true;
            System.out.println("Wrong.");
        }
    }
}


class InterfacesRelic extends Relic implements Hintable {
    public InterfacesRelic() { super("Relic of Contracts(Interfaces)", "Relic of Contracts"); }
    public String getHint() { return "Keyword: implements"; }

    @Override
    protected boolean easy(Scanner sc) {
        System.out.println("EASY: Fill: 'class Hero ____ Flyable'");

        while (true) {
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("implements")) return true;
            System.out.println("Wrong.");
        }
    }

    @Override
    protected boolean medium(Scanner sc) {
        System.out.println("MEDIUM: \"True or False: Interfaces cannot contain concrete methods (before Java 8).\"");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toLowerCase();
            if (ans.equals("true")) return true;
            System.out.println("Wrong.");
        }
    }

    @Override
    protected boolean hard(Scanner sc) {
        System.out.println("HARD: \"A class can implement how many interfaces?\"");
        System.out.println("A) Only 1  \tB) Multiple");
        System.out.print("Your answer: ");

        while (true) {
            String ans = sc.nextLine().toUpperCase();
            if (ans.equals("B")) return true;
            System.out.println("Wrong.");
        }
    }
}





