public class Student{
    int id;
    String name;
    int age;
    String course;
    double grade;

    public Student(int id, String name, int age, String course, double grade){
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }
    public String getResult(){

        if(grade >= 35){
            return "PASS";
        }else{
            return "FAIL";
        }
    }
    public String getPerformance(){

        if(grade >= 90){
            return "Excellent";
        }
        else if(grade >= 75){
            return "Good";
        }
        else if(grade >= 50){
            return "Average";
        }
        else{
            return "Poor";
        }
    }
    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------");
    }
}

