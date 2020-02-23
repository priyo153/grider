package grider;

public class Steps {

	public static void steps(int n) {

		for (int i = 1; i <= n; i++) {

			System.out.print("'");
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}

			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");

			}
			System.out.println("'");

		}
	}
	
	public static void steps2(int n, int row,String stair) {
		if(n== row)
		{
			return;
		}
		
		if(n== stair.length()) {
			System.out.println(stair);
			steps2(n,row+1,"");
			return;
		
		}
		
		if(stair.length()<=row) {
			stair+="#";
		}
		else {
			stair+=" ";

			
		}
		
		steps2(n,row,stair);
		
	}
	


	public static void main(String[] args) {
		steps2(10,0,"");

	}

}
