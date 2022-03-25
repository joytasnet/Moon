import java.util.*;
public class Matsuoka{
	public static void main(String[] args){
		long dis=384400000000l,paper=1l;
		int count=0;
		while(paper<384400000000l){
			count++;
			paper*=2;
			System.out.println(count+"回折り曲げた("+paper+")");
			if(paper>=dis){
				break;
			}
		}
		System.out.println("折った回数は"+count+"回");
	}
}
