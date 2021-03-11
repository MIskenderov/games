package com.iskenderov.fs;

import java.util.*;

public class ArithmeticGame {

	private Scanner in;
	private int numProblems;
	private int maxTries;

	public ArithmeticGame() {
		Scanner in = new Scanner(System.in);
		System.out.printf("\n Welcome to problem in additional \n\n");
		System.out.printf("How many problems would you like? ");
		numProblems = in.nextInt();
		System.out.printf("Maximum tries per problem? ");
		maxTries = in.nextInt();
		giveProblems(in, numProblems, maxTries);
		System.out.printf("\n Thank You for playing. bye...\n");
	}

	private void giveProblems(Scanner in, int amount, int maxTries) {
		int num1, num2, answer, response, tri;
		for (int h = 1; h <= amount; h++) {
			num1 = random(10, 99);
			num2 = random(10, 99);
			answer = num1 + num2;
			for (tri = 1; tri <= maxTries; tri++) {
				System.out.printf("\nProblem %d, Try %d of %d\n", h, tri, maxTries);
				System.out.printf("%5d + %2d = ", num1, num2);
				response = in.nextInt();
				if (response == answer) {
					System.out.printf("Correct, well done! \n");
					break;
				}
				if (tri < maxTries)
					System.out.printf("incorrect, try again\n");
				else
					System.out.printf("Sorry, answer is %d\n", answer);
			}
		}

	}

	private int random(int m, int n) {
		return (int) (Math.random() * (n - m + 1)) + m;
	}

}
