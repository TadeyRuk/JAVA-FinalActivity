import java.util.Scanner;
public class Main {

    private static Reservation[] reservations = new Reservation[100];
    private static int reservationCount = 0;    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean returnMenu = true;

        while (returnMenu) {
            System.out.println("******* Hotel Reservation System ******");
            System.out.println("1 - Add Single Room Reservation");
            System.out.println("2 - Add Double Room Reservation");
            System.out.println("3 - Check In");
            System.out.println("4 - Check Out");
            System.out.println("5 - View Reservation Details");
            System.out.println("6 - Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter room number: ");
                    int roomNumber = sc.nextInt();
                    reservations[reservationCount++] = new SingleRoom(name, roomNumber);
                    sc.nextLine();
                    reservations[reservationCount - 1].checkIn();
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Enter room number: ");
                    int roomNumber2 = sc.nextInt();
                    reservations[reservationCount++] = new DoubleRoom(name2, roomNumber2);
                    System.out.println();
                    reservations[reservationCount -1 ].checkIn();
                    break;

                case 3:
                    System.out.print("Enter reservation index to check in: ");
                    int checkInIndex = sc.nextInt();
                    sc.nextLine();
                    if (isValidIndex(checkInIndex)) {
                        reservations[checkInIndex].checkIn();
                    } else {
                        System.out.println("Invalid reservation index.");
                    }
                    break;

                case 4:
                    System.out.print("Enter reservation index to check out: ");
                    int checkOutIndex = sc.nextInt();
                    sc.nextLine();
                        if (isValidIndex(checkOutIndex)) {
                            reservations[checkOutIndex].checkOut();
                        } 
                        else {
                            System.out.println("Invalid reservation index.");
                        }
                    break;

                case 5:
                    System.out.print("Enter reservation index to view details: ");
                    int detailsIndex = sc.nextInt();
                    sc.nextLine();

                        if (isValidIndex(detailsIndex)) {
                            System.out.println(reservations[detailsIndex].getDetails());

                        } 
                        else {
                            System.out.println();
                            System.out.println("Invalid reservation index.");
                            System.out.println();
                        }
                    break;

                case 6:
                    returnMenu = false;
                    System.out.println("Exiting the program....");
                    break;

                default:
                    System.out.println("Invalid Input.");
                    System.out.println();
                    break;
            }
        }

        
        sc.close();
    }

    private static boolean isValidIndex(int index) {
        return index >= 0 && index < reservationCount && reservations[index] != null;
    }
}
