package nkt.view;

import java.util.Scanner;

public class InputData {
	public int inputInt() {

		int variable = 0;
		boolean flag = false;
		do {
			Scanner scanner = new Scanner(System.in);
			try {
				variable = scanner.nextInt();
				flag = false;
			} catch (Exception e) {
				System.out.print("Nhap sai kieu so nguyen! Nhap lai: ");
				flag = true;
			}
		} while (flag);
		return variable;
	}

	public String inputString() {
		String variable;
		do {
			Scanner scanner = new Scanner(System.in);
			try {
				variable = scanner.nextLine();
				break;
			} catch (Exception e) {
				System.out.print("Nhap sai kieu chu! Nhap lai: ");
			}
		} while (true);
		return variable;
	}
}
