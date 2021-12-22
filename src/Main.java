public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(10);
//        ArrayStack arrayStack = new ArrayStack(10);
//        arrayStack.push(new Employee("Jane","Jones",10));
//        arrayStack.push(new Employee("John","Doe",11));
//        arrayStack.push(new Employee("Mary","Smith",12));
//        arrayStack.push(new Employee("Mike","Wilson",13));
//        arrayStack.push(new Employee("Bill","End",123));
//
////        arrayStack.printStack();
//
//        System.out.println(arrayStack.peek());
//
//        arrayStack.pop();
//
//        System.out.println(arrayStack.peek());
//

        arrayQueue.enqueue(new Employee("Jane","Jones",10));
        arrayQueue.enqueue(new Employee("John","Doe",11));
        arrayQueue.enqueue(new Employee("Mary","Smith",12));
        arrayQueue.enqueue(new Employee("Mike","Wilson",13));
        arrayQueue.enqueue(new Employee("Bill","End",123));

        arrayQueue.print();
        System.out.println();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.print();


        System.out.println(arrayQueue.peek());
    }
}
