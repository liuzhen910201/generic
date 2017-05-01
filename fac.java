package sample;
public class fac{
	public static void main(String[] args){
		int total=0;
		int n=1;
		int m=6;
		//total=factor(6);//再帰
		//total=ff(1,1,6);//末尾再帰
		for(int i=1;i<=m;i++){
			n=i*n;
		}
		total=n;
		System.out.println(total);
	}
	public static int factor(int n){//再帰
		if (n==1)
			return n;
		else
			return n*factor(n-1);
	}
	public static int ff(int x,int y,int n){//末尾再帰
		if(y>n)
			return x;
		else
			return ff(x*y,y+1,n);
	}
}
