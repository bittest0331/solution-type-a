package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int number = ran.nextInt(900)+100;
		
		int N = 0; //도전횟수
		int s = 0; //strike
		int b = 0; //ball
		int o = 0; //out
		
		int i1 = number/100; //100의자리
		int i2 = number%100/10; //10의자리
		int i3 = number%10; //1의자리
		
		Scanner sca = new Scanner(System.in);
		
		System.out.print("> ");
		int input = sca.nextInt();
		
		if(input >= 1000 || input < 100) {
			System.out.println("야구게임을 하시려면 3자리의 숫자를 입력해주세요");
			System.out.print("> ");
			input = sca.nextInt();
		}
		
		int sca1 = input/100;
		int sca2 = input%100/10;
		int sca3 = input%10;
		
		int random[] = new int[3];
		random[0] = i1;
		random[1] = i2;
		random[2] = i3;
		
		while(s<3) {
			s = 0;
			b = 0;
			o = 0;
			
			int user[] = new int[3];
			user[0] = sca1;
			user[1] = sca2;
			user[2] = sca3;
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(random[i]==user[j]) {
						if(i==j) {
							s++;
						}else if(i!=j) {
							b++;
						}
					}

					if(random[i]!=user[j]) {
						o++;
					}
					
				}
			}
			//System.out.println(i1+" "+ i2+ " "+i3); 
			//System.out.println(sca1+" "+ sca2+" "+sca3);
			System.out.println(N + " - S:"+s+ ", B:"+b+", O:"+o);
			System.out.print("> ");
			input = sca.nextInt();
			
		}
		

		System.out.println(N + " - S:"+s+ ", B:"+b+", O:"+o);
		System.out.println("(종료)");
		
		
		
		
		
		
		
		
		
		  
		
	}
}