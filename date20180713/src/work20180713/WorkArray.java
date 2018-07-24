package work20180713;

import java.util.Scanner;

import org.junit.Test;

public class WorkArray {

	//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
	//小兔子长到第三个月后每个月又生一对兔子，
	//假如兔子都不死，问每个月的兔子总数为多少？   
	//这是一个菲波拉契数列问题
	//第一题：
	@Test
	public void test()
	{
		System.out.println("请输入月份：");
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int rabbit = rabbit(num);
		System.out.println("第"+num+"个月:"+rabbit(num)+"对");
		
	}
	public int rabbit(int i)
	{
		//第一个月  1对
		
		//第二个月 1对
		
		//第三个月  2对
		
		//第四个月  3对
		
		//第五个月  5对
		
		//第六个月 8对
		
		//第七个月  
		if (i == 1||i == 2) {
			return 1;
			
		}else if (i<0) {
			return 0;
		}else {
			return rabbit(i-1)+rabbit(i-2);
		}
	/*	int[] a = new int[i];
		a[0] = 1;
		a[1] = 1;
		for (i = 2; i < a.length-1; i++) {
			a[i] = a[i-1]+a[i-2];
			
		}
		if (i == 0||i==1) {
			System.out.println("第"+i+"个月:"+a[0]+"对");
		}else if (i>1) {
			System.out.println(a[i]);
		}else {
			System.out.println("输入有误！");
		}*/
	
	}
	
	//题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下
	//求它在     第10次落地时，共经过多少米？第10次反弹多高？
	@Test
	public void test2()
	{
		
		double down = 100;
		double sum1 = 0;
		double  sum2 = 0;
		
		for (int i = 0; i < 10; i++) {
			sum1+=down;//高度
			down/=2;
			if (i<9) {
				sum2 = sum2+down;
			}
			
		}
		System.out.println("第10次落地时,经过"+(sum1+sum2)+"米");
		System.out.println("第十次:"+down+"米");
	/*	
		for (int i = 0; i < 10; i++) {
			
		}
		}*/
		
		
	}
	
	
	/*题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，
	请问该数是多少？  */
	@Test
	public void test3()
	{
		
		for (int i = 0; i < 100000; i++) {
			double x = Math.sqrt(i + 100);
			double y = Math.sqrt(i + 268);
			if (x == (int) x && y == (int) y) {
				System.out.println("这个数是:" + i);
				continue;
			}
		}
		
	
	}
		
		
/*
	题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...
	求出这个数列的前20项之和
	*/
	@Test
	
	public void test4()
	{
		double sum = 0;
		double a1 = 2;
		double a2 = 1;
		double an = 0;
		
		for (int i = 0; i < 20; i++) {
			sum+=a1/a2;
			an = a1+a2;
			a2 = a1;
			a1 = an;
		}
		System.out.println("前20项的和是:"+sum);
	}
	
	
	/*题目：求1+2!+3!+...+20!的和*/
	@Test
	public void test5()
	{
		long sum = 0;
		long n = 1;
		
		for (int i = 1; i <= 20; i++) {
			n*=i;
			sum+=n;
			System.out.println(n);
		}
		System.out.println(sum);
		
	}
	
/*	
	题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
	问第4个人岁数，他说比第3个人大2岁。
	问第三个人，又说比第2人大两岁。
	问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。
	请问第五个人多大？ */
	@Test
	public void test6()
	{
		int n = 10;
		for (int i = 1; i < 5; i++) {
			n+=2;
		}
		System.out.println(n);
	
	}
	
	/*
	题目：求0—7所能组成的奇数个数。   
	//组成1位数是4个。
	//组成2位数是7*4个。
	//组成3位数是7*8*4个。
	//组成4位数是7*8*8*4个。
*/
	@Test
	public void test7()
	{
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < 7; i++) {
			if (i==0) {
				count = 4;
			}else if (i==1) {
				count*=7;
			}else if (i==6) {
				count*=7;
			}else {
				count*=8;
			}
			System.out.println("0~7组成" + (i+1) + "位数，有：" + count + "个");
			sum+=count;
		}
		System.out.println("总计为：" + sum);
	}
	
/*	题目：判断一个整数能被几个9整除 */
	@Test
	public void test8()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int a = sc.nextInt();
		
		int b = a/9;
		int c = a%9;
		if (c==0) {
			System.out.println(a+"可以被"+b+"个9整除");
		}else {
			System.out.println(a+"不能9整除");
		}
	}
	
	
/*	题目：两个乒乓球队进行比赛，各出三人。
	甲队为a,b,c三人，乙队为x,y,z三人。
	已抽签决定比赛名单。有人向队员打听比赛的名单。
	a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。*/
	@Test
	public void test9()
	{
		for(char i ='x';i<='z';i++){
		    for(char j ='x';j<='z';j++){
		        if(i!=j)//这里放一个判断，比赛队员不能重复比赛，判断写在外面又可以减少循环次数
		            for(char k = 'x';k<='z';k++){
		                if(i!=k&&j!=k)//同上，排除相同
		                    if(i!='x'&&k!='x'&&k!='z')//这里根据题意排除掉不符合的名单
		                        System.out.println("a和"+i+"\n"+"b和"+j+"\n"+"c和"+k+"\n");
		            }
		    }
		}
	}
	
//	题目：对10个数进行排序   
	@Test
	public void test10()
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入第"+(i+1)+"个数:");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
//	题目：求一个3*3矩阵对角线元素之和 
	@Test
	public void test11()
	{
		int[][] a= new int[3][3];
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				Scanner sc = new Scanner(System.in);
				a[i][j] = sc.nextInt();
				if (i==j) {
					sum1+=a[i][j];
				}
				if (j==a.length-i-1) {
					sum2+=a[i][j];
				}
				
			}
			
		}
		//矩阵
		for (int[] is : a) {
			System.out.println();
			for (int i : is) {
				System.out.print(i);
			}
		}
		System.out.println("矩阵对角线元素之和是:"+sum1+"和"+sum2);
		
		
	}
//	题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。   
	@Test
	public void test12()
	{
		System.out.println("请输入一串字符串:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		count(str);
	}
	public void count(String str)
	{
	    String E1 = "[\u4e00-\u9fa5]"; //汉字范围
	    String E2 = "[a-zA-Z]"; //字母范围
		String E3 = "[0-9]"; //数字范围
		String E4 = "[ ]"; //空格
	    int countChinese = 0;
		int countLetter = 0;
		int countNumber = 0;
		int countSpace = 0;
		int countOther = 0;
		
		char[] arrayChar = str.toCharArray();
		String[] arrayString = new String[arrayChar.length]; 
		for (int i=0; i<arrayChar.length; i++)
			arrayString[i] = String.valueOf(arrayChar[i]);
 
		for (String str2: arrayString) { //意思将引用arrayString赋值给str2 
		//相当于for(int i=0; i<arrayString.length; i++)
			if(str2.matches(E1)) {
				countChinese++;
			}else if(str2.matches(E2)) {
				countLetter++;
			}else if(str2.matches(E3)) {
				countNumber++;
			}else if(str2.matches(E4)) {
				countSpace++;
			}else {
				countOther++;
			}
		}
		System.out.println("输入的字符串中字母有: " + countLetter + "个");
		System.out.println("输入的字符串中数字有: " + countNumber + "个");
		System.out.println("输入的字符串中空格有: " + countSpace + "个");
		System.out.println("输入的字符串中汉字有: " + countChinese + "个");
		System.out.println("输入的字符串中其他有: " + countOther + "个");
	}
	
	/*题目：给一个不多于5位的正整数，
	要求：一、求它是几位数，二、逆序打印出各位数字。   
	//使用了长整型最多输入18位

*/
	@Test
	public void test13()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不小于5位的数字:");
		int n = sc.nextInt();
		
		int a = n/10000;
		int b= n%10000/1000;
		int c =n%1000/100;
		int d =n%100/10;
		int e =n%10;
		
		if (a != 0){
		    System.out.println("5 位数："+e+d+c+b+a);
		}else if (b!=0) {
			System.out.println("4位数:"+e+d+c+b);
		}else if (c!=0) {
			System.out.println("3位数:"+e+d+c);
		}else if (d!=0) {
			System.out.println("2位数:"+e+d);
		}else {
			System.out.println("1位数:"+e);
		}
	
	}
	
	
//	题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
	@Test
	public void test14()
	{
		int[] a = {1,4,6,7,9,11,13,16,19,20};
		int num;
		System.out.println("插入前:");
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("请输入一个插入的数字:");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		fun(a,b);
		for (int i : a) {
			System.out.println(i);
		}
		
	}
	
	
	public void fun(int[] a,int b)
	{
		a[10] = b;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>a[10]) {
				int c = a[i];
				a[i] = a[10];
				a[10] = c;
				
			}
		}
		System.out.println("插入一个数据后:");
		for (int j = 0; j < a.length+1; j++) {
			System.out.println(a[j]);
		}
		
	}
}
	

	
	
	
	
	
	
	
