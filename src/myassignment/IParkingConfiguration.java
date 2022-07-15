
package myassignment;

import java.time.LocalTime;
public interface IParkingConfiguration 
{
    void Park(slot[] myslots ,int maxslots, Vehicle V );
}
class FirstComeFirstServe implements IParkingConfiguration
{
    @Override
    public void Park(slot[] myslots ,int maxslots, Vehicle V )
    {
        int pos=-1;
        boolean found=false;
        for(int i=0 ; i<maxslots;i++)
        {
            if(myslots[i].getCarId()==0 && myslots[i].getwidth()>=V.getwidth() && myslots[i].getdepth()>=V.getdepth())
            {
                found=true;
                pos=i;
                break;
            }
        }
        if(found)
        {
            LocalTime now = LocalTime.now();
            myslots[pos].setCarId(V.getid());
            myslots[pos].setStart(now);
            myslots[pos].setCar(V);
            System.out.println("Car ParkedIn Succesfully");
        }
        else
        {
            System.out.println("Unfortunately No Place in Garage");
        }
    }
}
class BestFit implements IParkingConfiguration
{
    @Override
    public void Park(slot[] myslots  ,int maxslots, Vehicle V )
    {
        boolean found =false;
        int min=1000000;
        int pos=-1;
        for(int i=0;i<maxslots;i++)
        {
            if(myslots[i].getCarId()==0 && myslots[i].getwidth()>=V.getwidth() && myslots[i].getdepth()>=V.getdepth())
            {
                if(pos==-1)
                { 
                    pos=i;
                    found=true;
                    myslots[i].setCarId(V.getid());
                    min = (myslots[i].getwidth()-V.getwidth()) + (myslots[i].getdepth() - V.getdepth());
                }
                else
                {
                    int m2 = (myslots[i].getwidth()-V.getwidth()) + (myslots[i].getdepth() - V.getdepth());
                    if(m2<min)
                    {
                        min = m2;
                        myslots[pos].setCarId(0);
                        pos=i;
                        myslots[i].setCarId(V.getid());
                    }
                } 
            }
        }
        if(found)
        {
            LocalTime now = LocalTime.now();
            myslots[pos].setCarId(V.getid());
            myslots[pos].setStart(now);
            myslots[pos].setCar(V);
            System.out.println("Car Parked Succesfully");
        }
        else
        {
            System.out.println("Unfortunately No Place in Garage");
        }
    }
}
 