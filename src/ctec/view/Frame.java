package ctec.view;

import javax.swing.JFrame;
import ctec.controller.Controller;

public class Frame extends JFrame
{
	private Controller baseController;
	private Panel basePanel;
	
	public Frame(Controller baseController)
	{
		this.baseController = baseController;
		basePanel = new Panel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(250,125);
		this.setTitle("Inheritance");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
