public class main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Thêm sinh viên vào stack
        stack.push(new Student("Alice", 101, 8.5f));
        stack.push(new Student("Bob", 102, 6.0f));
        stack.push(new Student("Charlie", 103, 4.5f));

        // Hiển thị danh sách sinh viên
        System.out.println("Danh sách sinh viên ban đầu:");
        stack.displayStudents();

        // Sắp xếp sinh viên theo điểm số
        stack.sortStudents();
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp:");
        stack.displayStudents();

        // Tìm kiếm sinh viên
        System.out.println("\nTìm kiếm sinh viên có ID 102:");
        Student foundStudent = stack.searchStudent(102);
        if (foundStudent != null) {
            System.out.println("Tìm thấy: " + foundStudent);
        }

        // Chỉnh sửa thông tin sinh viên
        System.out.println("\nChỉnh sửa thông tin sinh viên có ID 102:");
        stack.editStudent(102, "Bobby", 7.0f);
        stack.displayStudents();

        // Xóa sinh viên khỏi stack
        System.out.println("\nXóa sinh viên có ID 103:");
        stack.pop();
        stack.displayStudents();
    }
}
