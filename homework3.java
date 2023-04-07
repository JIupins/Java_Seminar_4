// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        int listLength = createNumber("Введите колличество элементов в списке: ");

        LinkedList<Integer> mainList = new LinkedList<>();
        mainList = createLinkedList(listLength);

        findSumOfElementsOfList(mainList);
    }

    public static Integer createNumber(String frase) {
        Scanner iScan = new Scanner(System.in);
        System.out.printf("\n%s", frase);
        int num = iScan.nextInt();
        return num;
    }

    public static LinkedList<Integer> createLinkedList(int len) {
        Scanner iScan = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println();
        for (int i = 0; i < len; i++) {
            System.out.print("Введите элемент списка (целое число): ");
            list.add(iScan.nextInt());
        }
        System.out.printf("\nСгенерирован список элементов: ").print(list);

        return list;
    }

    public static void findSumOfElementsOfList(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        int sum = 0;
        for (int i : list) {
            sum += iterator.next();
        }
        System.out.printf("\nСумма элементов массива равна: %d", sum);
    }
}