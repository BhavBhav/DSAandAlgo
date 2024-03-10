package queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;
    public Queue(int value){
        Node node = new Node(value);
        first = node;
        last = node;
        length = 1;

    }

    class Node {
        int value;
        Node next;
        Node(int value) {
        this.value = value;
        }
    }
    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getFirst(){
        System.out.println("First value is " + first.value);
    }
    public void getLast(){
        System.out.println("Last value is " + last.value);
    }
    public void getLength(){
        System.out.println("Length of Queue is " + length);
    }
    public void enqueue(int value){
        Node node = new Node(value);
        if(length==0){
            first=node;
            last=node;
        }else{
            last.next = node;
            last = node;
            length++;
        }
    }

    public Node dequeue(){
        if(length==0) return null;
        Node temp = first;
        if(length==1){
            first = null;
            last = null;
        } else{
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
