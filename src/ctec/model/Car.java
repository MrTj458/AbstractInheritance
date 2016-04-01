package ctec.model;

import java.util.ArrayList;

public abstract class Car implements Death
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
}
