package marshmallows.model;

public class Thing 
{
	private String name;
	private int eyes;
	private double legs;
	private double hair;
	
	public Thing()
	{
		name = "";
		eyes = -99;
		legs = -.009;
		hair = -.008;
	}
	
	public Thing(String name, int eyes, double legs, double hair)
	{
		this.name = name;
		this.eyes = eyes;
		this.legs = legs;
		this.hair = hair;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEyes()
	{
		return eyes;
	}
	
	public double getLegs()
	{
		return legs;
	}
	
	public double getHair()
	{
		return hair;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}
	
	public void setLegs(double legs)
	{
		this.legs = legs;
	}
	
	public void setHair(double hair)
	{
		this.hair = hair;
	}
	
}
