import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[]ags){
        int year;
        Scanner input= new Scanner(System.in);

        System.out.print("Yılı Giriniz:");
        year= input.nextInt();

        if (year %4 ==0 && year %400 ==0){
            System.out.println(year+"Bir artık yıldır.");
        } else {
            System.out.println(year+"Bir artık yıl değildir.");
        }
    }
}
