import java.util.Scanner;

public class BTTH_No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhap du lieu
        System.out.println("Nhap chieu cao (m): ");
        double height = sc.nextDouble();
        System.out.println("Nhap can nang (kg): ");
        double weight = sc.nextDouble();

        //Tinh BMI
        double BMI = weight/height;

        //Phan loai
        if (BMI < 18.5){
            System.out.println("Gầy");
        } else if (18.5 <= BMI && BMI < 24.9) {
            System.out.println("Bình thường");
        } else if (25 <= BMI && BMI < 29.9) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }
        sc.close();
    }
}
