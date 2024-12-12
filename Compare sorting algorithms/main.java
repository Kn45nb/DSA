import java.util.Random;

public class main
{
    public static void main(String[] args)
    {
        StudentStack studentStack_Bubble = new StudentStack();
        StudentStack studentStack_Merge = new StudentStack();
        StudentStack studentStack_Quick = new StudentStack();
        
        for (int i = 0; i < 100; i++)
        {
            studentStack_Bubble.push(new Student("101", "Alice", new Random().nextInt(100) ));
            studentStack_Merge.push(new Student("102", "Bob", new Random().nextInt(100) ));
            studentStack_Quick.push(new Student("103", "Charlie", new Random().nextInt(100) ));
        }

//----------------------------------------------------------------------------------------------------------------        
        long st = System.nanoTime();

            studentStack_Bubble.sortStudents3();

        long ed = System.nanoTime();
        long las = ed - st;
        System.out.print("BubbleSort:   " + las + "\n");

        st = System.nanoTime();

            studentStack_Merge.sortStudents1();

        ed = System.nanoTime();
        las = ed - st;
        System.out.print("MergeSort:    " + las + "\n");

        st = System.nanoTime();

            studentStack_Quick.sortStudents2();

        ed = System.nanoTime();
        las = ed - st;
        System.out.print("QuickSort:    " + las + "\n");






        /*System.out.println("Initial students:");
        studentStack.displayStudents();

        System.out.println("\nSorting students by marks:");
        studentStack.sortStudents();
        studentStack.displayStudents();

        System.out.println("\nEditing student with ID 102:");
        studentStack.editStudent("102", "Bobby", 7.0F);
        studentStack.displayStudents();

        System.out.println("\nDeleting student with ID 103:");
        studentStack.deleteStudent("103");
        studentStack.displayStudents();

        System.out.println("\nSearching for student with ID 101:");
        Student foundStudent = studentStack.searchStudent("101");
        if (foundStudent != null) {
            System.out.println("Found: " + foundStudent);
        }*/
    }
}