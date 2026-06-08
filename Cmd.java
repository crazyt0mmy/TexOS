import java.util.Scanner;

public class Cmd {
    public static void avvia(Scanner s){
        String input;
        boolean isRunning = true;
            
        System.out.println("Cmd");
        while(isRunning){
            System.out.print("User ");
            input = s.nextLine();
            String[] parti = input.split(" ", 2);

            switch(parti[0]){
                case "help" -> {
                    System.out.println("ECHO               Scrive testo dopo il comando");
                    System.out.println("CLEAR              Pulisce il terminale");
                    System.out.println("EXIT               Torna al menù");
                }
                case "echo" -> {
                    if(parti.length < 2){
                        System.out.println("Bisogna scrivere qualcosa dopo il comando");
                    } else {
                        System.out.println(parti[1]);
                    }
                }
                case "clear" -> {
                    for(int i = 0; i < 50; i++){
                        System.out.println();
                    }
                }
                case "exit" -> isRunning = false;
                default -> System.out.println("Comando non riconosciuto");
            }
        }
    }
}
