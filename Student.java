package Baitap;
public class Student {
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private double gpa;
    public Student() {}
    public Student(int id, String fullName, String email, String phone, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.gpa = gpa;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public double getGpa() {
        return gpa;
    }
    public void displayData(){
        System.out.println("-Thông tin của sinh viên-" + "\nid: " + this.id + "\nFullName: " + this.fullName + "\nEmail: " + this.email + "\nPhone: " + this.phone + "\nGpa: " + this.gpa);
    }
}