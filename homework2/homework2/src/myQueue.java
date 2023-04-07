/*Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя. */

import java.util.LinkedList;
import java.util.Scanner;

public class myQueue {
    private LinkedList<Integer> mainList = new LinkedList<>();
    private Scanner iScan = new Scanner(System.in);

    public void enqueue(int value) {
        mainList.addLast(value);
    }

    public int dequeue() {
        return mainList.pollFirst();
    }

    public int first() {
        if (!mainList.isEmpty()) {
            return mainList.peek();

        }
        System.out.print("Элементов в очереди: ");
        return 0;
    }

    public void print() {
        if (!mainList.isEmpty()) {
            System.out.printf("Очередь содержит следующие элементы: ").println(mainList);

        } else {
            System.out.print("Очередь пуста!");
        }
    }
}