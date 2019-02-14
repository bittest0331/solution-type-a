package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "¦" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		int clap = 0;
		int a = number / 10; //10���ڸ�
		int b = number % 10; //1���ڸ�
		
		if(a==3 || a==6 || a==9 ) {
			clap++;
		}
		
		if(b==3 || b==6 || b==9 ) {
			clap++;
		}
		
	
		
		return clap;
	}
}