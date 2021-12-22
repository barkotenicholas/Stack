import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void enqueue(Employee employee){

        if(back == queue.length){
            Employee[] newarray = new Employee[back * 2];
            System.arraycopy(queue,0,newarray,0, queue.length);
            queue = newarray;
        }
        queue[back] = employee;
        back++;
    }

    public Employee dequeue(){
        if(Size() == 0 ){
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (Size() == 0){
            front = back = 0;
        }
        return employee;
    }
    public Employee peek(){
        if(Size() == 0){
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void print(){
        for(int i = front; i<back;i++){
            System.out.println(queue[i]);
        }
    }

    public int Size(){return back-front;}
}
