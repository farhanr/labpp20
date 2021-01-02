import java.util.Scanner;

class Nomor1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int hasil = cariFPB(a, b);

		System.out.println("FPB dari " + a + " dan " + b + " adalah : " + hasil);
		}
		static int cariFPB(int a, int b){
		int index = 0;
		int fpb = 0;
		index = a >= b ? a : b;		
			for (int i = 1;i < index ;i++ ) {
				if (a % i == 0 && b % i == 0) {
					if(i < i+1){
						fpb = i;
					}
				}
			}
			return fpb;
		}
	}
	



