public class main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Student student3 = new Student("Charlie", 103);

        stack.push(student1);
        stack.push(student2);
        stack.push(student3);

        stack.displayStudents(); // Hiển thị tất cả sinh viên

        stack.editStudent(102, "Bobby"); // Chỉnh sửa thông tin sinh viên
        stack.displayStudents();

        stack.deleteStudent(103); // Xóa sinh viên
        stack.displayStudents();

        Student found = stack.searchStudent(101); // Tìm kiếm sinh viên
        if (found != null) {
            System.out.println("Found: " + found);
        }

        stack.pop(); // Loại bỏ sinh viên từ stack
        stack.displayStudents();
    }
}
