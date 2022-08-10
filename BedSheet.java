public class BedSheet {
    private String type;
    private String color;
    private int size;

    // constructor
    public BedSheet (String type, String color , int size){
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public int getSize() {
        return size;
    }
}
