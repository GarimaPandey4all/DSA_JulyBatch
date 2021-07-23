package com.brainmentors.dsa.arrays;

public class Problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char name[] = {'R', 'a', 'm'};
		
		int i = 0;
		int j = name.length - 1;
		
		while(i < j)
		{
			char temp = name[i];
			name[i] = name[j];
			name[j] = temp;
			
			i++;
			j--;
		}
		
		//foreach or enhanced loop
		for(char n : name)
		{
			System.out.print(n);
		}

	}

}
