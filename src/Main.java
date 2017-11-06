import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int n,a,counter=0;
        n=in.nextInt();
        while(n>0)
        {
            a=n%10;
            if(a==7)
                counter=counter+1;
            n=n/10;
        }
System.out.print(counter);
    }
}
