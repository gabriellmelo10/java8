package br.com.codandosimples;

interface Sayable{
    void say();
}
public class Main {

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = Main::saySomething;
        // Calling interface method
        sayable.say();
    }

    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
}