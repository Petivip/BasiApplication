
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter your number here: ");
        Scanner myVar=new Scanner(System.in);
        int number=myVar.nextInt();
        int newNumber=(((number+5)*2)-7);
        System.out.println(newNumber);

    }
}
