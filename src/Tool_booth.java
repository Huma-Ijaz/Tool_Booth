import java.util.Scanner;

class b1{
    private int total_car;
    private double total_cash;

    b1(){
        total_car = 0;
        total_cash = 0;
    }

    b1(int t1 , double c1){
        total_cash = c1;
        total_car = t1;
    }

    void payingcars(){
        total_car ++;
        total_cash += 0.50;
    }

    void non_payingcars(){
        total_car ++ ;
    }

    void display(){
        System.out.println("Total Cars Passed: " + total_car);
        System.out.println("Total Cash Collected: " + total_cash);
    }
}

public class Tool_booth {
    public static void main(String[] args) {
        b1 booth = new b1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter P for Paying");
        System.out.println("Enter N for Non-Paying");
        System.out.println("Enter E for Exit");
        char ch;

        while(true){
            ch = sc.next().charAt(0);
            switch (ch){
                case 'P':
                booth.payingcars();
                break;

                case 'N':
                booth.non_payingcars();
                break;

                case'E':
                booth.display();
                break;

                default:
                    System.out.println("Invalid Input: ");
            }
        }
    }
}
