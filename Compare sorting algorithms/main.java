import java.util.Random;

public class main {
    public static void main(String[] args) {
        // thay đổi random
        int x = 50000;

        StudentStack studentStackMerge = new StudentStack();
        StudentStack studentStackBubble = new StudentStack();
        StudentStack studentStackQuick = new StudentStack();

        Random random = new Random();
        for (int i = 1; i <= x; i++) {
            studentStackMerge.push(new Student(
                "ID" + i,
                "Student" + i,
                random.nextFloat() * 10
            ));
        }

        studentStackBubble.copyFrom(studentStackMerge);
        studentStackQuick.copyFrom(studentStackMerge);

        System.out.println("Initial students:");
        studentStackMerge.displayStudents();

        // Sắp xếp bằng Merge Sort
        System.out.println("\nMerge Sort:");
        long startMerge = System.nanoTime();
        studentStackMerge.sortStudentsMerge();
        long endMerge = System.nanoTime();
        System.out.println((endMerge - startMerge) + " ns");

        // Sắp xếp bằng Bubble Sort
        System.out.println("\nBubble Sort");
        long startBubble = System.nanoTime();
        studentStackBubble.sortStudentsBubble();
        long endBubble = System.nanoTime();
        System.out.println((endBubble - startBubble) + " ns");

        // Sắp xếp bằng Quick Sort
        System.out.println("\nQuickSort");
        long startQuick = System.nanoTime();
        studentStackQuick.sortStudentsQuick();
        long endQuick = System.nanoTime();
        System.out.println((endQuick - startQuick) + " ns");
    }
}