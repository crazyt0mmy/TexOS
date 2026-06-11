import java.util.Scanner;

public class Calc {
    public static void avvia(Scanner s){
        System.out.println();
        String x;
        String y;
        String opp;

        System.out.print("Operando 1: ");
        x = s.nextLine();
        System.out.print("Operatore (+, -, *, /): ");
        opp = s.nextLine();
        System.out.print("Operando 2: ");
        y = s.nextLine();
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);

        switch(opp){
            case "+" -> System.out.println("Risultato: " + (a + b)); 
            case "-" -> System.out.println("Risultato: " + (a - b)); 
            case "*" -> System.out.println("Risultato: " + (a * b)); 
            case "/" -> {
                if(b == 0){
                    System.out.println("Impossibile dividere per 0");
                } else {
                    System.out.println("Risultato: " + (a / b));
                }
            }
        }
    }
}