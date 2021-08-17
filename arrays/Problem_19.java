package com.brainmentors.dsa.arrays;

public class Problem_19 {
	
	public static String removeDuplicates(char[] chars)
	{
		char prev = '\0';
		int k = 0;
		
		for(char c : chars)
		{
			if(prev != c)
			{
				chars[k++] = c;
				prev = c;
			}
		}
		
		return new String(chars).substring(0, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "AAABBCDDD";
		
		str = removeDuplicates(str.toCharArray());
		System.out.println(str);

	}

}
