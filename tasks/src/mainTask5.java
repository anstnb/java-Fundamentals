import java.util.Scanner;

public class mainTask5 {
    public static void main(String[] args){
        String [] arrayMonth = new String[] {"","Январь","Февраль","Март","Апрель",
                "Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scan.nextInt();
        scan.close();
        try {
            int month = num;
            if (month >= 1) {
                System.out.println(arrayMonth[month]);
            } else if (num == 0) {
                System.out.println("Такого месяца не существует");
            }
        } catch (Exception e) {
            System.out.println("Пожалуйста, введите число от 1 до 12");
        }
    }
}
