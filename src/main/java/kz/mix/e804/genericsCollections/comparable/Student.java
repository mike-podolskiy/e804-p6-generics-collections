//CHECKSTYLE:OFF
package kz.mix.e804.genericsCollections.comparable;

public class Student implements Comparable<Student> {
    public String id;
    public String name;
    public Double cgpa;

    public Student(String studentId, String studentName, double studentCGPA) {
        id = studentId;
        name = studentName;
        cgpa = studentCGPA;
    }

    public String toString() {
        return " \n " + id + " \t " + name + " \t " + cgpa;
    }

    public int compareTo(Student that) {
        return this.id.compareTo(that.id);
    }
}
