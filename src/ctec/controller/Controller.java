package ctec.controller;

import ctec.model.*;
import ctec.view.Frame;

public class Controller
{
	private JeepWrangler jeep;
	private MazdaRx8 mazda;
	private Frame frame;
	
	public Controller()
	{
		jeep = new JeepWrangler();
		mazda = new MazdaRx8();
		frame = new Frame(this);
	}
	
	public JeepWrangler getJeep()
	{
		return jeep;
	}
	
	public MazdaRx8 getMazda()
	{
		return mazda;
	}
}
