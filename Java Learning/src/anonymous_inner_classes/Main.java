package anonymous_inner_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        /*
            an inner class without a name
            helps to avoid cluttering code with
            class names. Great for listeners

        */

        Greeting greeting = new Greeting() {
            @Override
            public void welcome() {
                System.out.println("hello bro");
            }
        };
        greeting.welcome();


        //with interface:
        // an anonymous inner class that implements interface is instantiated
        // normally given as parameter in a method call
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Action performed code here
            }
        };
    }
}