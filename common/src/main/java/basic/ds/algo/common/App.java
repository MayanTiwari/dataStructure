package basic.ds.algo.common;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start" );
        StackImp<Integer> stack = new StackImp<Integer>();
        stack.push(10);
        stack.push(20);
        Integer res = stack.pop();
        System.out.println(null == res ? res.toString() : "Empty");
    }
}
