package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;
import marshmallows.model.Thing;

public class MonsterController
{
	private MarshmallowMonster billyMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput; 
	private Scanner monsterScanner;
	private MarshmallowOutput myPopups;
	private Thing myTestThing;
	

	
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
		
		myPopups = new MarshmallowOutput();
	}
	
	public void start()
	{
		myOutput.displayMonsterConsole(billyMonster.toString());
		myOutput.displayMonsterGUI(billyMonster.toString());
		//this.makeUserMonster();
		myOutput.displayMonsterGUI1(billyMonster.toString());
		myOutput.displayMonsterGUI2(billyMonster.toString());
		myOutput.displayMonsterGUI3(billyMonster.toString());
		
		String monsterName = myPopups.grabAnswer("Type in your monster's name.");
		myPopups.showResponse("Your monster's name is " + monsterName + ".");
		
		String tempEyes = myPopups.grabAnswer("Type in the amount of eyes for " + monsterName + ".");
		int monsterEyes;
		while(!isInteger(tempEyes))
		{
			tempEyes = myPopups.grabAnswer("Type in a positive integer for " + monsterName + "'s eye(s).");
		}
		if(isInteger(tempEyes))
		{
			monsterEyes = Integer.parseInt(tempEyes);
		}
		else
		{
			monsterEyes = -9999999;
		}
		myPopups.showResponse(monsterName + " has " + tempEyes + " eye(s).");
		
		String tempLegs = myPopups.grabAnswer("Type in the amount of legs for " + monsterName + ".");
		double monsterLegs;
		while(!isDouble(tempLegs))
		{
			tempLegs = myPopups.grabAnswer("Type in a positive integer for " + monsterName + "'s leg(s).");
		}
		if(isDouble(tempLegs))
		{
			monsterLegs = Double.parseDouble(tempLegs);
		}
		else
		{
			monsterLegs = -9999.99;
		}
		myPopups.showResponse(monsterName + " has " + tempLegs + " leg(s).");
		
		String tempHair = myPopups.grabAnswer("Type in the amount of strands of hair for " + monsterName + ".");
		double monsterHair;
		while(!isDouble(tempHair))
		{
			tempHair = myPopups.grabAnswer("Type in a positive integer for " + monsterName + "'s strand(s) of hair.");
		}
		if(isDouble(tempHair))
		{
			monsterHair = Double.parseDouble(tempHair);
		}
		else
		{
			monsterHair = -9999.99;
		}
		myPopups.showResponse(monsterName + " has " + tempHair + " strand(s) of hair.");
	
		myTestThing = new Thing(monsterName, monsterEyes, monsterLegs, monsterHair);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int tempEyes = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double tempLegs = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a doulbe - bad value will be used");
		}
		
		return isDouble;
	}
	
	private boolean isDouble2(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double tempHair = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a double - bad vallue will be used");
		}
		
		return isDouble;
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
