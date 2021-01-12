import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Mainmain{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String p = scan.nextLine();

        try{
            FileReader x = new FileReader("E:\\" + s + ".txt");
            BufferedReader source = new BufferedReader(x);
            FileWriter n = new FileWriter("E:\\" + p + ".txt");
            BufferedWriter dest = new BufferedWriter(n);

            String str;

            while((str = source.readLine()) != null){
                dest.write(str);
                dest.newLine();

            }
            System.out.println("Berhasil");
            source.close();    
            dest.close();
        }
        catch(IOException e) {
            System.out.println("Gagal");
        }
    }
}