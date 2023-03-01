import java.util.Scanner;
public class Main implements Convert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Any Option");
        System.out.println("1.US Dollar To Bangladeshi Taka");
        System.out.println("2.Bangladeshi Taka TO US Dollar");
        System.out.println("3.US Dollar To Indian Rupee");
        System.out.println("4.Indian Rupee To US Dollar");
        System.out.println("5.US Dollar to Australian Dollar");
        System.out.println("6.Australian Dollar To US Dollar");
        System.out.println("7.");
    Convert c1= new Convert();
    c1.bdtToUsd(105);
    c1.usdToBdt(2);
}
}
    