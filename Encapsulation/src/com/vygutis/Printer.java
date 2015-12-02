package com.vygutis;

/**
 * Created by luksyvyg on 02/12/2015.
 */
public class Printer {

    private int tonerLevel = 100;
    private int pages;
    private boolean isDuplex;

    public Printer(int level, boolean duplex) {
        if(level>0 && level<=100) {
            this.tonerLevel = level;
        }
        this.pages = 0;
        this.isDuplex = duplex;
    }

    public void fillToner(int level) {
        this.tonerLevel += level;
        if(this.tonerLevel > 100) {
            this.tonerLevel = 100;
        }
        System.out.println(level + "% of toner added");
        System.out.println("The toner level is " + this.tonerLevel);
    }

    public void print(int sheets) {
        if(this.isDuplex) {
            this.pages += (sheets+1)/2;
        }else{
            this.pages += sheets;
        }
    }

    public int getPages() {
        return pages;
    }
}
