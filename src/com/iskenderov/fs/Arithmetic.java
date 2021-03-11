package com.iskenderov.fs;

import java.util.Scanner;

public class Arithmetic {

	private Scanner in;
	private int numProblems;
	int maxTries;

	public Arithmetic() {
		in = new Scanner(System.in);
		System.out.printf("\nWelcome to Problems in Addition\n\n");
		System.out.printf("How many problems would you like? ");
		numProblems = in.nextInt();
		System.out.printf("Maximum tries per problem? ");
		maxTries = in.nextInt();
		giveProblems(in, numProblems, maxTries);
		System.out.printf("\nThank you for playing. Bye...\n");
	}

	private void giveProblems(Scanner in, int amount, int maxTries) {
		int num1;
		int num2;
		int answer;
		int response;
		int tri; // 'tri' since 'try' is a reserved word

		for (int h = 1; h <= amount; h++) {
			num1 = random(10, 99);
			num2 = random(10, 99);
			answer = num1 + num2;
			for (tri = 1; tri <= maxTries; tri++) {
				System.out.printf("\nProblem %d, Try %d of %d\n", h, tri, maxTries);
				System.out.printf("%5d + %2d = ", num1, num2);
				response = in.nextInt();
				if (response == answer) {
					System.out.printf("Correct, well done!\n");
					break;
				}
				if (tri < maxTries)
					System.out.printf("Incorrect, try again\n");
				else
					System.out.printf("Sorry, answer is %d\n", answer);
			}
		}

	}

	private int random(int m, int n) {
		return (int) (Math.random() * (n - m + 1)) + m;
	}
}
