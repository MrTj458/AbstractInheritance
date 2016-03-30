package ctec.model;

import javax.swing.JOptionPane;

public class MazdaRx8 extends Car
{
	public MazdaRx8()
	{
		this.setNumberOfSeats(4);
		this.setHas4Wheels(true);
		this.setColor("Red");
	}

	@Override
	public String story()
	{
		return "There was a mazda. It drove away.";
	}

	@Override
	public double chanceOfDeath()
	{
		return 10;
	}

	@Override
	public void memes()
	{
		JOptionPane.showMessageDialog(null, "Vroom vroom");
	}

	@Override
	public void spamTime(int spams)
	{
		for(int times = 0; times < spams; times++)
		{
			JOptionPane.showMessageDialog(null, "Spam");
		}
	}

	@Override
	public void punch(int times)
	{
		for(int index = 0; index < times; index++)
		{
			JOptionPane.showMessageDialog(null, "punch");
		}
	}
}
