import java.util.*;
public class orderelement 
{
    public static void main(String arg[])
    {
        List<String> List=new ArrayList<>();
        List.add("apple");
        List.add("banana");
        List.add("apple");
        System.out.println("List " +List);
        List.remove("apple");
        System.out.println("After List removed "+List);
    }
}
