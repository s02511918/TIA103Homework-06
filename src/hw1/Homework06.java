package hw1;

public class Homework06 {
	
	public static void main(String[] args) {
		int a = 12 , b = 6;
		int c = a+b, d=a*b;
		
		System.out.println("12+6="+c);
		System.out.println("12*6="+d);
		
		System.out.println("第二題");
		int egg =200;
		int egg1=200/12;
		int egg2=200%12;
		
		System.out.println("一共是"+egg1+"打蛋"+"剩下"+egg2+"顆蛋");
		
		System.out.println("第三題");
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int day =60*60*24;
		int hour=60*60;
		int min =60;
		System.out.println(256559/day+"天"+256559%day/hour+"小時"+256559%day%hour/min+"分"+256559%day%hour%min+"秒");
		
//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		System.out.println("第四題");
		 final double round =3.14;
		 final double round1 = 5*5*round;
		 final double round2 = 10*round;
		System.out.println("此圓形面積為"+round1);
		System.out.printf("此圓形周長為=%.2f%n",round2);
		 
//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		System.out.println("第五題");
		
		System.out.printf("%.0f\n",1500000*Math.pow(1.02,10));
		
		
//		• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
		int y = 5 +5;
		int z = 5+'5';
		String w = 5 +"5";
		
		System.out.println("第六題");
		System.out.println("5+5="+ y); //變數+變數=變數
		System.out.println("5+‘5’="+ z); // 變數+字元=變數+編碼器的值
		System.out.println("5+“5”="+ w);// 變數+字串 = 字串
		
	}
}


     