import java.util.Scanner;
import java.io.*;

public class CambiaPassword {
    public static void avvia(Scanner s){
        System.out.println();
        boolean isRunning = true;
        String oldPsw;
        String newPsw;

        try{
            Scanner reader = new Scanner(new File("credenziali.txt"));
            String trueUser = reader.nextLine();
            String truePsw = reader.nextLine();
            reader.close();

            while(isRunning){
                System.out.print("Password vecchia: ");
                oldPsw = s.nextLine();

                if(oldPsw.equals(truePsw)){
                    FileWriter writer = new FileWriter("credenziali.txt");
                    System.out.print("Password muova: ");
                    newPsw = s.nextLine();

                    writer.write(trueUser + "\n");
                    writer.write(newPsw + "\n");
                    writer.close();
                    isRunning = false;
                }else{
                    System.out.println("Password errata");
                }
            }

        } catch (Exception ex){
            System.out.println("Errore apertura del file");
        }
    }
    
}