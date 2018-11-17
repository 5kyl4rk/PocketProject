package pocket.model;
import java.util.ArrayList;
public class PocketMonster
{
	private String name;
	private String nickname;
	private String type;
	private int lvl;
	private boolean hasFainted;
	private String nature;
	private ArrayList<String> natureList;
	

	// default constructor
	public PocketMonster()
	{
		this.name = "Pikachu";
		this.nickname = name.toUpperCase();
		this.type = "Electric";
		this.lvl = 30;
		this.hasFainted = false;
		natureList = new ArrayList<String>();
		
		buildList();
		this.nature = pickNature();
		
	}
	
	public PocketMonster(String name, String type)
	{
		this.name = name;
		this.nickname = name.toUpperCase();
		this.type = type;
		this.lvl = checkLevel((int)(Math.random()*100));
		this.hasFainted = false;
		natureList = new ArrayList<String>();
		
		buildList();
		this.nature = pickNature();
	}

	public PocketMonster(String name, String type, int lvl)
	{
		this.name = name;
		this.type = type;
		this.lvl = checkLevel(lvl);
		this.nickname = name.toUpperCase();
		natureList = new ArrayList<String>();
		
		buildList();
		this.nature = pickNature();
	}

	public PocketMonster(String name, String type, int lvl, String nickname)
	{
		this.name = name;
		this.type = type;
		this.lvl = checkLevel(lvl);
		this.nickname = nickname;
		natureList = new ArrayList<String>();
		
		buildList();
		this.nature = pickNature();

	}
	
	private void buildList()
	{
		
		//--[natureList]--
		natureList.add("Hardy");
		natureList.add("Lonely");
		natureList.add("Adamant");
		natureList.add("Naughty");
		natureList.add("Brave");
		natureList.add("Bold");
		natureList.add("Docile");
		natureList.add("Impish");
		natureList.add("Lax");
		natureList.add("Relaxed");
		natureList.add("Modest");
		natureList.add("Mild");
		natureList.add("Bashful");
		natureList.add("Rash");
		natureList.add("Quiet");
		natureList.add("Calm");
		natureList.add("Gentle");
		natureList.add("Careful");
		natureList.add("Quirky");
		natureList.add("Sassy");
		natureList.add("Timid");
		natureList.add("Hasty");
		natureList.add("Jolly");
		natureList.add("Naive");
		natureList.add("Serious");
		
		
		
		
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
		int pickRandom = (int) (Math.random() * natureList.size());
		String nature = natureList.get(pickRandom);
		
		return nature;
	}
	
	public String toString()
	{
		String shiny = "";
		if(isShiny())
		{
			shiny = "* SHINY *\n";
		}
		String pokedex = nickname +  "\nLvl. "+ lvl+ "\n"+
							shiny + "Type: " + "|" + type + "|" + "\nNature: " +
							"|" +nature+"|";
		
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
	public String getNature()
	{
		return nature;
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
	public void setNature(String nature)
	{
		this.nature = nature;
	}

}
