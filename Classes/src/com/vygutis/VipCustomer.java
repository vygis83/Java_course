package com.vygutis;

/**
 * Created by luksyvyg on 30/11/2015.
 */
public class VipCustomer {
    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("Vygis", 1000, "my@email.com");
    }
    public VipCustomer(String name, double limit) {
        this(name, limit, "unknown@email.com");
    }
    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }


    public String getName() {
        return name;
    }
    public double getLimit() {
        return limit;
    }
    public String getEmail() {
        return email;
    }
}
