import java.util.*;
public class ds 
{
    public static void main(String[] arg)
    {
        Queue<Integer>queue=new PriorityQueue<>();
        queue.add(90);
        queue.add(80);
        queue.add(70);
        System.out.println("queue:"+queue);
        System.out.println("poll:"+queue.poll());
        System.out.println("queue after poll:"+queue);
    }
}
