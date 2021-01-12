import java.util.Scanner;
class Nomor1{
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		int n = scan.nextInt();
		int [] angka = new int[n];

		for (int i = 0;i < angka.length ;i++ ) {
			angka[i] = scan.nextInt();
		}
		for (int i = 0;i < n ;i++ ) {
			for (int j = i + 1;   j < n ;j++ ) {
				if (angka[i] % angka[j] == 0 || angka[j] % angka[i] == 0) {
					
					continue;
				}
				else{

					System.out.print(angka[i] + " ");
					System.out.println(angka[j]);
				}
			}
		}
	}
}
