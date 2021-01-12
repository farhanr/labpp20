import java.util.Scanner;

class Nomor1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
	
		int panjangStr = str.length();
		int hexa = panjangStr * panjangStr;
		int bagistr = panjangStr / 2;
		str = str.toUpperCase();
		str = str.replace(" ", "");
		str = str.substring(0, bagistr-1);

		String oct = String.format("%o", panjangStr);
		String hex = String.format("%x", hexa);

		System.out.print("#" + hex + str + palindrome(str) + oct);
		char symbol = String.valueOf(hex).charAt(0);
		if (symbol >= 'a' && symbol <= 'z') {
			System.out.print("?");
		} else{
			System.out.println("!");
		}

	}
	static String palindrome(String x){
		String poli = "";
		for (int i = x.length()-1 ;i > 0 ;i--) {
			String n = x.substring(i-1, i);
			poli += n;
		}
		
		return poli;	
	}
}