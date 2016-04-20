package ctec.controller;

import java.util.ArrayList;

import ctec.model.*;
import ctec.view.Frame;

public class Controller
{
	private ArrayList<Death> deaths;
	private Frame frame;
	
	public Controller()
	{
		setupDeathList();
		frame = new Frame(this);
	}
	
	private void setupDeathList()
	{
		deaths = new ArrayList<Death>();
		deaths.add(new JeepWrangler());
		deaths.add(new MazdaRx8());
		deaths.add(new Emu());
	}
	
	public String getDeathChances()
	{
		String deathLevels = "";
		
		for(Death currentDeath : deaths)
		{
			deathLevels += currentDeath.getClass().getName() + ": " + currentDeath.chanceOfDeath() + " \n";
		}
		
		return deathLevels;
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		Death temp = deaths.get(firstLocation);
		deaths.set(firstLocation, deaths.get(secondLocation));
		deaths.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < deaths.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (deaths.get(innerLoop-1).compareTo(deaths.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midpoint = partition(low, high);
			quicksort(low, midpoint-1);
			quicksort(midpoint+1, high);
		}
	}
	
	private int partition(int low, int high)
	{
		int position = low;
		Death pivot = deaths.get(high);
		
		for(int spot = low; spot < high-1; spot++)
		{
			if(deaths.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, high);
				position++;
			}
		}
		
		swap(position, high);
		
		return position;
	}
	
	public ArrayList<Death> getDeathList()
	{
		return deaths;
	}
}
