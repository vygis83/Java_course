package com.vygutis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre teatras = new Theatre("Girstutis", 8, 12);
        List<Theatre.Seat> seatList = new ArrayList<>(teatras.getSeats());
        Collections.reverse(seatList);
        printList(seatList);

        if(teatras.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat is taken");
        }

        if(teatras.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat is taken");
        }

        List<Theatre.Seat> priceSeats = new ArrayList<>(teatras.getSeats());
        priceSeats.add(teatras.new Seat("B00", 13.00));
        priceSeats.add(teatras.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

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
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("*************************************************");
    }

}
