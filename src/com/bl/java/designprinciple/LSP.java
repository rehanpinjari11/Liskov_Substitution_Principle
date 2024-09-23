package com.bl.java.designprinciple;

class Bird {

    public void eat() {
        System.out.println("Bird is eating");
    }
}

class Sparrow extends Bird{

    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
class Penguin extends Bird {

    public void swim() {
        System.out.println("Penguin is swimming");
    }
}

public class LSP {

    public static void main(String[] args)
    {
		Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

		sparrow.eat();
		((Sparrow) sparrow).fly(); // casting

        penguin.eat();
        ((Penguin) penguin).swim(); // casting

    }

}
