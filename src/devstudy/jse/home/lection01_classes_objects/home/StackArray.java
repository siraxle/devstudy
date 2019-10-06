package devstudy.jse.home.lection01_classes_objects.home;

public class StackArray {

    private int size;
    private int[] array;
    private int top;

    public StackArray(int s){
        size = s;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(int a){
        int i = ++top;
        array[i] = a;
        System.out.println("Top is " + top);
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }else {
            System.out.println("Top is " + top);
            return array[top--];
        }
    }

    public int pick(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }else {
            System.out.println("Top is " + top);
            return array[top];
        }
    }


    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        System.out.println(stack.size);
        System.out.println(stack.top);
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.pick());
    }


}
