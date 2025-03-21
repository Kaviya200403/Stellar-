class human
{
    private String name="kaviya";
    private int regno=73;
    String showing()
    {
    return name;
    }
    int displaying()
    {
        return regno;
    }
}



public class encapsulation 
{
    public static void main(String[] args) 
    {
        human h=new human(); 
        System.out.println(h.displaying());
        System.out.println(h.showing());
    }
}
