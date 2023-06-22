import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt(), k = fs.nextInt();
			if (y < x) {
				int temp = x;
				x = y;
				y = temp;
			}
			y -= x;
			System.out.println((y + k - 1) / k);
		}
		fs.close();
	}
}
