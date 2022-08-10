public class Funiture {
    private int number;
    private String manauFacture;
    private int size;
    private int height;
    private int width;
    private Door door;

    //constructor
    public Funiture(int number , String manuFacture , int size , int height , int width, Door door){
        this.number = number;
        this.manauFacture = manuFacture;
        this.size =size;
        this.height = height;
        this.width = width;
        this.door = door;
    }  

    //method
    public void sitOnChair() {
        if (door.getKey()) {
            System.out.println("You can confortablly sit on your chair");
        } else {
            System.out.println("You can not sit on your chair");
            System.out.println("Please open the door ");
        }
        
    }

    // getters method
    public int getNumber() {
        return number;
    }
    public String getManauFacture() {
        return manauFacture;
    }
    public int getSize() {
        return size;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
}
