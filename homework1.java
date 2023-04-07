// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.LinkedList;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        int listLength = createNumber("Введите колличество элементов в списке: ");

        LinkedList<Integer> mainList = new LinkedList<>();
        mainList = createLinkedList(listLength);

        LinkedList<Integer> finalList = new LinkedList<>();
        finalList = createReversList(mainList);

        System.out.println("\n\nЗначение списков равны:");
        System.out.println(mainList);
        System.out.println(finalList);
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

    public static LinkedList<Integer> createReversList(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        System.out.printf("\nСгенерирован перевернутый список элементов: ").print(newList);
        return newList;
    }
}