import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class CambiaPassword {
    public static void avvia(Scanner s){
        System.out.println();
        HashMap<String, String> users = new HashMap<>();
        boolean isRunning = true;
        String user;
        String oldPsw;
        String newPsw;

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

        while(isRunning){
            System.out.print("Utente: ");
            user = s.nextLine();
            if (users.containsKey(user)) {
                System.out.print("Password vecchia: ");
                oldPsw = s.nextLine();
                if(users.get(user).equals(oldPsw)){
                    System.out.print("Password nuova: ");
                    newPsw = s.nextLine();
                    try{
                        users.put(user, newPsw);
                        FileWriter writer = new FileWriter("credenziali.txt");
                        for(String k : users.keySet()){
                            writer.write(k + " " + users.get(k) + "\n");
                        }
                        writer.close();
                    } catch (Exception ex){
                        System.out.println("Errore");
                    }
                    isRunning = false;
                }
            }else{
                System.out.println("Utente non trovato");
            }

        }
    }

}