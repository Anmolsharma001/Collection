public class zExeception
{
    public static void main(String[] args)
    {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        //System.out.println(4/0);
        System.out.println(5);
        System.out.println(6);
        try
        {
            System.out.println(4/0);

        }
        catch(ArithmeticException a)
        {
            System.out.println(a);
        }
    }
}
