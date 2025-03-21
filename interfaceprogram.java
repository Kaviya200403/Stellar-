interface A{
    void display();
}
class B implements A
{
  int n=10;
  public void display()
  {
   System.out.println(n);
  }
}

public class interfaceprogram
{
    public static void main(String[] args) {
      B o=new B();
      o.display();
    }
}
