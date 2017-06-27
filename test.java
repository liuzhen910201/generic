//泛型 generic
public class test{
	public static void main(String[] args){
		
		Integer n=2;
		Double m=1.0;
		double total=addition(m,n);
		System.out.println(total);
	}

	public static <T1 extends Number,T2 extends Number> double addition(T1 a,T2 b){
		double total=a.intValue()+b.doubleValue();
		return total;
	}
	public static int subtraction(int a,int b){
		if(max(a,b)){
			return a-b;
		}
		else
			return b-a;
	}
	public static int multiplication(int a,int b){
		return a*b;
	}
	public static int division(int a,int b){
		if(max(a,b)){
			return a/b;
		}
		else
			return -1;
	}
	public static boolean max(int a,int b){
		if (a>=b)
			return true;
		else
			return false;
	}
} 
