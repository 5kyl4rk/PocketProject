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
		
		icons[0] = new ImageIcon(getClass().getResource("/pocket/view/images/pokeball.png"));
		icons[1] = new ImageIcon(getClass().getResource("/pocket/view/images/greatBall.png"));
		icons[2] = new ImageIcon(getClass().getResource("/pocket/view/images/ultraBall.png"));
		icons[3] = new ImageIcon(getClass().getResource("/pocket/view/images/timerBall.png"));
		icons[4] = new ImageIcon(getClass().getResource("/pocket/view/images/duskBall.png"));
		
		pocketArray = new PocketMonster[6];
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, pikachu, pikachu.getName(),JOptionPane.INFORMATION_MESSAGE, icons[0]);
		//makeParty();
	}
	private void arrayInitalization()
	{
		
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
