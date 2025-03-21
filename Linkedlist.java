import java.util.*;
public class Linkedlist 
{
    public static void main(String[] arg)
    {
      LinkedList<Integer>List=new LinkedList<>();
      List.add(10);
      List.addFirst(90);
      List.addLast(20);
      System.out.println("Linkedlist:"+List);
      List.remove(1);
      System.out.println(List);
    }
}
