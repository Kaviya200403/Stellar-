abstract class car
{
    abstract void accelerator();
   
    abstract void brake();
    
    abstract void clutch();
    
} 
class vehicle extends car
{
   void accelerator()
   {
    System.out.println("moving");
   }
   void brake()
   {
    System.out.println("stop");
   }
   void clutch()
   {
    System.out.println("running");
   }
}