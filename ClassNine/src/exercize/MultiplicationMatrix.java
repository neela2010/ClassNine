package exercize;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		// https://www.informit.com/articles/article.aspx?p=30241&seqNum=3 - to print
		// special character
		// 4X4
		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i * j + "\t");// \t means tab to make nice space
			}
			System.out.println("");
		}

	}

}
