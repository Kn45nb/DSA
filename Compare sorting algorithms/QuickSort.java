import java.util.ArrayList;

public class QuickSort {
    public static void sort(ArrayList<Student> students) {
        quickSort(students, 0, students.size() - 1);
    }

    private static void quickSort(ArrayList<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);

            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private static int partition(ArrayList<Student> students, int low, int high) {
        float pivot = students.get(high).getMarks();
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (students.get(j).getMarks() <= pivot) {
                i++;

                // Swap
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        // Swap pivot
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }
}
