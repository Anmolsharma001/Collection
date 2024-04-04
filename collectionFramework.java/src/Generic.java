import java.util.*;
public class Generic
{
    public static void main(String[] args)
    {
        //ye jo list h ye generic hai or isme
        // ye hi declare honga or vo hi chalenga
     List<String>l=new ArrayList<>();
     l.add("Anmol");
     l.add("sayyam");

     //ye class- obj type h or ye safe nhi or
        // isme int,doub.,char kuch bhi ddal do
     List anotherList= new ArrayList<>();
     anotherList.add(1);
     anotherList.add(12.34);
     anotherList.add("champ");

     //ye printing ke liye hai
        System.out.println(l); //generic...
        System.out.println(anotherList);  //class-obj types...

    }
}
