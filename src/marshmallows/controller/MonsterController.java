package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster billyMonster;
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
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info:  " + billyMonster.toString());
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
		
	}
}
