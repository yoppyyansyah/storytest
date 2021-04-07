package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int itotalPerson = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please input total person: ");
		itotalPerson = keyboard.nextInt();
		MagicPower mp = new MagicPower();
		int result = mp.getMagicPower(itotalPerson);
		if (result < 0) {
			System.out.println("Average is " + result);
		}else {
			double tempResult = result;
			double tempItotalPerson = itotalPerson;
			double avg = tempResult/tempItotalPerson;
			System.out.println("Average is killed = " + avg);
		}
			
	}

}
