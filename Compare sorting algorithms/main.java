import java.util.Random;

public class main {
    public static void main(String[] args) {
        // thay đổi random
        int x = 100;

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
        System.out.println("\nSorting students using Merge Sort...");
        long startMerge = System.nanoTime();
        studentStackMerge.sortStudentsMerge();
        long endMerge = System.nanoTime();
        System.out.println("Time taken by Merge Sort: " + (endMerge - startMerge) + " ns");

        // Sắp xếp bằng Bubble Sort
        System.out.println("\nSorting students using Bubble Sort...");
        long startBubble = System.nanoTime();
        studentStackBubble.sortStudentsBubble();
        long endBubble = System.nanoTime();
        System.out.println("Time taken by Bubble Sort: " + (endBubble - startBubble) + " ns");

        // Sắp xếp bằng Quick Sort
        System.out.println("\nSorting students using QuickSort...");
        long startQuick = System.nanoTime();
        studentStackQuick.sortStudentsQuick();
        long endQuick = System.nanoTime();
        System.out.println("Time taken by QuickSort: " + (endQuick - startQuick) + " ns");
    }
}