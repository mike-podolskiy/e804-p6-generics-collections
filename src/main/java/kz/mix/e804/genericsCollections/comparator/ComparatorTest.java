//CHECKSTYLE:OFF
package kz.mix.e804.genericsCollections.comparator;

import java.util.*;
import kz.mix.e804.genericsCollections.comparable.Student;

class CGPAComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return (s1.cgpa.compareTo(s2.cgpa));
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        Student[] students = { new Student("cs011", "Lennon ", 3.1),
                new Student("cs021", "McCartney ", 3.4),
                new Student("cs012", "Harrison ", 3.1),
                new Student("cs022", "Starr ", 3.7)};

        System.out.println("Before sorting by student ID");
        System.out.println("Student-ID \t Name \t CGPA (for 4.0)");
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new CGPAComparator());

        System.out.println("After sorting by student ID");
        System.out.println("Student-ID \t Name \t CGPA (for 4.0)");
        System.out.println(Arrays.toString(students));
    }
}
