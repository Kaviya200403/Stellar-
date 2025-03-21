class simple
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
}

public class overloading
{
 public static void main(String[] args) 
{
    simple w=new simple();
    System.out.println(w.add(34,67));
    System.out.println( w.add(90.56,56.90));
}   
}