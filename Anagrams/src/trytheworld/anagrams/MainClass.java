package trytheworld.anagrams;

public class MainClass {

	/*
	 * The logic of this program is based on the fact that; No matter the arrangement, the sum of all characters in any string will 
	 * always be equal.
	 */
	public static void main(String[] arg0)
	{

		String input[] =  {"ACT", "ANTS", "ART", "BAT", "BAR", "CAT", "DOOR", "RAT", "TAB", "TAR"};
		int[] sumArray = calculateSum(input);
		printValues(input, sumArray);
	}
	
	/*
	 * This method calculates the sum of all the characters in a string and stores the value in an Integer array. The Integer array is used to 
	 * track the index of the original string in the input string array.
	 */
	public static int[] calculateSum(String[] input)
	{
		int[] sumArray = new int[input.length];
		for(int i=0; i<input.length; i++)
		{
			for(char ch : input[i].toCharArray())
				sumArray[i] += ch;
		}
		
		return sumArray;
	}
	
	/*
	 * Iterates through the integer array to find matching values and prints the string of the corresponding index. 
	 */
	public static void printValues(String[] strings, int[] stringSum)
	{
		
		for(int i=0; i<stringSum.length; i++)
		{
			boolean firstRound = true, println = false;
			for(int j=i+1; j< stringSum.length; j++)
			{
				if(stringSum[i]==stringSum[j])
				{
					if(firstRound)
					{
						System.out.print(strings[i] + " : ");
						firstRound = false;
						println = true;
					}
					System.out.print(strings[j] + " ");
				}
			}
			
			if(println)
				System.out.println();
		}
	}
}
