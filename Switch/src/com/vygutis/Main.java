package com.vygutis;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Value was smth else");
                break;
        }

        //challenge
        char raide = 'a';
        switch (raide) {
            case 'a':case 'b': case 'c': case 'd': case 'e':
                System.out.println("Pasirinkote raide " + raide);
                break;
            default:
                System.out.println("Kazkokia nesamone!");
                break;
        }

        String month = "April";
        switch (month.toLowerCase()) {
            case "january":case "february":case "april":
                System.out.println(month);
                break;
            default:
                System.out.println("Dar didesne nesamone!");
                break;
        }
    }
}
