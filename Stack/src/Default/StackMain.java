package Default;

public class StackMain {

	public static void main(String[] args) {
		
		Stack stack=new Stack(4);
		
		System.out.println(stack.isEmpty());
		
		stack.Push(1);
		stack.Push(2);
		stack.Push(3);
		stack.Push(4);
		
		System.out.println(stack.isFull());
		stack.Pop();
		System.out.println(stack.isFull());
		System.out.println(stack.Peek());
	}

}
