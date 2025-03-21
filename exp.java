public class exp 
{
    public static void main(String[] args) 
    {
        int age=15;
        try
        {
            if(age<18)
            {
                throw new AgeException("age must be greater");
            }
        }
        catch(Exception e)
        {
            System.err.println("hello");
        }
    }
}
