package queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.printQueue();
        q.getFirst();
        q.getLast();
        q.getLength();
        System.out.println("Dequeqing: " + q.dequeue().value);
        System.out.println("Dequeqing: " + q.dequeue().value);
        System.out.println("Dequeqing: " + q.dequeue().value);
        System.out.println("Dequeqing: " + q.dequeue().value);
    }
}