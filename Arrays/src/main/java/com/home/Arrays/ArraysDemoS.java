package com.home.Arrays;

public class ArraysDemoS {
	
	public static void main( String[] args )
    {
		System.out.println( "Hello World!" );
		//Created an array
		int[] numbers= new int[10];
		System.out.println( numbers);
		//adding data
		numbers[0]=8;
		numbers[1]=3;
		numbers[2]=4;
		numbers[3]=5;
		numbers[4]=6;
		numbers[5]=200;
		numbers[6]=11111110;
		numbers[7]=1;
		numbers[8]=9;
		numbers[9]=10;	
		System.out.println(numbers.length);
		//Find min and max
		int min=0;
		int max=0;
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			int number=numbers[i];
			if(i==0) {
				min=number;
				max=number;
				sum=number;
				
			}
			else {
			if(number>max) {
				max=number;
			}
			if(min>number) {
				min=number;
			}
			sum=sum+number;
			}
			System.out.println("Position ::"+i+" Value:"+number);
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		System.out.println("Sum:"+sum);
		
 }

}
