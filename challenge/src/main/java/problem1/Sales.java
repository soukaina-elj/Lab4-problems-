package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of salespeople : ");
        int n = scan.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of salespeople");
            return;
        }
        sales = new int[n];
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int min_index = 0 ;
        int max_index = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(sales[i] < sales[min_index]){
                min_index = i;
            }
            if(sales[i] > sales[max_index]){
                max_index = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("The average sale is : "+ (sum /(double)sales.length));
        System.out.println("Salesperson "+ (max_index+1) +" had the highest sale with $"+ sales[max_index]);
        System.out.println("Salesperson "+ (min_index+1) +" had the lowest sale with $"+ sales[min_index]);
        System.out.print("Enter a value : ");
        int a = scan.nextInt();
        int counter = 0 ;
        System.out.println("The salespeople who exceeded $"+a);
        for (int i=0; i<sales.length; i++){
            if(a  < sales[i]){
                System.out.println("Salesperson "+ (i+1)+ " :with $ "+ sales[i]);
                counter ++;
            }
        }
        System.out.println("The total number of salespeople whose sales exceeded $"+ a+ " is : "+ counter);





    }
}