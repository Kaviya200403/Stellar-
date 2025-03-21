public class throwexception
{
    void check(int age){
    if(age<18)
    {
        throw new ArithmeticException("age must be greater");
    }
    else{
        System.out.println("access granted");
    }
    }
public static void main(String[] args)
{
  throwexception n =new throwexception();
  n.check(19);    
  System.out.println("hello accesss ");
}
} 