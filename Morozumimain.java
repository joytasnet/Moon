import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		/*
		 * 厚さ１mmの紙がある。これを２つに折り曲げると2mmになる。もう一度折り曲げると4mm…. この作業を繰り返し行うと何回で月に届くであろうか？。なお月までの距離は384,400 kmである。
		 * 1回折り曲げた(2mm)
		 2回折り曲げた(4mm)
		 3回折り曲げた(8mm)
		 4回折り曲げた(16mm)
		 5回折り曲げた(32mm)
		 以下略
		 ?回折り曲げたら月に到達します。
		 1mm = 0.000001km
		 */

		long n = 1L;
		long count = 0;
		while(true){
			count++;
			n = n*2;
			System.out.println(count + "回折り曲げた" + "(" + n + "mm )" );
			if(n > 384400000000L ){
				System.out.println(count + "回折り曲げたら月に到達します");
				break;
			}
		}
	}
}
