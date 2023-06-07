import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] arr = new char[S.length()];
		
		int i = sc.nextInt();
		
		for(int j=0; j<S.length(); j++) {
			arr[j] = S.charAt(j);	
		}
		System.out.println(arr[i-1]);
		sc.close();
	}
}