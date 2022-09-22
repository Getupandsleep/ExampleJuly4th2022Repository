package com.sgtesting.reflection5;

public class Arrays {
	public void arrays()
	{
		double arr[][]= {{5.5,10.5,15.5,20.5},{25.5,30.5,35.5,40.5}};
		int i=arr.length-1;
		do
		{
			int j=arr[i].length-1;
			do
			{
				System.out.print(arr[i][j]+" ");
				j--;
			}while(j>=0);
			System.out.println();
			i--;
		}while(i>=0);
	}
}
