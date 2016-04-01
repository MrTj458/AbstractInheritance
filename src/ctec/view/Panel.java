package ctec.view;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;
import java.util.ArrayList;

import ctec.controller.Controller;
import ctec.model.Car;

public class Panel extends JPanel
{
	private Controller baseController;
	private int currentCar;
	
	private SpringLayout baseLayout;
	private JLabel seatsLabel;
	private JLabel colorLabel;
	private JLabel wheelsLabel;
	private JButton nextButton;
	private JLabel carType;
	
	public Panel(Controller baseController)
	{
		this.baseController = baseController;
		currentCar = 0;
		baseLayout = new SpringLayout();
		seatsLabel = new JLabel("Number of seats: ");
		colorLabel = new JLabel("The car is: ");
		wheelsLabel = new JLabel("The car has 4 wheels: ");
		nextButton = new JButton("Next Car");
		carType = new JLabel("None selected");
		
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
		this.add(carType);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, wheelsLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, colorLabel, 6, SpringLayout.SOUTH, wheelsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, colorLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, seatsLabel, 6, SpringLayout.SOUTH, colorLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, nextButton, -6, SpringLayout.NORTH, wheelsLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nextButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, wheelsLabel, -49, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, carType, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, carType, -6, SpringLayout.NORTH, wheelsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, seatsLabel, 0, SpringLayout.WEST, colorLabel);
	}
	
	private void setupListeners()
	{
		nextButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeCar();
			}
		});
	}
	
	private void changeCar()
	{
		ArrayList<Car> carList = baseController.getCarList();
		
		if((currentCar + 1) > carList.size())
		{
			currentCar = 0;
		}
		
		seatsLabel.setText("Number of seats: " + Integer.toString(carList.get(currentCar).getNumberOfSeats()));
		colorLabel.setText("The car is: " + carList.get(currentCar).getColor());
		wheelsLabel.setText("The car has 4 wheels: " + Boolean.toString(carList.get(currentCar).has4Wheels()));
		carType.setText(carList.get(currentCar).getName());
		
		currentCar++;
	}
}
