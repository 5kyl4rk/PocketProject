package pocket.controller;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import pocket.model.PocketMonster;;

public class PocketController
{
	private PocketMonster pikachu;
	private PocketMonster squirtle;
	private PocketMonster charizard;
	
	public PocketController()
	{
		pikachu = new PocketMonster();
		squirtle = new PocketMonster("Squirtle", "Water", 14, "SquirtleGang");
		charizard = new PocketMonster("Charizard", "Fire - Flying", 60, "Burnt Shakes");
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
