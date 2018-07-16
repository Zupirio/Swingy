package view;

import model.characters.Hero;
import javax.swing.*;

import javafx.event.EventTarget;

/**
 * StartGame
 */
public class StartGame extends JFrame implements WindowManager
{

	private static final long serialVersionUID = 1L;

	public StartGame()
	{ initComponents(); }

	private void initComponents()
	{
		JButton jButton = new JButton();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jButton.setText("Select Hero");
		jButton.addActionListener((EventTarget) );
	}


}