public class zExeception1
{
    public static void main(String[] args)
    {
       int[] arr={1,2};
       try
       {
           System.out.println(arr[3]);
       }
       catch(ArrayIndexOutOfBoundsException ae)
       {
           System.out.println(ae);
       }
    }
}
