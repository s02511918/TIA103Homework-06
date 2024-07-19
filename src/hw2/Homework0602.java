package hw2;

public class Homework0602 {

	public static void main(String[] args) {
		System.out.println("第一題");
//• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int ck = 0;{
		int ckb;
		for (ckb=1 ; ckb<=1000 ; ckb++) 
		if(ckb % 2 == 0) 
			ck += ckb;
			System.out.println(ck);
		
			System.out.println("第二題");
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
}
	int ab = 1;{
	for (int abc=1 ; abc<=10 ; abc++) 
		ab *= abc;
		System.out.println(ab);
	
	}
	System.out.println("第三題");
	//100
	//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	int bc = 1;
	int ff = 1;
	while(ff<=10) {
		bc *= ff;
		ff++;
	}
	System.out.println(bc);
	System.out.println("第四題");
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
   int aa;
	for(aa = 1; aa<=10; aa++) {
	int bb;
	for(bb = 1; bb<=10; bb++) {
	if(aa == bb) {
	//	for(int bb=1;bb<=10;bb++) {
System.out.println(aa+"*"+bb+"=" + aa*bb +"\t");
	}
	}
	}
	System.out.println("第五題");
//	• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
     int sum1 = 0 ,mul1 = 10; 
	 for (int number1 = 1; number1 <= 49 ; number1++) {
	 if (number1 % mul1 == 4) { 
		 
	 }
	 else if (number1 / mul1 == 4) { 
	 }               
	 else {
	 System.out.print(number1 + " ");
	 sum1++; //總號碼數
	 }
	 }
	 System.out.println(" ");
	 System.out.println("第六題");
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
	        for (int i = 10; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	            System.out.println("第七題");
	    }
	 
//	• 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
	
        }




