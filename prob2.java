import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("please insert num");
		int num= scanner.nextInt();
		String str=" ";
		String reversed=" ";

		while(num!=0){
			str+=num%10;
			num=num/10;
		}
		System.out.println("str="+str);
		for(int i=str.length()-1;i>0;i--){
			
			reversed+=str.charAt(i);
		}

		System.out.println("reversed="+reversed);

			
		 
			 
		 }
		
			
		}
		
	

	


