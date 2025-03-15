package lesson13.task2;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //INPUT:
        // creating a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Leyla", "Mammadova", 99.5, "Female", LocalDate.of(2007, 9, 19)));
        students.add(new Student(2, "Ali", "Hasanov", 88.0, "Male", LocalDate.of(2001, 1, 22)));
        students.add(new Student(3, "Nargiz", "Aliyeva", 99.9, "Female", LocalDate.of(2005, 7, 4)));
        students.add(new Student(4, "Vüsal", "Ismayilov", 90.5, "Male", LocalDate.of(1999, 8, 30)));
        students.add(new Student(5, "Aysel", "Rzayeva", 95.5, "Female", LocalDate.of(2000, 6, 15)));


        //PROCESS:
        // sort using Comparable
        Collections.sort(students);
        System.out.println("Sorted by ID (ascending):");
        students.forEach(System.out::println);

        //sorting using StudentComparator --> custom logic
        Collections.sort(students, new StudentComparator());
        System.out.println("\n\nSorted by custom logic (using StudentComparator):");
        students.forEach(System.out::println);


        //sort USING LAMBDA (same logic as comparator)
        Collections.sort(students, (s1, s2) -> {

            //grade (descending)
            if (s1.getGrade() != s2.getGrade()) {
                return Double.compare(s2.getGrade(), s1.getGrade());
            }

            // birthdate (ascending)
            if (!s1.getBirthdate().equals(s2.getBirthdate())) {
                return s1.getBirthdate().compareTo(s2.getBirthdate());
            }

            // gender (prefer female)
            if (!s1.getGender().equals(s2.getGender())) {
                return s2.getGender().compareTo(s1.getGender()); // Female first
            }

            //surname (ascending)
            if (!s1.getSurname().equals(s2.getSurname())) {
                return s1.getSurname().compareTo(s2.getSurname());
            }
            //name (descending)
            if (!s1.getName().equals(s2.getName())) {
                return s2.getName().compareTo(s1.getName());
            }

            //Id (ascending)
            return Integer.compare(s1.getId(), s2.getId());
        } );

        //OUTPUT:
        System.out.println("\n\nSorted by custom logic (using lambda):");
        students.forEach(System.out::println);
    }
}
