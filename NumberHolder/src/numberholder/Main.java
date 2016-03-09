package numberholder;

public class Main {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.anInt = 10;
        numberHolder.aFloat = 1.25f;
        
        System.out.println("numberHolder.anInt = " + numberHolder.anInt);
        System.out.println("numberHolder.aFloat = " + numberHolder.aFloat);
    }
}