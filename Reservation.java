abstract class Reservation implements Reservable {
    
    protected String guestName;
    protected int roomNumber;
    protected boolean isCheckedIn = false;

    public abstract void checkIn();
    public abstract void checkOut();
    public abstract String getDetails();
}
