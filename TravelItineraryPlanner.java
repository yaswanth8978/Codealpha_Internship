import java.util.*;
public class TravelItineraryPlanner 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Travel Itinerary Planner!");
        System.out.print("Enter your destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter the start date (yyyy-mm-dd): ");
        String startDate = scanner.nextLine();

        System.out.print("Enter the end date (yyyy-mm-dd): ");
        String endDate = scanner.nextLine();

        System.out.print("Enter your budget in USD: ");
        double budget = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter your accommodation preference (hotel/hostel/airbnb): ");
        String accommodation = scanner.nextLine();
        TravelPlan plan = new TravelPlan(destination, startDate, endDate, budget, accommodation);
        plan.displayPlan();
    }
}

class TravelPlan 
{
    private String destination;
    private String startDate;
    private String endDate;
    private double budget;
    private String accommodation;

    public TravelPlan(String destination, String startDate, String endDate, double budget, String accommodation) {
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
        this.accommodation = accommodation;
    }

    public void displayPlan() 
    {
        System.out.println("\nYour Travel Itinerary:");
        System.out.println("Destination: " + destination);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Accommodation: " + accommodation);
        System.out.println("Budget: $" + budget);
    }
}
