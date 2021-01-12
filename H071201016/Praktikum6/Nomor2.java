import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
            String line = scan.nextLine();
            String[][] n = new String[4][4];

           
            line = newLine(line);
            int count = 0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    n[i][j] = "";
                    for (int k = 0; k < charArray(line); k++) {
                        if (count < line.length()) {
                            n[i][j] += line.charAt(count);
                        }else{
                            n[i][j] += '?';
                        }
                        count++;
                    }
                    System.out.print(n[i][j] + " ");
                }
                System.out.println();
            }
    }
    
    static String newLine(String line){
        String newline = new String ();
        char genap;
        int ganjil;
        char [] charLine= line.toCharArray();
        for (int i = 0; i < charLine.length; i++) {
            if(i%2 !=0){
                ganjil = Character.codePointAt(charLine, i);
                newline += ganjil;
            }else{
                genap = line.charAt(i);
                newline += genap;
            }
        }
        return newline;

    }
    static int charArray(String kata) {
        int character = 0;
        while ((16 * character) < kata.length()){
            character++;
        }
        return character;
    }
    
}

