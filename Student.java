public class Student{
    private String name;
    
    private String surname;
    
    private int studentID;
    
    private double GPA;

    private double CGPA;
    
    private int numberOfSemesters;


// default constructor
public Student(){
    this.name = "";
    this.surname = "";
    this.studentID = 0;
    this.GPA = 0.00;
    this.CGPA = 0.00;
    this.numberOfSemesters = 0;
}

//Second Construtor
public Student(String name, String surname, int studentID, double GPA, double CGPA, int numberOfSemesters){
    this.name = name;
    this.surname = surname;
    this.studentID = studentID;
    this.GPA = GPA;
    this.CGPA = CGPA;
    this.numberOfSemesters = numberOfSemesters;
}

public void setName(String Name){
    this.name = name;
}

public String getName(){
    return this.name;
}

public void setSurname(String surname){
    this.surname = surname;
}

public String getSurname(){
    return this.surname;
}

public void setStudentID(int studentID){
    this.studentID = studentID;
}

public int getStudentID(){
    return this.studentID;
}

public void setGPA(double GPA){
    this.GPA = GPA;
}

public double getGPA(){
    return this.GPA;
}

public void setCGPA(double CGPA){
    this.CGPA = CGPA;
}

public double getCGPA(){
    return this.CGPA;
}

public void setNumberOfSemesters(int numberOfSemesters){
    this.numberOfSemesters = numberOfSemesters;
}

public int getNumberofSemesters(){
    return this.numberOfSemesters;
}


















}