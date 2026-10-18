package Baitap;
import java.lang.classfile.constantpool.IntegerEntry;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentController {
    private ArrayList<Student> studentList;
    private Scanner scanner = new Scanner(System.in);
    public void function(){
        System.out.println("==================================================");
        System.out.println("        HỆ THỐNG QUẢN LÝ SINH VIÊN");
        System.out.println("==================================================");
        System.out.println("1. Thêm mới sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo tên");
        System.out.println("4. Cập nhật điểm GPA theo mã sinh viên");
        System.out.println("5. Xóa sinh viên theo mã sinh viên");
        System.out.println("6. Sắp xếp danh sách sinh viên theo GPA giảm dần");
        System.out.println("7. Thoát chương trình");
        System.out.println("==================================================");
        System.out.println("Vui lòng chọn chức năng (1-7):");
    }
    public void addStudent(){
        System.out.println("Vui lòng nhập mã sinh viên: ");
        int id = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Vui lòng nhập tên của sinh viên: ");
        String fullName = scanner.nextLine().trim();
        System.out.println("Vui lòng nhập email của sinh viên: ");
        String email = scanner.nextLine();
        System.out.println("Vui lòng nhập số điện thoại của sinh viên: ");
        String phone = scanner.nextLine();
        System.out.println("Vui lòng nhập gpa của sinh viên: ");
        double gpa = Double.parseDouble(scanner.nextLine().trim());
        Student student = new Student(id, fullName, email, phone, gpa);
        studentList.add(student);
        System.out.println("Thông tin của sinh viên mới: " + "\nid: " + id + "\nFullName: " + fullName + "\nEmail: " + email + "\nPhone: " + phone + "\nGpa: " + gpa);
        System.out.println("Nhấn Enter để tiếp tục!");
        scanner.nextLine();
    }
    public void printStudentList(){
    if (studentList.isEmpty()) {
        System.out.println("Danh sách rỗng");
        return;
        }
        for (Student student : studentList) {
            student.displayData();
        }
        System.out.println("Nhấn Enter để tiếp tục!");
        scanner.nextLine();
    }
    public void searchStudentByName() {
        System.out.print("Nhập tên cần tìm: ");
        String keyword = scanner.nextLine().trim().toLowerCase();
        boolean found = false;
        for (Student student : studentList) {
            if (student.getFullName().toLowerCase().contains(keyword)) {
                System.out.println("Thông tin cần tìm: ");
                student.displayData();
                scanner.nextLine();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên phù hợp.");
        }
    }
    public void updateStudentGpa() {
        System.out.print("Nhập id cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine().trim());
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.displayData();
                System.out.print("Nhập GPA mới: ");
                double newGpa = Double.parseDouble(scanner.nextLine().trim());
                student.setGpa(newGpa);
                System.out.println("Đã cập nhật GPA.");
                scanner.nextLine();
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có id " + id + ".");
    }
    public void deleteStudent(){
        System.out.print("Nhập id cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine().trim());
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.displayData();
                boolean remove = studentList.removeIf(sv -> sv.getId() == id);
                if(remove){
                    System.out.println("Id " + id + " đã bị xóa khỏi danh sách thành công.");
                    scanner.nextLine();
                    break;
                }
            }
        }
    }
    public void sortStudentsByGpaDescending(){
        studentList.sort((s1,s2) -> Integer.compare(s1.getId(), s2.getId()));
        for(Student student : studentList){
            student.displayData();
            scanner.nextLine();
            break;
        }
    }
    public StudentController() {
        studentList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
}
