public class Main {
    
    public static void main(String[] args) {

        Door door = new Door("black", 20, 6, false);

        // bedsheet class objact
        BedSheet bedSheet = new BedSheet("love", "white", 20);
        Bed bed = new Bed(20, 8, 10, bedSheet, door);

        Funiture funiture = new Funiture(12, "Zoo", 21, 14, 10 , door);

        

        Resolution resolution = new Resolution(4, 5);
        TV tv = new TV("sumsung", 21, resolution , door);

        Room room = new Room(bed, funiture, door, tv);

        room.getTv().pressButton();
        room.getBed().sleepOnBed();
        room.getFuniture().sitOnChair();
        System.out.println();
        door.openDoor();
        room.getTv().pressButton();
        room.getBed().sleepOnBed();
        room.getFuniture().sitOnChair();

    }
}