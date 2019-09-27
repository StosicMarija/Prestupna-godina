package drugidomaci;

import java.util.Scanner;

public class DrugiZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int god;
		System.out.println("Unesi godinu: ");
		god = sc.nextInt();

		if (god % 4 == 0 && god % 100 != 0 || god % 400 == 0) {
			System.out.println("Prestupna godina");
		}

		else {
			System.out.println("Nije prestupna godina");

		}
	}
}
