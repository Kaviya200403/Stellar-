import java.util.*;
public class addlist {
    public static void main(String arg[])
    {
        List<Integer> List=new ArrayList<>();
        List.add(1);
        List.add(5);
        List.add(1);
        System.out.println("List:" +List);
        List.remove(2);
        System.out.println("After List removed :"+List);
    }
}


