package pocket.controller;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import pocket.model.PocketMonster;;

public class PocketController
{
	private PocketMonster pikachu;
	private PocketMonster squirtle;
	private PocketMonster charizard;
	
	private PocketMonster[] pocketArray;
	private ImageIcon[] icons;
	
	
	public PocketController()
	{
		pikachu = new PocketMonster();
		squirtle = new PocketMonster("Squirtle", "Water", 14, "SquirtleSquad");
		charizard = new PocketMonster("Charizard", "Fire - Flying", 60, "Burnt Shakes");
		
		icons = new ImageIcon[6];
		pocketArray = new PocketMonster[6];
	}
	
	public void start()
	{
		//JOptionPane.showMessageDialog(null, pikachu);
		makeParty();
	}
	
	public void makeParty()
	{
		ArrayList<PocketMonster> party = new ArrayList<PocketMonster>();
		
		party.add(pikachu);
		party.add(squirtle);
		party.add(charizard);
		
		for(PocketMonster currentMember : party)
		{
			JOptionPane.showMessageDialog(null, currentMember);
		}
	}
}
