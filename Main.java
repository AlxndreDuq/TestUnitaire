import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faites une opération (ex : a * b) : ");
        String operation = sc.nextLine();

        operation = operation.replaceAll("\\s+", "");

        char operator = 0;
        int index = -1;

        for (char op : new char[]{'+', '-', '*', '/'}) {
            index = operation.indexOf(op);
            if (index != -1) {
                operator = op;
                break;
            }
        }

        if (operator == 0 || index == -1) {
            throw new Exception("Pas d'opérateur valide trouvé");
        }

        String left = operation.substring(0, index);
        String right = operation.substring(index + 1);

        int a;
        int b;

        try{
            a = Integer.parseInt(left);
            b = Integer.parseInt(right);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

        switch (operator){
            case '+':
                System.out.println(Calculatrice.addition(a, b));
                break;

            case '-':
                System.out.println(Calculatrice.soustraction(a, b));
                break;

            case '*':
                System.out.println(Calculatrice.multiplier(a,b));
                break;

            case '/':
                System.out.println(Calculatrice.diviser(a,b));
                break;
        }

    }
}
