import java.util.*;
public class queue
{
    static void queueExample()
    {
        LinkedList<String>q=new LinkedList<>();
        q.offer("adah");
        q.offer("ki");
        q.offer("adah");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.isEmpty());
        q.offer("jallaaa");
        System.out.println(q);
    }

    public static void main(String[] args) {
        queueExample();
    }
}