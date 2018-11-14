package pocket.controller;
import javax.swing.JOptionPane;

import pocket.model.PocketMonster;;

public class PocketController
{
	private PocketMonster pokemon;
	
	public PocketController()
	{
		pokemon = new PocketMonster();
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, pokemon);
	}
}
