import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		int count =0;
		long length =1L;
		while(true){
			count++;
			length *= 2;
			System.out.println(count + "回折り曲げた(" + length + "mm)");
			if(length >=384400000000L){
				break;
			}
		}
		System.out.println(count +"回折り曲げたら月に到達します。");
	}
}
