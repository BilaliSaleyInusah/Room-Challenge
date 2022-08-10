
public class TV {
    private String model;
    private int size;
    private Resolution resolution;
    private Door door;

    //constructor
    public TV(String model, int size, Resolution resolution, Door door){
        this.model= model;
        this.size = size;
        this.resolution = resolution;
        this.door = door;
    }

    //methods
    public void logo(){
        System.out.println("Drawing logo at " + resolution.getX() + " , " + resolution.getY() + " pixel");
    }

    public void pressButton(){
        if (door.getKey()) {
            System.out.println("TV is oning ....");
            logo();
        } else {
            System.out.println("TV can not be on ....");
            System.out.println("Opend the door the first ");
        }
    }

    public String getModel() {
        return model;
    }
    public int getSize() {
        return size;
    }
    public Resolution getResolution() {
        return resolution;
    }
}
