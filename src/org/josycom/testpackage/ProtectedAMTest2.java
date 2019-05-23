package org.josycom.testpackage;
import com.josycom.testpackage.*;

public class ProtectedAMTest2 {

    public static void main(){
        ProtectedAMTest1 test = new ProtectedAMTest1();
        //test.message();
        //If the line above is uncommented, it will cause an error because message() in the class ProtectedAMTest1 is a assigned the Protected
        //access modifier which makes it inaccessible from another package
    }
}
