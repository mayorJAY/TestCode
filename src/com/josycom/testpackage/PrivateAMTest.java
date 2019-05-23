package com.josycom.testpackage;

public class PrivateAMTest {

    public void show(){
        Main obj = new Main();
        //System.out.println(main.fig); //If this statement is uncommented, it will cause a compile time error
        //because a data type marked as Private cannot be accessed from another class
    }
}
