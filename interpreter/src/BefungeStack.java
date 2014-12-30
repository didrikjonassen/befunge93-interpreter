import java.util.Stack;

/**
 * Created by didrik on 30.12.2014.
 */
public class BefungeStack {
    Stack<Long> stack;

    public BefungeStack(){
        stack = new Stack();
    }

    void push(Long l){
        stack.push(l);
    }

    Long pop(){
        return stack.size() == 0 ? (long) 0 : stack.pop();
    }

    Long peek(){
        return stack.size() == 0 ? (long) 0 : stack.peek();
    }
}
