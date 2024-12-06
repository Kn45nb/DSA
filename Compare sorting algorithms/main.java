import java.util.Random;

public class main {
    public static void main(String[] args) {
        // Số lượng sinh viên ngẫu nhiên (có thể thay đổi x)
        int x = 100;

        // Tạo danh sách sinh viên ngẫu nhiên
        StudentStack studentStackMerge = new StudentStack();
        StudentStack studentStackBubble = new StudentStack();
        StudentStack studentStackQuick = new StudentStack();

        Random random = new Random();
        for (int i = 1; i <= x; i++) {
            studentStackMerge.push(new Student(
                "ID" + i,
                "Student" + i,
                random.nextFloat() * 10 // Điểm số ngẫu nhiên từ 0 đến 10
            ));
        }

        // Sao chép stack cho các thuật toán sắp xếp
        studentStackBubble.copyFrom(studentStackMerge);
        studentStackQuick.copyFrom(studentStackMerge);

        // Hiển thị danh sách sinh viên ban đầu
        System.out.println("Initial students:");
        studentStackMerge.displayStudents();

        // Sắp xếp bằng Merge Sort
        System.out.println("\nSorting students using Merge Sort:");
        long startMerge = System.nanoTime();
        studentStackMerge.sortStudentsMerge();
        long endMerge = System.nanoTime();
        studentStackMerge.displayStudents();
        System.out.println("Time taken by Merge Sort: " + (endMerge - startMerge) + " ns");

        // Sắp xếp bằng Bubble Sort
        System.out.println("\nSorting students using Bubble Sort:");
        long startBubble = System.nanoTime();
        studentStackBubble.sortStudentsBubble();
        long endBubble = System.nanoTime();
        studentStackBubble.displayStudents();
        System.out.println("Time taken by Bubble Sort: " + (endBubble - startBubble) + " ns");

        // Sắp xếp bằng Quick Sort
        System.out.println("\nSorting students using QuickSort:");
        long startQuick = System.nanoTime();
        studentStackQuick.sortStudentsQuick();
        long endQuick = System.nanoTime();
        studentStackQuick.displayStudents();
        System.out.println("Time taken by QuickSort: " + (endQuick - startQuick) + " ns");
    }
}