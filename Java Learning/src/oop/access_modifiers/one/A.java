package oop.access_modifiers.one;

public class A {
    public static void main(String[] args) {
        B b = new B();
        //System.out.println(b.privateMessage);  doesn't work
    }
}
