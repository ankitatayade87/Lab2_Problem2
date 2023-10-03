package com.greatlearning.lab.denomination;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denomination");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int denomination[] = new int[size];
		for (int i = 0; i < size; i++) {
			denomination[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int payValue = sc.nextInt();

		MergeSort sort = new MergeSort();
		sort.sort(denomination, 0, denomination.length - 1);

		Currency curr = new Currency();
		curr.CurrencyCount(denomination, payValue);

	}
}