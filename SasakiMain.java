public class SasakiMain{
	public static void main(String[] args){
		long paper = 1L;
		int count = 0;
		while(true){
			count++;
			paper *= 2L;
			System.out.println(count + "回折り曲げた(" + paper + "mm)");
			if(paper >= 384400L * 1000L * 100L * 10L){
				System.out.println(count + "回折り曲げたら月に到達します");
				break;
			}
		}
	}
}
