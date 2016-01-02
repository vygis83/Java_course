package com.vygutis;

/**
 * Created by Vygis on 02/01/2016.
 */
public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone already powered on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Deskphone is ringing " + phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
