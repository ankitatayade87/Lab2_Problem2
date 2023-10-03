package com.greatlearning.lab.denomination;

public class Currency {

	public void CurrencyCount(int[] denomination, int payValue) {
		int[] countDenomination = new int[denomination.length];

		for (int i = 0; i < denomination.length; i++) {
			if (payValue >= denomination[i]) {
				int countCur = payValue / denomination[i];
				payValue = payValue - (denomination[i] * countCur);
				countDenomination[i] = countCur;
				if (payValue == 0) {
					break;
				}
			}
		}

		if (payValue == 0) {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < denomination.length; i++) {
				if (countDenomination[i] != 0) {
					System.out.println(+denomination[i] + ":" + countDenomination[i]);
				}
			}

		} else {
			System.out.println("Exact pay value cannot paid with highest possible Denomination");
		}
	}

}
