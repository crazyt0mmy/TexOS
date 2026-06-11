import java.util.Scanner;
import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();
        String user;
        String psw;
        int att = 3;
        boolean log = false;
        boolean isRunning = true;
        int scelta = 0;

        try {
            Scanner reader = new Scanner(new File("credenziali.txt"));
            while(reader.hasNextLine()){
                String[] parti = reader.nextLine().split(" ", 2);
                users.put(parti[0], parti[1]);
            }
            reader.close();
        } catch (Exception ex){
            System.out.println("Errore!");
        }

        while(!log){
            System.out.print("Nome utente: ");
            user = s.nextLine();
            System.out.print("Password: ");
            psw = s.nextLine();

            try {

                if(users.containsKey(user)  && users.get(user).equals(psw)){
                    System.out.println("Accesso effetuato");
                    System.out.print("======== TexOS ========\n");
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
            System.out.println();
            System.out.println("[1] Calcolatrice");
            System.out.println("[2] Cambia password");
            System.out.println("[3] Apri cmd");
            System.out.println("[9] Esci");
            System.out.print("Selezione: ");
            scelta = s.nextInt();
            s.nextLine();
            
            switch(scelta){
                case 1 -> CalcGUI.avvia();
                case 2 -> CambiaPassword.avvia(s);
                case 3 -> Cmd.avvia(s);
                case 9 -> isRunning = false;
                default ->
                    System.out.println("Scelta non esistente");
            }
        }
        }
    }    
}