import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String user;
        String psw;
        int att = 3;
        boolean log = false;
        boolean isRunning = true;
        int scelta = 0;

        while(!log){
            System.out.print("Nome utente: ");
            user = s.nextLine();
            System.out.print("Password: ");
            psw = s.nextLine();

            try {
                Scanner reader = new Scanner(new File("credenziali.txt"));
                String trueUser = reader.nextLine();
                String truePsw = reader.nextLine();
                reader.close();

                if(user.equals(trueUser) && psw.equals(truePsw)){
                    System.out.println("Accesso effetuato");
                    System.out.println("======== TexOS ========\n");
                    log = true;
                }else if(att == 1){
                    System.out.println("Tentativi finiti");
                    break;
                }else{
                    att--;
                }
            } catch (Exception ex){
                System.out.println("Errore!");
            }
        }

        if(log){
            while(isRunning){
            System.out.println("[1] Calcolatrice");
            System.out.println("[2] Cambia password");
            System.out.println("[3] Esci");
            System.out.print("Selezione: ");
            scelta = s.nextInt();
            s.nextLine();

            switch(scelta){
                case 1 -> Calc.avvia(s);
                case 2 -> System.out.println("In sviluppo");
                case 3 -> isRunning = false;
                default ->
                    System.out.println("Scelta non esistente");
            }
        }
        }
    }    
}
