package myassignment;

import java.time.LocalTime;

public class slot {
    private int width;
    private int depth;
    private int CarId; // if id=0 slot is empty else slot has car
    private LocalTime Start;
    private Vehicle CAR;
    slot(){width=0;depth=0;CarId=0;}
    slot(int x , int y){ width = x;depth=y;CarId=0;}
    public void setwidth(int j ){  width=j;}
    public void setdepth(int j ){depth=j;}
    public void setCarId(int j ){CarId=j;}
    public void setStart(LocalTime T){Start =T;}
    public void setCar(Vehicle V){ CAR =V;}
    public int getwidth(){return width;}
    public int getdepth() {return depth;}
    public int getCarId(){return CarId;}
    public LocalTime getStart(){return Start;}
}