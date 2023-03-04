package Anagrams;

import java.util.Scanner;

public class AnagramsMain {

	static char[]arrChar;
	static int size;
	static int count=0;
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word: ");
		arrChar=sc.next().toCharArray();
		size=arrChar.length;
		DoAnagrams(size);
	}
	
	public static void DoAnagrams(int newSize) {
		if(newSize==1) {
			Display();
			return;
		}
		for(int i=0;i<newSize;i++) {
			DoAnagrams(newSize-1);
			Rotate(newSize);
		}
	}
	
	public static void Rotate(int n) {
		var position=size-n;
		var temp=arrChar[position];
		for(int i=position+1;i<size;i++) {
			arrChar[i-1]=arrChar[i];
		}
		arrChar[size-1]=temp;
	}
	
	public static void Display() {
		System.out.print(" "+ ++count+" ");
		for(int i=0;i<size;i++) {
			System.out.print(arrChar[i]);
		}
		if(count%6==0) {
			System.out.println();
		}
	}

}
