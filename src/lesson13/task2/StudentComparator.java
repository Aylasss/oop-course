package lesson13.task2;

import java.util.Comparator;


public class StudentComparator implements Comparator<Student> {
    @Override

    public int compare(Student s1, Student s2) {
        //grade (descending)
        if (s1.getGrade()!= s2.getGrade()) {
            return Double.compare(s2.getGrade(), s1.getGrade());
        }

        //birthdate (ascending)
        if (!s1.getBirthdate().equals(s2.getBirthdate())) {
            return s1.getBirthdate().compareTo(s2.getBirthdate());
        }

        //gender (prefering female)
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

        //id (ascending)
        return Integer.compare(s1.getId(), s2.getId());
    }


}
