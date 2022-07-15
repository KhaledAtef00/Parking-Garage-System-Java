package myassignment;

/**
 *
 * @author dell
 */
public class Vehicle {
    private String modelname;
    private int id;
    private int modelyear;
    private int width;
    private int depth;
    Vehicle(){modelname="X";id=0;modelyear=0;width=0;depth=0;}
    Vehicle(String s ,int x1 , int x2 , int x3 , int x4 )
    {
        modelname=s;
        id=x1;
        modelyear=x2;
        width=x3;
        depth=x4;    
    }
    public void setmodelname(String s){modelname=s;}
    public void setid(int x){id =x ;}
    public void setmodelyear(int x){modelyear =x ;}
    public void setwidth(int x){width =x ;}
    public void setdepth(int x){depth =x ;}
    public String getmodelname(){return modelname;}
    public int getid(){return id;}
    public int getmodelyear(){return modelyear;}
    public int getwidth(){return width;}
    public int getdepth(){return depth;}
  
}