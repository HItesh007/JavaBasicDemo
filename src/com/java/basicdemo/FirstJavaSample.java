package com.java.basicdemo;

import com.java.corejavasample.SampleTwo;

public class FirstJavaSample {



    int Sum(int a, int b) {
        int sum = a + b;
        return  sum;
    }

    int Mul(int a, int b) {
        int mul = a * b;
        return mul;
    }

    int Div(int a, int b) {
        int div = a / b;
        return div;
    }

    int Subtract(int a, int b) {
        int sub = a - b;
        return  sub;
    }


    void printData(String type, int x) {
        System.out.println(type + " : " + x);
    }

    public static void main(String [] args) {

        // Inorder to access the methods from FirstJavaSample class, create an object of it
        FirstJavaSample obj = new FirstJavaSample();
        SampleTwo s2 = new SampleTwo();
        SecondJavaSample second = new SecondJavaSample();

        // System.out.println("Sum : " + obj.Sum(10,12));
        // System.out.println("Subtract : " + obj.Subtract(20,12));
        // System.out.println("Div : " + obj.Div(100,20));
        // System.out.println("Mul : " + obj.Mul(10,20));

        obj.printData("Sum",obj.Sum(10,12));
        obj.printData("Subtract",obj.Subtract(20,12));
        obj.printData("Div",obj.Div(100,20));
        obj.printData("Mul",obj.Mul(10,20));

        second.Something();
        obj.printData("Modulo",s2.Modulo(100,6));

        // We are calling instance variable which is declared in SampleTwo Class which is of Type Integer
        obj.printData("Value Of Instance Variable At Class SampleTwo Is",s2.instanceVariable);

        // We are calling instance variable which is declared in SampleTwo Class which is of Type String
        System.out.println("Value Of Instance Variable At Class SampleTwo Is : " + s2.stringInstanceVariable);
    }
}
