//ex1

class Logical{
  public static void main(String[] args){
		
		boolean a = false;
		boolean b = false;

		System.out.println(a&&b);
	}
}
//하나라도 false일 경우 false

//ex2

class Logical 
{
	public static void main(String[] args) 
	{
		
		boolean a = true;
		boolean b = false;

		System.out.println(a||b);
	}
}
//하나라도 true일 경우 true
//c<b<a => c<b&&b<a로 해야 연산이 수행이됨

//ex3
/*과목의 점수를 입력 받는다.

한과목이라도 70점 미만이라면 과락으로 불합격이다.

실행 예시

첫번째 과목 : 100
두번째 과목 : 90
세번째 과목 : 60
합격 여부 : false

or

첫번째 과목 : 100
두번째 과목 : 90
세번째 과목 : 70
합격 여부 : true*/

import java.util.Scanner;

class Logical 
{
	public static void main(String[] args) 
	{
		boolean result = false;
		Scanner input = new Scanner(System.in);

		int fir,sec,thr;

		System.out.print("첫번째 과목 : ");
		fir = input.nextInt();

		System.out.print("두번째 과목 : ");
		sec = input.nextInt();

		System.out.print("세번째 과목 : ");
		thr = input.nextInt();

		System.out.println("합격 여부 : " + ((fir>=70)&&(sec>=70)&&(thr>=70)));
    //괄호로 연산을 우선적으로 해줘야한다.
	}
}
//ex4
/*정상체중 
(키-100)X0.9 의 값에  -10kg 부터 +10kg

키와 몸무게를 입력 받아 정상 체중 여부를 출력한다.

실행 예시)

키 입력 : 180
몸무게 입력 : 82
정상체중 여부 : true

or

키 입력 : 180
몸무게 입력 : 62
정상체중 여부 : true

or

키 입력 : 180
몸무게 입력 : 52
정상체중 여부 : false*/

import java.util.Scanner;

class Logical2 
{
	public static void main(String[] args) 
	{

		int height, weight;
		double result;
		boolean test;

		Scanner sys = new Scanner(System.in);

		System.out.print("키 입력 : ");
		height = sys.nextInt();

		System.out.print("몸무게 입력 : ");
		weight = sys.nextInt();
		
		result = (height-100)*0.9;

		test = ((result-10<=weight)&&(result+10>=weight));

		System.out.println("정상체중 여부 : " + test);

	}
}

//ex5
/*숫자를 입력 받아 홀수, 짝수여부 판별

숫자 입력 : 24
짝수여부 : true
홀수여부 : false*/

import java.util.Scanner;

class Num
{
	public static void main(String[] args) 
	{
		int num;
		Scanner input = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		num = input.nextInt();

		boolean result = num%2==0;

		System.out.println("짝수 여부 : " + result);
		System.out.println("홀수 여부 : " + !result);

	}
}

//ex6
/* 세 과목 점수를 입력 받아, 합격 여부를 출력하시오
조건 : 한 과목이라도 70점 이상이라면 합격*/

import java.util.Scanner;

class Grade 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int fir,sec,thr;
		boolean result;

		System.out.print("첫번째 과목 : ");
		fir = input.nextInt();

		System.out.print("두번째 과목 : ");
		sec = input.nextInt();

		System.out.print("세번째 과목 : ");
		thr = input.nextInt();

		result = ((fir>=70)||(sec>=70)||(thr>=70));

		System.out.println("합격 여부 : " + result);
	}
}

//ex7
/*국어, 영어, 수학의 점수를 입력 받는다.
영어는 반드시 80점 이상이어야 통과 하고, 평균은 반드시 70점이 넘어야 한다.
한과목이라도 50점 이하인 경우는 과락으로 불합격이다.
평균과 합격 여부를 출력하시오.
*/

import java.util.Scanner;

class School
{
	public static void main(String[] args) 
	{
		int kr, eng, math;
		double total;
		boolean result;

		Scanner input = new Scanner(System.in);

		System.out.print("국어 점수 : ");
		kr = input.nextInt();

		System.out.print("영어 점수 : ");
		eng = input.nextInt();

		System.out.print("수학 점수 : ");
		math = input.nextInt();

		total = (kr+eng+math)/3.0;
		result = (total>=70)&&(eng>=80)&&(kr>50)&&(math>50);

		System.out.println("평균 점수 : " + total + "합격 여부 : " + result);

	}
}
