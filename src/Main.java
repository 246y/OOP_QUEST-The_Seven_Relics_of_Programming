import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Player player;

    public static void main(String[] args) {
        welcome();
        String playerName = prompt("Enter your name, brave learner: ");
        player = new Player(playerName.isEmpty() ? "Adventurer" : playerName);
        System.out.println("\nHello " + player.getName() + "! Your quest: recover the seven OOP relics.");
        System.out.println("Solve each relic's puzzle to collect it. Type 'H' for a hint.\n");

        
        List<Relic> relics = Arrays.asList(
                new ClassesRelic(),
                new ObjectsRelic(),
                new InheritanceRelic(),
                new PolymorphismRelic(),
                new AbstractionRelic(),
                new EncapsulationRelic(),
                new InterfacesRelic()
        );

        Collections.shuffle(relics, new Random());

        for (Relic r : relics) {
            System.out.println("\n--- Entering the Kingdom guarding: " + r.getConcept() + " ---");
            boolean got = false;
            try {
                got = r.playPuzzle(sc, player);
            } catch (Exception e) {
                System.out.println("An error occurred while solving the puzzle. Returning to menu.");
                e.printStackTrace();
            }
            if (got) {
                System.out.println();
                System.out.printf("You have collected %d relic(s): %s\n", player.getRelicsCollected(), player.getInventory());
            }

            if (player.getRelicsCollected() < 7){
                String cont = prompt("Continue to next kingdom? (Y/n): ");
                if (cont.equalsIgnoreCase("n")) {
                    System.out.println("You decided to rest. Exiting...");
                    break;
                }
            } else {
                break;
            }
        }

        conclude();
    }

    private static void welcome() {
        System.out.println("===============================================");
        System.out.println("   OOP QUEST: The Seven Relics of Programming  ");
        System.out.println("===============================================");
    }

    private static String prompt(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    private static void conclude() {
        System.out.println();
        System.out.println("\n=== Quest Summary ===");
        System.out.println("Player: " + player.getName());
        System.out.println("Relics collected: " + player.getRelicsCollected());
        if (player.getRelicsCollected() >= 7) {
            System.out.println("CONGRATULATIONS! You recovered all seven relics!");
            System.out.println("Special Prize: 'Master of Fundamentals' — you have demonstrated understanding of OOP basics.");
            System.out.println("Reward: A metaphorical crown and the knowledge to build object-oriented programs.");
            printAnswers();
        } else if (player.getRelicsCollected() > 0) {
            System.out.println("You collected some relics. Keep studying and try again to recover them all.");
            System.out.println("Collected: " + player.getInventory());
        }
        System.out.println("\nThank you for playing OOP Quest!");
    }




    private static void printAnswers() {
        System.out.println();
        System.out.println("\n====== MASTER ANSWER SHEET ======");
        System.out.println("Classes: \tEasy=B, \t\tMedium=class, \t\tHard=true");
        System.out.println("Objects: \tEasy=1, \t\tMedium=true, \t\tHard=B");
        System.out.println("Inheritance: \tEasy=extends, \t\tMedium=true, \t\tHard=A");
        System.out.println("Polymorphism: \tEasy=B, \t\tMedium=true, \t\tHard=B");
        System.out.println("Abstraction: \tEasy=abstract, \t\tMedium=true, \t\tHard=B");
        System.out.println("Encapsulation: \tEasy=1, \t\tMedium=true, \t\tHard=C");
        System.out.println("Interfaces: \tEasy=implements, \tMedium=true, \t\tHard=B");
        System.out.println("=================================");
    }
}

