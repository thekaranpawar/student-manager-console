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
    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------");
    }
}

