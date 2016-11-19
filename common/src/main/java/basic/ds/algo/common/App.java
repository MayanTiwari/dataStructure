package basic.ds.algo.common;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start" );
        StackImp<Integer> stack = new StackImp<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(90);
        stack.push(100);
        System.out.println("Pop" + stack.pop().toString());
        System.out.println("Pop" + stack.pop().toString());
        System.out.println("Pop" + stack.pop().toString());
        System.out.println("Pop" + stack.pop().toString());
        System.out.println("Pop" + stack.pop().toString());
        System.out.println(stack.Count);
       
        
    }
}
