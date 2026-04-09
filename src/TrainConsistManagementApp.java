import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence of Sleeper
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Final list
        System.out.println("\nFinal passenger bogies:");
        System.out.println(passengerBogies);
    }
}