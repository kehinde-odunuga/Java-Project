package inheritance;

public class Son extends Father{
    public static void main(String[] args) {
        Son sola = new Son();
        sola.playSoccer(4, false);
    }

    public void playSoccer(int type, boolean condition){
        System.out.println("Son plays soccer");
    }
}
