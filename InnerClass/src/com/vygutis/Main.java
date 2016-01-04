package com.vygutis;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " paspaustas");
            }
        });
        listen();

//        GearBox honda = new GearBox(6);

        //GearBox.Gear first = honda.new Gear(1, 12.3);    -- THIS IS THE CORRECT WAY WHEN GEAR CLASS IS PUBLIC
//        GearBox.Gear second = new GearBox.Gear(2, 15.4);
//        GearBox.Gear third = new honda.Gear(3, 17.8);

//        honda.operateClutch(true);
//        honda.changGear(1);
//        honda.operateClutch(false);
//        System.out.println(honda.wheelSpeed(1000));
//        honda.changGear(2);
//        System.out.println(honda.wheelSpeed(3000));
//        honda.operateClutch(true);
//        honda.changGear(3);
//        System.out.println(honda.wheelSpeed(6000));
//        honda.operateClutch(false);
//        System.out.println(honda.wheelSpeed(6000));
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
