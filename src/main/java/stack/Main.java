package stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.getTop();
        stack.getHeight();
        stack.push(3);
        stack.push(2);
        stack.printStack();
        stack.pop();
        stack.printStack();
    }
}