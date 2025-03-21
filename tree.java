import java.util.TreeSet;

public class tree 
{
    public static void main(String[] arg)
    {
        TreeSet<String>treeset=new TreeSet<>();
        treeset.add("apple");
        treeset.add("banana");
        treeset.add("apple");
        treeset.add("watermelon");
        System.out.println(treeset);
    }
}
