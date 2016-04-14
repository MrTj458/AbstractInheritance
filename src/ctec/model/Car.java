package ctec.model;

import java.util.ArrayList;

public abstract class Car implements Death, Comparable
{
	private String name;
	private int numberOfSeats;
	private boolean has4Wheels;
	private String color;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getNumberOfSeats()
	{
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats)
	{
		this.numberOfSeats = numberOfSeats;
	}

	public boolean has4Wheels()
	{
		return has4Wheels;
	}

	public void setHas4Wheels(boolean has4Wheels)
	{
		this.has4Wheels = has4Wheels;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String toString()
	{
		String carDescription = "This is a Car object of type " + this.getClass().getName() + "and is " + this.getColor();
		
		return carDescription;
	}
	
	/**
	 * If this object is before or less than the compared object return a negative number. (generally -1)
	 * If this number is after/greater than the compared object return a positive number. (generally 1)
	 * If it is the same return 0.
	 * someCar.compareTo(otherCar);
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof Death)
		{
			if(this.chanceOfDeath() < ((Death) compared).chanceOfDeath())
			{
				comparedValue = -1;
			}
			else if(this.chanceOfDeath() > ((Death) compared).chanceOfDeath())
			{
				comparedValue = 1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		return comparedValue;
	}
}
