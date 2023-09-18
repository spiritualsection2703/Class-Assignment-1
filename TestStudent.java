public class TestStudent {
    public static void main(String args []){
        Student st1;
        st1 = new Student();

        System.out.println("Name: " + st1.getName() + " Surname" + st1.getSurname() + " Student ID: " + st1.getStudentID() + " GPA: " + st1.getGPA() + " CGPA: " + st1.getCGPA() + " Number of Semesters: " + st1.getNumberofSemesters());
    
    Student st2 = new Student("Randy", "Inguanzo", 123456, 3.6, 3.75, 4);
    
     System.out.println("Name: " + st2.getName() + " Surname: " + st2.getSurname() + " Student ID: " + st2.getStudentID() + " GPA: " + st2.getGPA() + " CGPA: " + st2.getCGPA() + " Number of Semesters: " + st2.getNumberofSemesters());
    

     st1.setName("Patrick");
     st1.setSurname("Roa");
     st1.setStudentID(654321);
     st1.setGPA(3.81);
     st1.setCGPA(3.54);
     st1.setNumberOfSemesters(4);

     System.out.println("Name: " + st1.getName() + " Surname: " + st1.getSurname() + " Student ID: " + st1.getStudentID() + " GPA: " + st1.getGPA() + " CGPA: " + st1.getCGPA() + " Number of Semesters: " + st1.getNumberofSemesters());



     //How do you rate your developed Java application from 0 to 10?
     // 5
    }
}
