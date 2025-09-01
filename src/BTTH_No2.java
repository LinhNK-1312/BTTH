import java.util.Scanner;

public class BTTH_No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhap du lieu
        System.out.println("Nhap ten sinh vien: ");
        String name = sc.nextLine();
        System.out.println("Nhap diem Toan: ");
        double DiemToan = sc.nextDouble();
        System.out.println("Nhap diem Ly: ");
        double DiemLy = sc.nextDouble();
        System.out.println("Nhap diem Hoa: ");
        double DiemHoa = sc.nextDouble();

        //Tinh diem trung binh
        double DTB = (DiemToan + DiemLy + DiemHoa) / 3;

        //Xep loai hoc luc
        String XepLoai;
        if(DTB < 5){
            XepLoai = "Yếu";
        } else if (DTB >= 5 && DTB < 6.5) {
            XepLoai = "Trung bình";
        } else if (DTB >= 6.5 && DTB < 8) {
            XepLoai = "Khá";
        } else {
            XepLoai = "Giỏi";
        }

        //In ra ket qua
        System.out.println("Tên: " + name + ",Điểm TB: " + DTB + ",Xếp loại: " + XepLoai);
    }
}
