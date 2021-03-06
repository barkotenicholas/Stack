import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {

        stack = new Employee[capacity];

    }
    public void push(Employee employee){
        if(top == stack.length){
            //resize array
            Employee[] newarray= new Employee[top * 2];
            System.arraycopy(stack,0,newarray,0,stack.length);
            stack = newarray;
        }

        stack[top++] = employee;
    }
    public Employee pop (){

        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;

    }
    public int size(){
        return top;
    }
    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void printStack(){
        for (int i = top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
