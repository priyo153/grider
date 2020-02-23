package grider;

public class Pyramid {
	
	public static void pyramid(int n) {

		int mid=1;
		int space=n-1;
		for(int i=0;i<n;i++) {
			
			String line="'";
			for(int j=0;j<space;j++) {
				line+=" ";
				
			}
			
			for(int j=0;j<mid;j++) {
				line+="#";
			}
			
			for(int j=0;j<space;j++) {
				line+=" ";
				
			}
			
			space--;
			mid+=2;
			
			System.out.println(line+"'");
		}
	}

	public static void main(String[] args) {
		pyramid(3);

	}

}
