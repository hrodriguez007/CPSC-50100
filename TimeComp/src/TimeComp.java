import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		int seconds=0, h=0, m=0, s=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Input the time in seconds:");
		seconds=in.nextInt();
		h=seconds/3600;
		m=(seconds%3600)/60;
		s=seconds%60;
		
		System.out.print("\n");
		System.out.print("The time in HH:MM:SS is:"+h+":"+m+":"+s);
			

	}

}
