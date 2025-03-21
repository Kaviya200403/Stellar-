public class ecommerce
{
  public static void main(String arg[])
  {
    String order[]={"order1","order2"};
    int index=4;
    String neworder="order4";
    if(index>0||index<order.length)
    {
        System.out.println("No order exists at this index");
    }
    else{
      order[index]=neworder;
      System.out.println("successs");
    }
  }    
}
