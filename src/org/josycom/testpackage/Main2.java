package org.josycom.testpackage;
import com.josycom.testpackage.*;
public class Main2 {


    public static void main(){
        //DefaultAMTest1 obj = new DefaultAMTest1();
        //obj.test();
        //If these two lines above are uncommented, it will cause an error because the test() in the class DefaultAMTest1 is not given
        //an access modifier which makes it default and so it cannot be accessed from another package. It can only be accessed within the package
    }

    public static void calc(){
        Main obj = new Main();
        obj.main(); //main() can be called from any class or any package because it is marked as Public
    }
}
