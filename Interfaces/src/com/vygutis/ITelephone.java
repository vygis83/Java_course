package com.vygutis;

/**
 * Created by Vygis on 02/01/2016.
 */
interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
