package lambdaexpression;
interface Calculator{
	int calculate(int x,int y);
}

public class LambdaExample2 {

	public static void main(String[] args) {
//		Calculator c1 = (int x,int y) ->{
//			int sum=x+y;
//			return sum;
//		};
		Calculator c1=(x,y)->x+y;// here it is returning x+y.so this can't be used in void 
		Calculator c2=(x,y)->x-y;
		Calculator c3=(x,y)->x>y ? x:y;
		int sum=c1.calculate(10,20);
		System.out.println("sum is: "+sum);
		int difference=c2.calculate(20,10);
		System.out.println("difference is: "+difference);
		int largest=c3.calculate(10,20);
		System.out.println("largest is: "+largest);
		//if we are writing a multi line statement  use braces and we have to write return statement manually

	}

}
