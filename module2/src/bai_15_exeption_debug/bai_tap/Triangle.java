package bai_15_exeption_debug.bai_tap;
import java.util.Scanner;
public class Triangle {
    public Triangle(double a, double b, double c) {
    }

    static void validate(double a, double b, double c) throws IllegalTriangleException {
        if (a + b > c && b + c > a && c + a > b && a > 0 && b > 0 && c > 0) {
            System.out.println("Đây là một tam giác");
        } else {
            throw new IllegalTriangleException("Không phải tam giác");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập cạnh a: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh b: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh c: ");
                double c = Double.parseDouble(scanner.nextLine());
                Triangle triangle;
                triangle = getTriangle(a, b, c);
                validate(a, b, c);
                System.out.println(triangle.toString());
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e + " Nhập lại!");
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại kí tự số");
            } catch (Exception e) {
                System.out.println("Lỗi rồi, nhập lại");
            } finally {
                System.out.println("finally");
            }
        }


    }

    private static Triangle getTriangle(double a, double b, double c) {
        Triangle triangle;
        triangle = new Triangle(a, b, c);
        return triangle;
    }

}
