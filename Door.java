public class Door {
    private String color;
    private int height;
    private int width;
    private boolean key;

    //construtor
    public Door(String color , int height , int width , boolean key ){
        this.color = color;
        this.height = height;
        this.width = width;
        this.key = key;
    } 

    //method
    public void openDoor(){
        System.out.println("The door is opening ... ");
        setKey(true);
        System.out.println("The door is opend ");
    }
    public void clossDoor(){
        System.out.println("The door is clossing ... ");
        setKey(false);
        System.out.println("The door is clossed ");
    }
    

    //getters
    public String getColor() {
        return color;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public boolean getKey(){
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }
}
