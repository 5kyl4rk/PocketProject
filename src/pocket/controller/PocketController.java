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
	private ArrayList<PocketMonster> starters;
	
	private PocketMonster[] pocketArray;
	private ImageIcon[] icons;
	
	
	public PocketController()
	{
		/*
		pikachu = new PocketMonster();
		squirtle = new PocketMonster("Squirtle", "Water", 14, "SquirtleSquad");
		charizard = new PocketMonster("Charizard", "Fire - Flying", 60, "Burnt Shakes");
		*/
		starters = new ArrayList<PocketMonster>();
		pocketArray = new PocketMonster[6];
		icons = new ImageIcon[12];
		generateIcons();
		createStarters();		
		
	}
	
	public void start()
	{
		//JOptionPane.showMessageDialog(null, pikachu, pikachu.getName(),JOptionPane.INFORMATION_MESSAGE, icons[0]);
		intializeArray();
		displayParty();
		//makeParty();
	}
	
	private void intializeArray()
	{
		for(int index = 0; index < pocketArray.length; index++)
		{
			int rando = (int)(Math.random() * starters.size());
			pocketArray[index] = starters.get(rando);
		}
		
	}
	
	private void createStarters()
	{
		starters.add(new PocketMonster("Squirtle", "Water"));
		starters.add(new PocketMonster("Bulbasaur", "Grass"));
		starters.add(new PocketMonster("Charmander", "Fire"));
		starters.add(new PocketMonster("Pikachu", "Electric"));
		starters.add(new PocketMonster("Chimchar", "Fire"));
		starters.add(new PocketMonster("Piplup", "Water"));
		starters.add(new PocketMonster("Turtwig", "Grass"));
		starters.add(new PocketMonster("Torchic", "Fire"));
		starters.add(new PocketMonster("Mudkip", "Water"));
		starters.add(new PocketMonster("Treeko", "Grass"));
		
	}
	
	private void generateIcons()
	{
		icons[0] = new ImageIcon(getClass().getResource("/pocket/view/images/pokeball.png"));
		icons[1] = new ImageIcon(getClass().getResource("/pocket/view/images/greatBall.png"));
		icons[2] = new ImageIcon(getClass().getResource("/pocket/view/images/ultraBall.png"));
		icons[3] = new ImageIcon(getClass().getResource("/pocket/view/images/timerBall.png"));
		icons[4] = new ImageIcon(getClass().getResource("/pocket/view/images/duskBall.png"));
		icons[5] = new ImageIcon(getClass().getResource("/pocket/view/images/nestBall.png"));
		icons[6] = new ImageIcon(getClass().getResource("/pocket/view/images/cherishBall.png"));
		icons[7] = new ImageIcon(getClass().getResource("/pocket/view/images/quickBall.png"));
		icons[8] = new ImageIcon(getClass().getResource("/pocket/view/images/masterBall.png"));
		icons[9] = new ImageIcon(getClass().getResource("/pocket/view/images/heavyBall.png"));
		icons[10] = new ImageIcon(getClass().getResource("/pocket/view/images/premierBall.png"));
		icons[11] = new ImageIcon(getClass().getResource("/pocket/view/images/luxuryBall.png"));
	}
	
	private void displayParty()
	{
		for(PocketMonster currentItem : pocketArray)
		{
			int pickRandom = (int) (Math.random() * icons.length);
			if(currentItem != null)
			{
			JOptionPane.showMessageDialog(null, currentItem, "[" + currentItem.getName()+"]", JOptionPane.INFORMATION_MESSAGE, icons[pickRandom]);
			}
		}
	}
	public void makePartyList()
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
