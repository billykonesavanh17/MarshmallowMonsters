package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster billyMonster;
	private MarshmallowOutput myOutput; 
	
	public MonsterController()
	{
		int eyes = 4;
		double legs = 3.5;
		double hair = 2.5;
		int noses = 1;
		boolean hasBellyButton = true;
		String name = "Bobby Lee";
		
		billyMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(billyMonster.toString());
	}
}
