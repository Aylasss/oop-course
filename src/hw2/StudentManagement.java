package hw2;

public class StudentManagement{


    private Student[] students;
    private int count;

   public StudentManagement(int maxstudents)
   {
       students=new Student[maxstudents];
       count=0;
   }


   //method to add a student to the system->

    public void addStudent(String name, int age, String major, double gpa)
    {
        if (count<students.length){
            students[count]=new Student(name, age, major, gpa);
            count++;
            System.out.println(name+" has been added");

        }
        else{
            System.out.println("Array is full, cannt be added");

        }
    }


    //method to remove students

    public void removeStudent(String name){
        for (int i = 0; i < count; i++) {
            if (students[i].name.equals(name)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];}


                students[count - 1] = null;
                count--;
                System.out.println(name + " has been removed.");

            }
        }
        System.out.println(name + " not found.");
    }

public void displayStudents() {
    for (int i = 0; i < count; i++) {
        System.out.println(students[i].name + " - Major: " + students[i].major);
    }
}

}
