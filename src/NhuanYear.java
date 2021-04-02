import java.util.Scanner;

public class NhuanYear {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra ");
        short year1 = scanner2.nextShort();
        if (year1%100==0 && year1%400==0){
            System.out.println("Năm "+ year1 + " là năm nhuận ");
        }else if(year1%100==0 && year1%400 != 0){
            System.out.println("Năm "+ year1 + " không phải năm nhuận ");
        }else if(year1%4==0 && year1%100 !=0){
            System.out.println("Năm "+ year1 + " là năm nhuận ");
        }else {
            System.out.println("Năm "+ year1 + " không phải năm nhuận ");
        }
        System.out.printf("%d",year1);
    }

}

