import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		long kami = 1;
		int count = 0;
		while(true){
			count++;
			kami = kami * 2;
			System.out.println(count + "回折り曲げた(" +kami +")mm");
			if(kami >= 3844000000L){
				break;
			}
		}
		System.out.println(count + "回折り曲げたら月に到達します。");
	}
}
