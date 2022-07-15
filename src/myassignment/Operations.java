/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myassignment;

import static java.time.temporal.ChronoUnit.MINUTES;
import java.time.LocalTime;
import java.lang.Math;

public class Operations  //Dealing with all money operations for garage
{
    private LocalTime Start; //initalizing them
    private LocalTime End;
    private long TotalIncome=0;
    Operations()//initalizing Start & End
    {
        Start=LocalTime.parse("10:15:30");
        End=LocalTime.parse("10:15:30");
    }
    public double CalcFees(int x , slot[] myslots ,int maxslots) //x for CarId to be parked out
    {
        // calc fees for car when parking out
        boolean Carfound=false;
        int pos=-1;
        double cost =0;
        for(int i=0;i<maxslots;i++)
        {
            if(myslots[i].getCarId()==x)
            {
                pos=i;
                Carfound = true;
                break;
            }  
        }
        if(Carfound)
        {
            myslots[pos].setCarId(0);
            Start=myslots[pos].getStart();
            End=LocalTime.now();
            long min = MINUTES.between(Start, End);
            double hrs = Math.ceil(min/60.0);
            cost = hrs*5;
            System.out.println("Car ParkedOut Succesfully");
        }
        else //if entered CarId not found in Garage
        {
            System.out.println("Car Not Found In Garage / Wrong ID");
        }
        TotalIncome+=cost; //addig cost to totalincome of garage
        return cost;
    }
    public long CalcTotalIncome()
    {
        return TotalIncome;
    }
}
