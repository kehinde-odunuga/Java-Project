package inheritance;

public class Dog extends Animal{
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }

    public void sound(){
        System.out.println("whow whow!!!");
    }
}
