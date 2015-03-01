package TryTheWorld.MainPackage;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {7,24,8,15,2,20};
		MainClass m = new MainClass();
		
		System.out.println("Max Profit this week is: "+ m.maxProfit(input));
		
	}
	
	public int maxProfit(int[] array)
	{
		if(array.length <= 1) 
			return 0;
		
		int min = array[0];
		int profit = 0;
		
		for(int i=1; i<array.length; i++)
		{
			if(array[i] <= min)
				min = array[i];
			else if((array[i] - min) > profit)
			{
				profit = (array[i] - min);
			}
		}
		
		return profit;
	}

}
