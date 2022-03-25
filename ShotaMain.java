import java.util.*;
public class ShotaMain{
	public static void main(String[] args){
		long count = 0;
		long n =1;
		while(true){
			count ++;
			n=n*2;
			System.out.println(count+"回折り曲げたら"+n+"mm");
			if(n >= 384400000000L){
				System.out.println(count+"折り曲げたら月に到達します。");
				break;
			}
		}
	}
}

