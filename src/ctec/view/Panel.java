package ctec.view;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;
import java.util.ArrayList;

import ctec.controller.Controller;
import ctec.model.Car;
import ctec.model.Death;
import java.awt.Color;

public class Panel extends JPanel
{
	private Controller baseController;
	private int currentObject;

	private SpringLayout baseLayout;
	private JTextArea textArea;
	private JScrollPane textScrollPane;
	private JButton nextButton;

	public Panel(Controller baseController)
	{
		this.baseController = baseController;
		currentObject = 0;
		baseLayout = new SpringLayout();
		nextButton = new JButton("Next Car");

		setupTextArea();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupTextArea()
	{
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textScrollPane = new JScrollPane(textArea);
		textScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		textScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(500, 500));
		this.setBackground(Color.GRAY);
		this.add(nextButton);
		this.add(textScrollPane);
		textArea.setText(baseController.getDeathChances());
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, nextButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, nextButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 0, SpringLayout.WEST, nextButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, textArea, -6, SpringLayout.NORTH, nextButton);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textScrollPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textScrollPane, 0, SpringLayout.WEST, nextButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, textScrollPane, -6, SpringLayout.NORTH, nextButton);
		baseLayout.putConstraint(SpringLayout.EAST, textScrollPane, -10, SpringLayout.EAST, this);
	}

	private void setupListeners()
	{
		nextButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				
				textArea.append("\n" + baseController.getDeathChances());
			}
		});
	}
}
