package pocket.model;
import java.util.ArrayList;
public class PocketMonster
{
	private String name;
	private String nickname;
	private String type;
	private int lvl;
	private ArrayList<String> natures;

	// default constructor
	public PocketMonster()
	{
		this.name = "Pikachu";
		this.nickname = name.toUpperCase();
		this.type = "Electric";
		this.lvl = 30;
		
		buildList();
	}

	public PocketMonster(String name, String type, int lvl)
	{
		this.name = name;
		this.type = type;
		this.lvl = checkLevel(lvl);
		this.nickname = name.toUpperCase();
		buildList();
	}

	public PocketMonster(String name, String type, int lvl, String nickname)
	{
		this.name = name;
		this.type = type;
		this.lvl = checkLevel(lvl);
		this.nickname = nickname;
		buildList();

	}
	
	private void buildList()
	{
		natures = new ArrayList<String>();
		
		//--[Natures]--
		natures.add("Hardy");
		natures.add("Lonely");
		natures.add("Adamant");
		natures.add("Naughty");
		natures.add("Brave");
		natures.add("Bold");
		natures.add("Docile");
		natures.add("Impish");
		natures.add("Lax");
		natures.add("Relaxed");
		natures.add("Modest");
		natures.add("Mild");
		natures.add("Bashful");
		natures.add("Rash");
		natures.add("Quiet");
		natures.add("Calm");
		natures.add("Gentle");
		natures.add("Careful");
		natures.add("Quirky");
		natures.add("Sassy");
		natures.add("Timid");
		natures.add("Hasty");
		natures.add("Jolly");
		natures.add("Naive");
		natures.add("Serious");
	}
	
	private int checkLevel(int level)
	{
		int currentLevel = level;
		if(level > 100)
		{
			currentLevel = 100;
		}
		if(level < 1)
		{
			currentLevel = 1;
		}
		
		return currentLevel;
		
	}
	private boolean isShiny()
	{
		int pickRandom = (int) (Math.random() * 4096);
		boolean foundShiny = false;
		if(pickRandom == 151)
		{
			foundShiny = true;
		}
		
		return foundShiny;
	}
	
	private String pickNature()
	{
		int pickRandom = (int) (Math.random() * natures.size());
		String nature = natures.get(pickRandom);
		
		return nature;
	}
	
	public String toString()
	{
		String shiny = "";
		if(isShiny())
		{
			shiny = "* SHINY *";
		}
		String pokedex = "[\""+nickname+"\"\t" +  "Lvl. "+ lvl+ "]\n"+
							shiny + name + "\nType: " + type + "\nNature: " +
							pickNature();
		
		return pokedex;
	}

	// --[GET]--
	public String getName()
	{
		return name;
	}
	public String getNickname()
	{
		return nickname;
	}
	public String getType()
	{
		return type;
	}
	public int getLvl()
	{
		return lvl;
	}
	
	//--[SET]--
	public void setName(String name)
	{
		this.name = name;
	}
	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public void setLvl(int lvl)
	{
		this.lvl = lvl;
	}

}
