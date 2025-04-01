package LinearSearch;

public class CharacterSearch {

	static public boolean find(String str, char ch)
	{
		if(str.length()==0)
			return false;
		/*
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)== ch)
				return true;
		}
		*/
		for(char i: str.toCharArray())
		{
			if(i==ch)
				return true;
			
		}
		return false;
	}
	public static void main(String[] args) {
		String str = new String("Vikas Balaji Shelar");
		System.out.println(find(str, 'r'));
	}
}
