import java.util.Scanner;

/**
 * Exercicio4
 */
public class Exercicio4 {

	public static void main(String[] args) {
		reorder();
	}

	public static void reorder() {
		Scanner scan = new Scanner(System.in);
		int inputSize = scan.nextInt();

		for (int i = 0; i < inputSize; i++) {
			String text = readout(scan);

			StringBuilder textPart1 = new StringBuilder(text.substring(0, text.length() / 2));
			StringBuilder textPart2 = new StringBuilder(text.substring(text.length() / 2, text.length()));

			textPart1.reverse();
			textPart2.reverse();

			System.out.println(textPart1.toString() + textPart2.toString());
		}
	}

	public static String readout(Scanner scan) {
		String line = scan.nextLine();
		while (line.isEmpty()) {
			line = scan.nextLine();
		}
		return line;
	}
}