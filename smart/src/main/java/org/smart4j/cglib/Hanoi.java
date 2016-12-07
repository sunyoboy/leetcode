package org.smart4j.cglib;

/**
 * Created by root on 12/2/16.
 */
public class Hanoi {
    public static void main(String[] args) {
        // hanoi(1, 'A', 'B', 'C');
        // hanoi(2, 'A', 'B', 'C');
        hanoi(10, 'A', 'B', 'C');
    }


    public static void hanoi(int num, char src, char dest, char interm) {
        if(num == 1) {
            System.out.println("move " + num + " disk from " + src + " to " + dest);
        } else {
            hanoi(num-1, src, interm, dest);

            System.out.println("move " + num + " disk from " + src + " to " + dest);

            hanoi(num-1, interm, dest, src);
        }
    }
}
