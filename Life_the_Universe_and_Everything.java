package SPOJ;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Life_the_Universe_and_Everything {
	public static void main(String[] args) {

		int i = 0;
		int a[] = new int[10000];
		Scanner scanner = new Scanner(System.in);
		while (true) {

			int num = scanner.nextInt();

			if (num == 42) {
				break;
			}
			a[i] = num;
			i++;
		}
		for (int j = 0; j < i; j++) {
			System.out.println(a[j]);

		}
	}
}
