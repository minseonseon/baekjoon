import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			String[] str = sc.next().split("");
			System.out.println(str[0] + str[str.length -1]);
		}
		sc.close();
	}
}
