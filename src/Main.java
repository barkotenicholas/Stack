public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(new Employee("Jane","Jones",10));
        arrayStack.push(new Employee("John","Doe",11));
        arrayStack.push(new Employee("Mary","Smith",12));
        arrayStack.push(new Employee("Mike","Wilson",13));
        arrayStack.push(new Employee("Bill","End",123));

//        arrayStack.printStack();

        System.out.println(arrayStack.peek());

        arrayStack.pop();

        System.out.println(arrayStack.peek());


    }
}
