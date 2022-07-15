package myassignment;
import java.util.Scanner;

public class MyAssignment {
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);  
        Garage mine = new Garage();
        
        
        System.out.println("Hello Sir , Please Enter Max Slots in Garage: ");
        int x;x=input.nextInt();
        mine.setmaxslots(x);
         for (int i = 0; i < x; i++) 
        {
            int x1 , y1;
            System.out.println("Enter Width & Depth for Slot: "+(i+1));
            x1 = input.nextInt();
            y1 = input.nextInt();
            slot z = new slot(x1,y1);
            mine.setslot(z);
        }
         
         System.out.println("Choose Configuration to Work With:  ");
        System.out.println("1 --> First come First served slots");
        System.out.println("2 --> Best-Fit Approach");
        int Config;Config=input.nextInt();
        if(Config==1)
        {
            mine.setConfig(new FirstComeFirstServe()); //modifying Config to First Served
        }
        else
        {
            mine.setConfig(new BestFit()); //Modifying Config to Best Fit Approach
        }
        mine.Parkin();
        mine.displayAvaliableslots();
        mine.Parkin();
        mine.displayAvaliableslots();
        mine.Parkout();
        mine.Parkout();
        mine.GetNumberofCars();
        System.out.println("Total Income = "+mine.GetTotalIncome());
    } 
} 
