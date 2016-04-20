package ctec.model;

import javax.swing.*;

public class Emu extends Birds implements Death
{
	public Emu()
	{
		this.setBirdHeight(6.2);
		this.setBirdName("Emu");
		this.setCanBirdKillHuman(true);
	}

	@Override
	public String story() {
		// TODO Auto-generated method stub
		return "The Great Emu War of 1932 involved two Austrialian Soldiers with WWI MachineGuns and 20,000 Emu's";
	}

	@Override
	public double chanceOfDeath() 
	{
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public void memes() 
	{
	
		JOptionPane.showMessageDialog(null,"Big Bird has got nothing on them.");
		
	}

	@Override
	public void spamTime(int spams) 
	{
		for( int times = 0; times < spams; times++);
		{
			JOptionPane.showMessageDialog(null, "Birds");
		}
	}

	@Override
	public void punch(int times) 
	{
	 
		for( int punches = 0; times < punches; times++);
		{
			JOptionPane.showMessageDialog(null, "Kicks");
		}
	}
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
	
			if(compared instanceof Death)
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
				return comparedValue;
	}
}
