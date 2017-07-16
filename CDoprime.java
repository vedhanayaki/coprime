package player;
import java.util.Scanner;
public class CDoprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Numbers ");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int max;
if(a>=b){
	max=a;
}
else{
	max=b;
}
int count=0;
for(int i=2;i<=max;i++){
	if(a%i==0 && b%i==0){
		count++;
	}
	if(count==0){
		System.out.println("Numbers is coPrime");
	}
	else{
		System.out.println("Number is not a Prime");
	}
}
	}

}
