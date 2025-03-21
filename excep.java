public class excep
{
    void div() throws ArithmeticException,ArrayIndexOutOfBoundsException
    {
        int arr[]={1,2,3,4};
        int a=20;
        int b=0;
        System.out.println(a/b);
        System.out.println(arr[20]);
        System.out.println("hi");
    }
    public static void main(String[] args)
    {
        excep e=new excep();
        try 
        {
                e.div(); 
        }
        catch(ArithmeticException e1)
        {
         System.out.println(e1);
        }
        catch(ArrayIndexOutOfBoundsException e2)
        {
          System.out.println(e2);
        }
    }
}