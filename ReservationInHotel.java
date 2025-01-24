import java.util.Scanner;

public class ReservationInHotel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print( "Enter the hotel name ");
        String hotelName = sc.nextLine();
       
        System.out.print( "Enter your check-in date (example: YYYY-MM-DD): ");
        String checkInDate = sc.nextLine();
        
        System.out.print( "Enter your check-out date (example: YYYY-MM-DD): ");
        String checkOutDate = sc.nextLine();
    
        System.out.print( "Enter the number of rooms: ");
        int rooms = sc.nextInt();
        
        System.out.print( "Enter the number of guests: ");
        int guests = sc.nextInt();
        
        System.out.println("\n\n--- Reservations Summary ---");
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Check-in Date: " + checkInDate);
        System.out.println("Check-out Date: " + checkOutDate);
        System.out.println("Rooms: " + rooms);
        System.out.println("Guests: " + guests);
        
        sc.close(); 
    }
}
