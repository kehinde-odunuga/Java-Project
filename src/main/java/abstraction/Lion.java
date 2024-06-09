package abstraction;

public class Lion extends Animal{
    public static void main(String[] args) {
        Lion africanLion = new Lion();
        africanLion.sound();
        africanLion.eat();
    }
    @Override
    public void sound() {
        System.out.println("Lion roars");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats zebras");
    }
}
