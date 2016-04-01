package ctec.model;

import javax.swing.JOptionPane;

public class JeepWrangler extends Car
{
	public JeepWrangler()
	{
		this.setName("Jeep Wrangler");
		this.setNumberOfSeats(5);
		this.setHas4Wheels(true);
		this.setColor("White");
	}

	@Override
	public String story()
	{
		return "There once was a jeep. The jeep could not make it up the hill.\nIt finally made it up the hill.\nIt then fell apart.\nThe end.";
	}

	@Override
	public double chanceOfDeath()
	{
		return 9001;
	}

	@Override
	public void memes()
	{
		JOptionPane.showMessageDialog(null, "No memes here, or roads.");
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
