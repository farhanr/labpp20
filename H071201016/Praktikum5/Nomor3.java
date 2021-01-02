import java.util.Scanner;

class Nomor3{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		myDay(n);

	}
	static void myDay(int a){
		int tahun = a / 360;
		int hari = 0;
		int bulan = 0;
		if (a >= 30 && a < 365) {
			hari = a % 30;
			bulan = a / 30;
		}
		if (a >= 365 && a % 365 < 30){
			hari = a % 365;
			bulan = 0;
		}
		else if (a >= 365 && a % 365 >= 30) {
			hari = (a % 365) % 30;
			bulan = (a % 365) / 30;
		}
		System.out.println(tahun + " tahun");
		System.out.println(bulan + " bulan");
		System.out.println(hari + " hari");

	}
}
