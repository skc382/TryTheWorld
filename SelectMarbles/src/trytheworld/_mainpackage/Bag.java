package trytheworld._mainpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bag {

	private List<Marble> marbles;
	private Random generator;
	
	Bag()
	{
		this.marbles = new ArrayList<Marble>();
		this.generator = new Random();
	}
	
	/*
	 * Fills the bag with the specific color of marbles with the specific amount.
	 */
	public void fillBag(String colourOfTheMarble, int noOfMarbles)
	{
		while(noOfMarbles != 0)
		{
			this.marbles.add(new Marble(colourOfTheMarble));
			noOfMarbles--;
		}
	}
	
	/*
	 * Picks marbles randomly from the bag and returns the color of the marble and removes the marble from the bag. 
	 */
	public String selectMarble()
	{
		Marble marble = this.marbles.get(this.getRandom());
		String returnValue = marble.getColour();
		this.marbles.remove(marble);
		
		return returnValue;
	}
	
	/*
	 * Returns random numbers between 0 and size of marbles list.
	 */
	private int getRandom()
	{
		return this.generator.nextInt(this.marbles.size());
	}
	
	/*
	 * Checks if the bag is empty
	 */
	
	public boolean isEmpty()
	{
		return this.marbles.isEmpty();
	}
	
	public int size()
	{
		return this.marbles.size();
	}
	
	/*
	 * Individual Marble.
	 */
 	private class Marble
	{
		public String colour;
		
		Marble(String colour)
		{
			this.colour = colour;
		}
		
		public String getColour()
		{
			return this.colour;
		}
		
		
	}
	
}
