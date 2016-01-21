package com.vygutis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String var4 = "this is private to main()";

        ScopeCheck scope = new ScopeCheck();
        scope.useInner();
        ScopeCheck.InnerClass inner = scope.new InnerClass();
        System.out.println("var3 = " + inner.var3);

//        System.out.println("scope var1 = " + scope.getVar1());
//        System.out.println(var4);
//        scope.timesTwo();
//        System.out.println("---------------------");
//
//        ScopeCheck.InnerClass innerClass = scope.new InnerClass();
//        innerClass.timesTwo();
    }
}
