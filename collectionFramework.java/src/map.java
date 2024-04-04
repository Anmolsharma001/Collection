import java.util.HashMap;
public class map
{
    public static void map()
    {
        HashMap<Integer,String>mp=new HashMap<>();
        mp.put(1,"anmol");
        mp.put(2,"jiya");
        mp.put(3,"eshan");
        mp.put(4,"dipaa");
        mp.putIfAbsent(1,"giva");
        System.out.println(mp);
        System.out.println(mp.containsKey(1));
        System.out.println(mp.containsValue("dipaa"));

    }
    public static void main(String[] args) {
     map();
    }
}
