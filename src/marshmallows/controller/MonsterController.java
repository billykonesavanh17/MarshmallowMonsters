package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster billyMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput; 
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 4;
		double legs = 3.5;
		double hair = 2.5;
		int noses = 1;
		boolean hasBellyButton = true;
		String name = "Bobby Lee";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		billyMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(billyMonster.toString());
		makeUserMonster();
		myOutput.displayMonsterInfo("New Monster Info:  " + userMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster.");
		String betterMonsterName = monsterScanner.next();
		billyMonster.setMonsterName(betterMonsterName);
		
		System.out.println("Type in a different number of eyes for the monster.");
		int betterMonsterEyes = monsterScanner.nextInt();
		billyMonster.setMonsterEyes(betterMonsterEyes);
		
		System.out.println("Type in a different number of legs.");
		double betterMonsterLegs = monsterScanner.nextDouble();
		billyMonster.setMonsterLegs(betterMonsterLegs);
		
		System.out.println("Type in a different amount of hair.");
		double betterMonsterHair = monsterScanner.nextDouble();
		billyMonster.setMonsterHair(betterMonsterHair);
		
		System.out.println("Update the bellybutton status.");
		boolean updatedBellyButton = monsterScanner.nextBoolean();
		billyMonster.setMonsterBellyButton(updatedBellyButton);
		
	}

	/**
	 * This method will get the information to create an instance of a MarshmallowMonster.
	 */
	private void makeUserMonster()
	{
		//Step one:  Get Variables
		String userName; 
		int userEyes;
		int userNoseCount;
		double userLegs;
		double userHair;
		boolean userBellyButton;
		
		//Step two:  Define variables by using Scanner to get user input.
		System.out.println("Type in your name for your monster.");
		userName = monsterScanner.nextLine();
		System.out.println("Type in the number of eyes for this monster.");
		userEyes = monsterScanner.nextInt();
		System.out.println("Type in the number of noses for this monster.");
		userNoseCount = monsterScanner.nextInt();
		System.out.println("How much hair does your monster have?");
		userHair = monsterScanner.nextDouble();
		System.out.println("How many legs?");
		userLegs = monsterScanner.nextDouble();
		System.out.println("Does it have a bellybutton?  Type true or false.");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three:  Make a monster - use the Constructor.  Remember that the order of parameters matters.
		userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton);
	}
}
