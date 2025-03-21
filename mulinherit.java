interface A 
{
    int i=2000;
    void show();
}

interface B
{
    int a=6000;
    void display();
}

interface c
{
    int b=600000;
    void s();
}

class D
{
    void demo(){
        System.out.println("hello");
    }
}

class m extends D implements A,B,c
{
    public void show(){
        System.out.println(i);
    }
    public void display(){
        System.out.println(a);
    }
    public void s(){
        System.out.println(b);
    }
}

public class mulinherit
{
    public static void main(String arg[]){
        m ob=new m();
        ob.demo();
        ob.show();
        ob.display();
        ob.s();
    }
}