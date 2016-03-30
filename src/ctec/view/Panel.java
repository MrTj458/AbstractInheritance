package ctec.view;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;
import ctec.controller.Controller;

public class Panel extends JPanel
{
	private Controller baseController;
	private String currentCar;
	
	private SpringLayout baseLayout;
	private JLabel seatsLabel;
	private JLabel colorLabel;
	private JLabel wheelsLabel;
	private JButton nextButton;
	
	public Panel(Controller baseController)
	{
		this.baseController = baseController;
		currentCar = "mazda";
		baseLayout = new SpringLayout();
		seatsLabel = new JLabel("Number of seats: ");
		colorLabel = new JLabel("The car is: ");
		wheelsLabel = new JLabel("The car has 4 wheels: ");
		nextButton = new JButton("Next Car");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(250, 100));
		this.add(seatsLabel);
		this.add(colorLabel);
		this.add(wheelsLabel);
		this.add(nextButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, wheelsLabel, 6, SpringLayout.SOUTH, nextButton);
		baseLayout.putConstraint(SpringLayout.WEST, wheelsLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, colorLabel, 6, SpringLayout.SOUTH, wheelsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, colorLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, seatsLabel, 6, SpringLayout.SOUTH, colorLabel);
		baseLayout.putConstraint(SpringLayout.WEST, seatsLabel, 0, SpringLayout.WEST, colorLabel);
	}
	
	private void setupListeners()
	{
		nextButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if(currentCar.equals("jeep"))
				{
					currentCar = "mazda";
					changeCar("mazda");
				}
				else
				{
					currentCar = "jeep";
					changeCar("jeep");
				}
			}
		});
	}
	
	private void changeCar(String car)
	{
		if(car.equals("jeep"))
		{
			seatsLabel.setText("Number of seats: " + Integer.toString(baseController.getJeep().getNumberOfSeats()));
			wheelsLabel.setText("The car has 4 wheels: " + Boolean.toString(baseController.getJeep().has4Wheels()));
			colorLabel.setText("The car is: " + baseController.getJeep().getColor());
		}
		else if(car.equals("mazda"))
		{
			seatsLabel.setText("Number of seats: " + Integer.toString(baseController.getMazda().getNumberOfSeats()));
			wheelsLabel.setText("The car has 4 wheels: " + Boolean.toString(baseController.getMazda().has4Wheels()));
			colorLabel.setText("The car is: " + baseController.getMazda().getColor());
		}
	}
}
