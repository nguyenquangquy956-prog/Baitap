package Baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            studentController.function();
            int n = scanner.nextInt();
            scanner.nextLine();
            switch (n) {
                case 1:
                    studentController.addStudent();
                    break;
                case 2:
                    studentController.printStudentList();
                    break;
                case 3:
                    studentController.searchStudentByName();
                    break;
                case 4:
                    studentController.updateStudentGpa();
                    break;
                case 5:
                    studentController.deleteStudent();
                    break;
                case 6:
                    studentController.sortStudentsByGpaDescending();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Người dùng đã nhập dữ liệu không xác định.Vui lòng nhập đúng từ 1-7");
                    System.out.println("Nhấn Enter để tiếp tục!");
                    scanner.nextLine();
                    break;
            }
        }
    }
}