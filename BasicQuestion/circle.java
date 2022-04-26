package AllwithDescription.test;

//There are n people in a circle, and the numbers are arranged in order. Start counting from the first person (counting from 1 to 3),
//all the people who report to 3 leave the circle and ask who is the original number left at the end.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        circle(13);
    }
    public static void circle(int n) {
        int people[] = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = 1;
        }
        int index = 0, sum = 0, count = n;
        while (count > 1) {
            if (people[index] == 1) {
                sum++;
                if (sum == 3) {
                    System.out.println(index + 1 + ": is out");
                    people[index] = 0;
                    sum = 0;
                    count--;
                }
            }
            index++;
            if (index == n) {
                index = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (people[i] == 1) {
                System.out.println(i + 1 + "is the last one");
            }
        }
    }


    public static void circle1() {
        System.out.println("Type how man number of people in here: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> man = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            man.add(i + 1);
        }
        ListIterator<Integer> iterator = null;
        int k = 1;
        do {
            iterator = man.listIterator();
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                if (k++ % 3 == 0) {
                    System.out.println("The" + next + "is left");
                    iterator.remove();
                    k = 1;
                }
            }
        } while (man.size() > 1);
        System.out.println("the last one: " + man);
    }
}
