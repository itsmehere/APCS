package instanceAndClasses;

public class Bike {
    private int seatHeight;
    private int wheelSize;
    private String color;

    public Bike(int seatHeight, int wheelSize, String color){
        this.seatHeight = seatHeight;
        this.wheelSize = wheelSize;
        this.color = color;
    }

    public int getSeatHeight(){
        return this.seatHeight;
    }

    public int getWheelSize(){
        return this.wheelSize;
    }

    public String getBikeColor(){
        return this.color;
    }

}
