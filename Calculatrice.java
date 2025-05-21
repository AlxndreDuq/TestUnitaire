public class Calculatrice {

    public static int addition(int a, int b){
        return a + b;
    }

    public static int soustraction(int a, int b){
        return a - b;
    }

    public static int multiplier(int a, int b){
        return a * b;
    }

    public static double diviser(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("On ne peut pas diviser par 0");
        }
        return (double) a / b;
    }
}
