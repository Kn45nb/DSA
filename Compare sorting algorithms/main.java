public class main {
    public static void main(String[] args) {
        StudentStack studentStackMerge = new StudentStack();
        StudentStack studentStackBubble = new StudentStack();

        // Thêm sinh viên vào stack
        studentStackMerge.push(new Student("101", "Alice", 8.5F));
        studentStackMerge.push(new Student("102", "Bob", 6.0F));
        studentStackMerge.push(new Student("103", "Charlie", 4.5F));
        studentStackMerge.push(new Student("104", "David", 7.8F));
        studentStackMerge.push(new Student("105", "Eva", 9.1F));

        // Sao chép stack để sử dụng cho Bubble Sort
        studentStackBubble.copyFrom(studentStackMerge);

        // Hiển thị ban đầu
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
    }
}