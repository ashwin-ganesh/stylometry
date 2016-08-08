package main.java.author.stylometry.structure;

public class Word {

	private String word;
	
	public Word(String word)
	{
		this.word=word;
	}
	public int length()
	{
		return word.length();
		
	}
	
	
	public String toString()
	{
		return word.toString();
	}
	public boolean isPunctuation()
	{
		if(word.matches("!|,|.|\"|;|:|\'|\\?"))
			return true;
		else
			return false;
		
	}
}


