package stack;

public class Stack {
    private Node top;
    private int height;
    public Stack(int value){
        Node node = new Node(value);
        top = node;
        height = 1;
    }

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value =    value;
        }
    }
    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getTop(){
        System.out.println("Top value is " + top.value);
    }
    public void getHeight(){
        System.out.println("Height of the LinkedList Stack is "+ height);
    }

    public void push(int value){
        Node node = new Node(value);
        if(height==0) {
            top = node;
        }
        else{
            node.next = top;
        }
        top = node;
    }

    public Node pop(){
        if(height==0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

}
