import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		long n = 1;
		int count = 0;
		while(true){
			count++;
			n=n*2;
			System.out.println(count+"回折り曲げた("+n+"mm)");
			if(n>384400000000L){
				break;
			}
		}
		System.out.println(count+"回折り曲げたら月に到達します。");
	}
}
