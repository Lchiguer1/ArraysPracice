package org.mma.training.java;

public class ArraysPracice {

	public static void main(String[] args) {


		//simple practice for Arrays for the beginners

		int id1 = 10;
		int id2  = 11;
		int id3 = 12;
		int id4 = 13;
		//To avoid declaring and initializing each var and to save time when you have soo many variables We have to declare

		int[] studentsid = { 10, 11, 12, 13};
		for( int i = 0; i< studentsid.length; i++) {
			System.out.println(studentsid[i]);
		}
		//Another way of declaring and initializing arrays
		int[] stuIds = new int[4];
		stuIds[0]= 10;
		stuIds[1]= 11;
		stuIds[2] = 12;
		stuIds[3] = 13;

		for(int i = 0; i< stuIds.length; i++) {
			System.out.println(stuIds[i]);
		}

		//Making an Array containing list of friends

		String[] fr = {"Ati","Asto","Kelthoom","Roqayya"};//Declaring and intializing an array
		System.out.println(fr[0]);
		System.out.println(fr[2]);
		fr[3] = "Fatima";

		System.out.println(fr[3]);

		//another way of declaring an Array
		String[] Amies= new String[4];
		Amies[0]= "Ati";
		Amies[1]="Asto";
		Amies[2]="Fati";
		for(int i=0; i<Amies.length; i++) {
			System.out.println(Amies[i]);
		}
		//Another example of Array

		String[] IslamPillars = { "Shahaadah","Salat","Zakat","Sawm","Hajj"};
		System.out.println(IslamPillars[4]);

		//for Loop
		for(int i = 0; i< IslamPillars.length; i++ ) {
			System.out.println(IslamPillars[i]);
		}
		//Same Example but different way of declaring the array and initializing the elements in the array
		String[] Islampillars = new String[5];
		Islampillars[0]= "Shahaadah";
		Islampillars[1] = "Salat";
		Islampillars[2] = " Zakat";
		Islampillars[3] =" Sawm";
		Islampillars[4] ="Hajj";

		System.out.println(Islampillars[4]);
		//System.out.println(Islampillars[5]);// bc We have only 5elemnts, there will no value for i=5

		String[] Ipillars = { "Shahaadah","Salat","Zakat","Sawm","Hajj"};

		for(int i=0; i< Ipillars.length; i++) {
			System.out.println(Ipillars[i]);
		}

		//Another easy example for Array	
		String[] Fruits = { "Banana", "Apple", "Grapes", " Watermelon"};
		System.out.println(Fruits[3]);
		System.out.println(Fruits[0]);

		//Another way of declaring ArrayFruits

		String[] fruits = new String[4];
		fruits[0]= "Banana";
		fruits[1]= "Apple";
		fruits[2] ="Grapes";
		fruits[3] ="Watermelon";
		System.out.println(fruits[3]);
		for(int i = 0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}

	}


}
