import java.util.Scanner;
import java.util.Random;

class PotonganProgram{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		String serialNumber = generateSerial(n, m);
		System.out.println(serialNumber);
	}
	public static String generateSerial(int n, int m){
		Random random = new Random();
		StringBuilder strBuild = new StringBuilder();
		int [][] numbers = new int[n][m]; 
		for (int i = 0;i < n ;i++ ) {
			for (int j = 0;j < m ;j++ ) {
				numbers[i][j] = random.nextInt(10);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= m; j++) {
				if (j < m) {
					strBuild = strBuild.append(numbers[i][j]);
				} else if (j == m) {
					strBuild = strBuild.append(i == n - 1 ? "" : "-");
				}
			}
		}
		String str = strBuild.toString();
		return str;
	}
}