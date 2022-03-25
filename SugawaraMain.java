import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		int count = 0;
		long paper = 1L;
		while(paper < 384400000000L){
			count++;
			paper *= 2L;
			System.out.println(count+"回折りました"+"("+paper+"mm)");
		}
		System.out.println(count+"回で月に届きました");
	}
}
