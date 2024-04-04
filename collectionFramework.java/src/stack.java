import java.util.Stack;
public class stack
{
    public static void stackExample()
    {
        Stack<String>st=new Stack<>();
        st.push("pw");
        st.push("skill");
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.push("wallah"));
        System.out.println(st.size());
    }

    public static void main(String[] args)
    {
      stackExample();
    }
}
