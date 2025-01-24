import java.util.Scanner;

public class TravelPlanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Travel Planner!");

        System.out.print("Enter your travel destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter your travel start date (e.g., YYYY-MM-DD): ");
        String startDate = sc.nextLine();

        System.out.print("Enter your travel end date (e.g., YYYY-MM-DD): ");
        String endDate = sc.nextLine();

        System.out.print("Enter the number of travelers: ");
        int travelers = sc.nextInt();
        sc.nextLine(); 

        System.out.println("--- Travel Plan Summary ---");
        System.out.println("Destination: " + destination);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Number of Travelers: " + travelers);

        System.out.print("Do you want to modify your travel plan? (yes/no): ");
        String modifyChoice = sc.nextLine();

        if (modifyChoice.equalsIgnoreCase("yes")) {
        System.out.print("Enter new destination: ");
            destination = sc.nextLine();

            System.out.print("Enter new start date: ");
            startDate = sc.nextLine();

            System.out.print("Enter new end date: ");
            endDate = sc.nextLine();

            System.out.print("Enter new number of travelers: ");
            travelers = sc.nextInt();

            System.out.println("--- Travel Plan with Changes ---");
            System.out.println("Destination: " + destination);
            System.out.println("Start Date: " + startDate);
            System.out.println("End Date: " + endDate);
            System.out.println("Number of Travelers: " + travelers);
        }

        sc.close();
    }
}
