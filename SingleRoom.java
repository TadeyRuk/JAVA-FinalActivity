class SingleRoom extends Reservation {

    public SingleRoom(String guestName, int roomNumber) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    @Override
    public void checkIn() {
        isCheckedIn = true;
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("Single Room: Guest " + guestName + " checked into room " + roomNumber);
        System.out.println("**********************************************************************");
        System.out.println();
        
    }

    @Override
    public void checkOut() {
        isCheckedIn = false;
        System.out.println();
        System.out.println("**********************************************************************");
        System.out.println("Single Room: Guest " + guestName + " checked out from room " + roomNumber);
        System.out.println("**********************************************************************");
        System.out.println();
    }

    @Override
    public String getDetails() {
        System.out.println();
        System.out.println ("Single Room - Guest: " + guestName + ", Room: " + roomNumber + ", Checked In: " + isCheckedIn);
        return("");
    }
}
