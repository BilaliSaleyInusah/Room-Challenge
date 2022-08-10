public class Room {
    private Bed bed;
    private Funiture funiture;
    private Door door;
    private TV tv;

    // constructor
    public Room (Bed bed, Funiture funiture, Door door, TV tv){
        this.bed = bed;
        this.funiture = funiture;
        this.door = door;
        this.tv = tv;
    }

    public Bed getBed() {
        return bed;
    }
    public Funiture getFuniture() {
        return funiture;
    }
    public Door getDoor() {
        return door;
    }
    public TV getTv() {
        return tv;
    }

    

}
