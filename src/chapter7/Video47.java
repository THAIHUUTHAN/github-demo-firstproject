package chapter7;

public class Video47 {
    public static void main(String[] args) {
        Animal a = new BabyDog1();
        a.eat();

        Animal b = new BabyCat1();
        b.eat();
    }

}

class Animal {

    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog is eating..");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("cat is eating..");
    }
}

class BabyCat1 extends Cat {

}

class BabyDog1 extends Dog {

}
