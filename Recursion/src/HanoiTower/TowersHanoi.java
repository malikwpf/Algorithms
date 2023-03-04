package HanoiTower;

public class TowersHanoi {

	public static void main(String[] args) {
		DoMoves(3, 'a', 'b', 'c');

	}
	
	public static void DoMoves(int n,char from, char auxiliary,char to) {
		
		if(n==1) {
			System.out.println("From: "+from+" Auxiliary: "+auxiliary+" To: "+to);
			return;
		}
		
		DoMoves(n-1, from, to, auxiliary);
		System.out.println("From: "+from+" Auxiliary: "+auxiliary+" To: "+to);
		DoMoves(n-1, auxiliary, from, to);
		
	}

}
