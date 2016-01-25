package com.vygutis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre teatras = new Theatre("Girstutis", 8, 12);

        List<Theatre.Seat> seatCopy = new ArrayList<>(teatras.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(teatras.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat is taken");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing teatras.seat");
        printList(teatras.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println(minSeat.getSeatNumber() + " - " + maxSeat.getSeatNumber() + "\n");

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

//        teatras.getSeats();
//        if(teatras.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Seat is taken");
//        }
//
//        if(teatras.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Seat is taken");
//        }
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("*************************************************");
    }

    public static void sortList(List<? extends  Theatre.Seat> list) {
        for (int i=0; i<list.size()-1; i++) {
            for (int j=i+1; j<list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }







}
