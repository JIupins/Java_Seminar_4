/*Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя. */

public class main1 {
    public static void main(String[] args) {
        myQueue myQueue = new myQueue();
        myQueue.enqueue(5);
        myQueue.enqueue(10);
        myQueue.enqueue(15);
        myQueue.enqueue(20);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.first());
        myQueue.print();
    }
}
