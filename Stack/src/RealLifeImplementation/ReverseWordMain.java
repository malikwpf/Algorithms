package RealLifeImplementation;

import Default.Stack;

public class ReverseWordMain {

	public static void main(String[] args) {
		
		String word="Malik";
	  Stack stack=new Stack(word.length());
	  
	  for(int i=0;i<word.length();i++) {
		  stack.Push((int)word.charAt(i));
	  }
	  
	  while (!stack.isEmpty()) {
		System.out.print((char)stack.Pop());
		
	}
	  
	}

}
