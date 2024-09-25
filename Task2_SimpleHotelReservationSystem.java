package codealpha;
import java.util.*;
public class Task2_SimpleHotelReservationSystem{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        List<Room> rooms = Arrays.asList(
	            new Room(101, "Single", 100),
	            new Room(102, "Double", 150),
	            new Room(201, "Suite", 300)
	        );
	        Map<Integer, Booking> bookings = new HashMap<>();
	        while (true) {
	            System.out.println("\nHotel Reservation System");
	            System.out.println("1. View available rooms");
	            System.out.println("2. Make a reservation");
	            System.out.println("3. View bookings");
	            System.out.println("4. Exit");
	            System.out.print("Select an option: ");
	            int choice = scanner.nextInt();
	            switch (choice) 
	            {
	                case 1:
	                    System.out.println("\nAvailable Rooms:");
	                    for (Room room : rooms) {
	                        if (!room.isBooked()) {
	                            System.out.println("Room " + room.getRoomNumber() + " (" + room.getCategory() + ") - $" + room.getPricePerNight());
	                        }
	                    }
	                    break;
	                case 2:
	                    System.out.print("Enter room number to book: ");
	                    int roomNumber = scanner.nextInt();
	                    scanner.nextLine(); 
	                    System.out.print("Enter guest name: ");
	                    String guestName = scanner.nextLine();
	                    Room roomToBook = findRoomByNumber(rooms, roomNumber);
	                    if (roomToBook != null && !roomToBook.isBooked()) {
	                        roomToBook.bookRoom();
	                        bookings.put(roomNumber, new Booking(guestName, roomToBook));
	                        System.out.println("Room " + roomNumber + " reserved by " + guestName);
	                    } else {
	                        System.out.println("Room is not available.");
	                    }
	                    break;
	                case 3:
	                    System.out.println("\nCurrent Bookings:");
	                    for (Booking booking : bookings.values()) {
	                        System.out.println(booking);
	                    }
	                    break;
	                case 4:
	                    System.out.println("Exiting the system.");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	    private static Room findRoomByNumber(List<Room> rooms, int roomNumber) {
	        for (Room room : rooms) {
	            if (room.getRoomNumber() == roomNumber) {
	                return room;
	            }
	        }
	        return null;
	    }
	}
	class Room {
	    private int roomNumber;
	    private String category;
	    private double pricePerNight;
	    private boolean booked;
	    public Room(int roomNumber, String category, double pricePerNight) {
	        this.roomNumber = roomNumber;
	        this.category = category;
	        this.pricePerNight = pricePerNight;
	        this.booked = false;
	    }
	    public int getRoomNumber() {
	        return roomNumber;
	    }
	    public String getCategory() {
	        return category;
	    }
	    public double getPricePerNight() {
	        return pricePerNight;
	    }
	    public boolean isBooked() {
	        return booked;
	    }

	    public void bookRoom() {
	        booked = true;
	    }
	    @Override
	    public String toString() {
	        return "Room " + roomNumber + " (" + category + ")";
	    }
	}
	class Booking {
	    private String guestName;
	    private Room room;
	    public Booking(String guestName, Room room) {
	        this.guestName = guestName;
	        this.room = room;
	    }
	    @Override
	    public String toString() {
	        return guestName + " booked " + room.toString();
	    }
}
