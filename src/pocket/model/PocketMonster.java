package pocket.model;

public class PocketMonster
{
	private String name;
	private String nickname;
	private String type;
	private int lvl;

	// default constructor
	public PocketMonster()
	{
		this.name = "Pikachu";
		this.nickname = name.toUpperCase();
		this.type = "Electric";
		this.lvl = 30;
		
	}

	public PocketMonster(String name, String type, int lvl)
	{
		this.name = name;
		this.type = type;
		this.lvl = lvl;
		this.nickname = name.toUpperCase();
	}

	public PocketMonster(String name, String type, int lvl, String nickname)
	{
		this.name = name;
		this.type = type;
		this.lvl = lvl;
		this.nickname = nickname;

	}
	
	public String toString()
	{
		String pokedex = "["+nickname+"]";
		
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
