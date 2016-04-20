package ctec.model;

public abstract class Birds implements Death
{
	private String birdName;
	private double birdHeight;
	private boolean canBirdKillHuman;
	
	public String getBirdName() 
	{
		return birdName;
	}
	public void setBirdName(String birdName) 
	{
		this.birdName = birdName;
	}
	public double getBirdHeight() 
	{
		return birdHeight;
	}
	public void setBirdHeight(double birdHeight) 
	{
		this.birdHeight = birdHeight;
	}
	public boolean getCanBirdKillHuman() 
	{
		return canBirdKillHuman;
	}
	public void setCanBirdKillHuman(boolean canBirdKillHuman) 
	{
		this.canBirdKillHuman = canBirdKillHuman;
	}
	public String toString()
	{
		String birdDescription = "This bird is object of type " + this.getClass().getName() + "and is that tall " + getBirdHeight();
		
		return birdDescription;
	}
	/**
	 * if this object is before or less than compared object return a negative number
	 * if this object is after/greater than compared object return positive number 
	 */

}
