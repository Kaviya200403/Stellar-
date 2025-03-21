class flower
{                                             
    void leaf()
    {
        System.out.println("flower");
    }
}

class sunflower extends flower
{
    void leaf()
    {
        super.leaf();                       
        System.out.println("sunflower");
    }
}

class rose extends flower
{
    void leaf()
    {                       
        System.out.println("rose");
    }
}

public class overriding
{
     public static void main(String[] args) 
{
    rose ob=new rose();
    sunflower o=new sunflower();
    o.leaf();
    ob.leaf();
    
}
}
