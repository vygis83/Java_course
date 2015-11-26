package com.vygutis;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int count = 1;
//        while (count <= 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);

        int number = 5;
        int last = 20;
        int total = 0;
        while (number <= last) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
            total++;
            if (total >= 5) {
                break;
            }
        }
        System.out.println("The total of even numbers: " + total);
    }

    public static boolean isEvenNumber(int myNum) {
        return  (myNum % 2) == 0;
    }
}
