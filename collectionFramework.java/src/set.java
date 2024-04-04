import java.util.*;
public class set   //no duplicate element add in a system
{
    public static void hashset()
    {
        HashSet<Integer>h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        System.out.println(h);
        h.add(1);
        System.out.println(h);
        //System.out.println(h.remove(1));
        System.out.println(h.size());
        System.out.println(h.contains(2));
    }
    public static void main(String[] args)
    {
        hashset();
    }
}
