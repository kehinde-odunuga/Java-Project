package com.kehinde;

public class MethodCalling {
    public static void main(String[] args) {

        int num  = (int)(Math.random()*100);
        //System.out.println(num);

        MethodCalling met = new MethodCalling();
        met.go();
        met.go1();
        met.go2();
        met.go3();

    }

    public void go3() {
        System.out.println("Inside Go3 method");
    }

    public static void go() {
        System.out.println("Inside Go method");
        MethodCalling cal = new MethodCalling();
        cal.go3();
    }

    public void go1() {
        System.out.println("Inside Go1 method");
        go2();
    }

    public static void go2() {
        System.out.println("Inside Go2 method");
    }
}
