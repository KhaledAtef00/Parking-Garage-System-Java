package myassignment;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.MINUTES;
import java.time.LocalTime;
import java.lang.Math;
public final class Garage 
{
    Scanner input = new Scanner(System.in);
    private int maxslots;
    public int current =0,counter=0; //current vehicles in garage
    private slot[] myslots= new slot[1000]; //array holding all slots in Garage
    private IParkingConfiguration Config ; //Config --> Parking Configuration
    private Operations Op = new Operations(); // Oper --> All Money Operations in Garage
    
    public void setConfig(IParkingConfiguration T)
    {
        Config = T;
    }
    Garage()
    { //Getting Garage Details
        
    }
    public void setslot( slot x) { myslots[counter]=new slot();myslots[counter]=x;counter++;}
    public void setmaxslots(int x){maxslots=x;}
    public void updatecurrent() //updating current cars in Garage after Parkin/Parkout
    {
        current=0;
        for(int i=0;i<maxslots;i++)
        {
            if(myslots[i].getCarId()!=0)
                current+=1;
        }
    }
    public void Parkin()
    {
        System.out.println("Parking In ....");
        if(current == maxslots) //Garage is full when current cars inside = max slots 
        {
            System.out.println("Unfortunately No Place in Garage");
        }
        else
        {   //taking Car details to Parkin
            String s1;
            int x1 , x2 , x3 , x4 ;
            System.out.println("Please Enter Vehicle modelname: ");
            s1=input.next();
            System.out.println("Please Enter Vehicle ID: ");
            x1 = input.nextInt();
            System.out.println("Please Enter Vehicle modelyear: ");
            x2 = input.nextInt();
            System.out.println("Enter Width & Depth for Car: ");
            x3 = input.nextInt();x4 = input.nextInt();
            Vehicle V= new Vehicle(s1 , x1 , x2 , x3 , x4); 
            Config.Park(myslots,maxslots,V);
            updatecurrent();
        }
    }
    public void Parkout()
    {
        //taking Car id to Park it out of the Garage
        System.out.println("Parking Out ....");
        System.out.println("Please Enter Car ID: ");
        int x; x = input.nextInt();
        double fees = Op.CalcFees(x,myslots,maxslots); //return fees of Car when Parked out
        updatecurrent();   
    }
    public void displayAvaliableslots() //Displaying Avaliable Slots in Garage
    {
        System.out.println("_________________");
        for(int i =0;i<maxslots;i++)
        {
            if(myslots[i].getCarId()==0)
            {
                System.out.println("Slot "+(i+1)+" Is Avaliable");
            }
        }
        if(current == maxslots){System.out.println("No Avaliable Slots in Garage");} //Garage is Full therfore no slots avaliable
        System.out.println("_________________");

    }
    public void GetNumberofCars() //Printing Out number of current cars inside Garage
    {
        System.out.println("Number of Cars in Garage = "+current);
    }
    public long GetTotalIncome() //Returning totalIncome of the Garage
    {
        long Total = Op.CalcTotalIncome();
        return Total;
    }
}
