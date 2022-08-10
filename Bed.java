public class Bed {

    private int size;
    private int height;
    private int width;
    // callling bedsheet class
    private BedSheet bedSheet;
    private Door door;


    // constructor
    public Bed (int size, int height , int width , BedSheet bedSheet , Door door){
        this.size = size;
        this.height = height;
        this.width = width;
        this.bedSheet = bedSheet;
        this.door = door;

    }

    // method
    public void sleepOnBed() {
        if (door.getKey()) {
            System.out.println("You can go to bed ...");
        } else {
            System.out.println("You can not go to bed ...");
            System.out.println("Please opend the door first ...");
        }
        
    }

    // getters method
    public int getSize() {
        return size;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public BedSheet getBedSheet() {
        return bedSheet;
    }



}
