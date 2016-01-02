package com.vygutis;

public class Main {

    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(85123);
        myPhone.powerOn();
        myPhone.callPhone(85123);
        myPhone.answer();

        myPhone = new MobilePhone(12345);
        myPhone.powerOn();
        myPhone.callPhone(12345);
        myPhone.answer();
        myPhone.dial(123);
    }
}
