public class exception 
{
    public static void main(String[] args) {
       int a=10,b=10;
      try
      {
        System.out.println(a/b);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
      finally
      {
        System.out.println("operation pending");
      }
      
    }
    
    
}