package com.java.corejavasample;

public class SampleTwo {

    // Instance variable created and assigned value as 20
    // Inorder to access this outside of package, we are making this as public
    public int instanceVariable = 20;
    public String stringInstanceVariable = "Hello...!!! I am Of Type String Data Type";


    // Instance Method for Class SampleTwo
    // Inorder to access this outside of package, we are making this as public
    public int Modulo(int a,int b) {
        int mod = a % b;
        return mod;
    }
}
