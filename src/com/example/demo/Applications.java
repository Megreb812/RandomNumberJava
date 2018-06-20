package com.example.demo;

import java.util.Random;
import java.util.Scanner;

//Goal of project
//magic number goes from 1-100
//guess=-1
//Use while loops

public class Applications {

	public static void main(String[] args) {
		Random rand = new Random();
		int magicNumber = rand.nextInt(100);
		System.out.println(magicNumber);
		int guess = -1;

		Scanner sc = new Scanner(System.in);

		while (guess != magicNumber) {
			System.out.println("Guess a number from 0 to 100");
		guess = sc.nextInt();

		if (guess > magicNumber) {
			System.out.println("Guess is too high!");
		} else if (guess < magicNumber) {
			System.out.println("Guess is too low!");
		} else {
			System.out.println("You win!");
		}
		}
		sc.close();
	}
}
