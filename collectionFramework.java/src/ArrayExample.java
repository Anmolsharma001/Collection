import java.util.ArrayList;

public class ArrayExample
{
    public static void ArrayExample()
    {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(12);
        a.add(13);
        a.add(14);
        System.out.println(a);
        System.out.println(a.get(1));
        a.set(1,25);
        System.out.println(a);
        System.out.println(a.contains(20));
        System.out.println(a.size());
    }
    public static void main(String[] args)
    {
       ArrayExample();
    }
}