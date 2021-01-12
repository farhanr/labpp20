import java.util.Scanner;
class Nomor2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int [][] matriksA = new int[a][b];
		int [][] matriksB = new int[b][c];
		int [][] hasil = new int[a][c];
		int jumlah = 0;

		System.out.println("Masukkan Matriks A");
		for (int i = 0;i < matriksA.length ;i++ ) {
		 	for (int j = 0;j < matriksA[i].length ;j++ ) {
		 		matriksA[i][j] = scan.nextInt();
		 	}
		 }
		System.out.println("Masukkan Matriks B"); 
		for (int i = 0;i < matriksB.length ;i++ ) {
		 	for (int j = 0;j < matriksB[i].length ;j++ ) {
		 		matriksB[i][j] = scan.nextInt();
		 	}
		}		
		for (int i = 0; i < a; i++) {
        	for (int j = 0; j < c; j++) {
         		for (int k = 0; k < b; k++) {
            		jumlah = jumlah + matriksA[i][k] * matriksB[k][j];
            	}
            	hasil[i][j] = jumlah;
            	jumlah = 0;
            }
        } 		
        System.out.println("Hasil perkalian matriks:");
      	for (int i = 0; i < a; i++) {
        	for (int j = 0; j < c; j++) {
          		System.out.print(hasil[i][j] + " ");
        	}
        	System.out.println();
        }	
	}
}
