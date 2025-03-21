import java.util.*;
class Bicycle
{
   int gear,speed;
   Bicycle(int pgear,int pspeed){
    this.gear=pgear;
    this.speed=pspeed;
   }
   
}
class MountainBike extends Bicycle
{
    int height;
    MountainBike(int height,int gear,int speed){
        super(gear,speed);
        this.height=height;
    }
    void display(){
        System.out.println("no of gear "+gear);
        System.out.println("no of speed "+speed);
        System.out.println("no of height "+height);
    }
}
public class cycle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gear=sc.nextInt();
        int speed=sc.nextInt();
        int height=sc.nextInt();
        MountainBike b=new MountainBike(height, gear, speed);
        b.display();
        sc.close();
    }
}