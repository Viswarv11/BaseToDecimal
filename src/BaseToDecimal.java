import java.util.Scanner;

public class BaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        System.out.println("Enter the base:");
        int base=scanner.nextInt();
        int ans=0;
        int temp=0;
        int power=0;
        while(number>0){
            temp=number%10;
            ans+=(temp*Math.pow(base,power));
            power++;
            number/=10;
        }
        System.out.println("Decimal:"+ans);
    }
}
