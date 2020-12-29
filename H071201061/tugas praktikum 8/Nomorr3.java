import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Nomorr3 {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);
        FileWriter dataWriter = null;
        PrintWriter printWriter = null;

        try{
            System.out.print("Nama File = ");
            String data = inputt.nextLine() + ".txt";
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> nim = new ArrayList<>();
            ArrayList<String> akt = new ArrayList<>();

            System.out.print("Input Jumlah Asistensi  =");
            int numberAssistance = inputt.nextInt();
            inputt.nextLine();

            int i;
            for (i = 0; i < numberAssistance; i++) {
                System.out.print("NAMA = ");
                name.add(inputt.nextLine());

                System.out.print("NIM = ");
                nim.add(inputt.nextLine());

                System.out.print("ANGKATAN = ");
                akt.add(inputt.nextLine());
            }

            dataWriter = new FileWriter (data);
            printWriter = new PrintWriter(dataWriter);

            printWriter.printf("+--------------------------------+--------------------+-----------+\n");
            printWriter.printf("|NAMA                            |NIM                 |ANGKATAN   |\n");
            printWriter.printf("+--------------------------------+--------------------+-----------+\n");
            int j;
            for (j = 0; j < numberAssistance; j++) {    
                printWriter.printf("| %-30s | %-18s | %-8s  |\n", name.get(j), nim.get(j), akt.get(j));
            }
            printWriter.printf("+--------------------------------+--------------------+-----------+\n");

        } catch (IOException ioe){
            System.out.println("GAGAL");
        } finally {
            try {
                if (printWriter != null) {
                    System.out.println("BERHASIL");
                    printWriter.close();
                } 
                if (dataWriter != null) {
                    dataWriter.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
} 
    

