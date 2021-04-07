package test;

import java.util.Scanner;

public class MagicPower {

	int iAgeDeath,iYearDeath,tempDeath = 0;
	
	public int getMagicPower(int itotalPerson) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 1; i <= itotalPerson; i++) {
			System.out.println("==================================");
			System.out.print("Please input age death person "+i+": ");
	        iAgeDeath = keyboard.nextInt();
	        
	        System.out.print("Please input year death person "+i+": ");
	        iYearDeath = keyboard.nextInt();	
	        
			Person person = new Person();
			person.setAgeDeath(iAgeDeath);
			person.setYearDeath(iYearDeath);
			
			person.setBornYear(person.getYearDeath() - person.getAgeDeath());
			if (person.getBornYear() < 0) {
				tempDeath = -1;
				return tempDeath;
			}
			PeopleKilled pk =new PeopleKilled();
			Integer resultPk = pk.getPeopleKilled(person.getBornYear());
			tempDeath = tempDeath + resultPk;
			System.out.println("Person "+ itotalPerson);
			System.out.println("Age Death = " + person.getAgeDeath());
			System.out.println("Year Death = " + person.getYearDeath());
			System.out.println("Bord Year= "+ person.getBornYear());
			System.out.println("Number of people killed on year " + person.getBornYear() + " is "+resultPk);
			System.out.println("======================================");
		}
		
		return tempDeath;
	}
}
