package thuchanh;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        // Khoi tao doi tuong thuoc lop Rectangle
        rectangle rec = new rectangle(width,height);

        // Goi cac phuong thuc
        System.out.println(rec.display());
        System.out.println("Area is: "+rec.getArea());
        System.out.println("Perimeter is: "+rec.getPerimeter());
    }
}
