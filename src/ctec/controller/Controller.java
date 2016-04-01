package ctec.controller;

import java.util.ArrayList;

import ctec.model.*;
import ctec.view.Frame;

public class Controller
{
	private ArrayList<Car> carList;
	private Frame frame;
	
	public Controller()
	{
		setupCarList();
		frame = new Frame(this);
	}
	
	private void setupCarList()
	{
		carList = new ArrayList<Car>();
		carList.add(new JeepWrangler());
		carList.add(new MazdaRx8());
	}
	
	public ArrayList<Car> getCarList()
	{
		return carList;
	}
}
