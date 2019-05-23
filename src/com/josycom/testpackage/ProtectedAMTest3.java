package com.josycom.testpackage;

public class ProtectedAMTest3 {


    public static void print(){
        ProtectedAMTest1 obj = new ProtectedAMTest1();
        obj.message();
        //Even though it is protected, calling message() from a different class is still works fine
        //but it cannot work if its accessed from a different package
    }
}
