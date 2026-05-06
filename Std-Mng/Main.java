import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    static ArrayList<Student> studentList = new ArrayList<>();

    static int nextId = 1;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        studentList.add(new Student(nextId++, "Stark", 20, "Computer Science", 92.5));
        studentList.add(new Student(nextId++, "Jemmy", 22, "Mechanical", 78.0));
        studentList.add(new Student(nextId++, "Charlie", 21, "Computer Science", 73.0));
        studentList.add(new Student(nextId++, "Daren", 19, "Electronics", 88.5));

        System.out.println("Welcome to Student Manager!");

        while (true){

            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Show all students");
            System.out.println("2. Add student");
            System.out.println("3. Search student by name");
            System.out.println("4. Update student");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1){
                showAllStudents();
            } else if (choice == 2){
                addStudent(scanner);
            } else if (choice == 3){
                searchStudent(scanner);
            } else if (choice == 4){
                updateStudent(scanner);
            } else if (choice == 5){
                deleteStudent(scanner);
            } else if (choice == 6){
                System.out.println("Goodbye!");
                break;
            } else{
                System.out.println("Wrong choice! Please enter 1 to 6.");
            }
        }
    }

    static void showAllStudents(){

        if(studentList.size() == 0){
            System.out.println("No students found.");
            return;
        }
        System.out.println();
        System.out.println("===== ALL STUDENTS =====");

        for(int i = 0; i < studentList.size(); i++){
            studentList.get(i).printInfo();
        }
    }

    static void addStudent(Scanner scanner){

        System.out.println();
        System.out.println("===== ADD STUDENT =====");

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        System.out.print("Enter grade (0-100): ");
        double grade = scanner.nextDouble();
        scanner.nextLine();

        if(name.equals("")){
            System.out.println("Error: Name cannot be empty!");
            return;
        }
        if(age < 15 || age > 60){
            System.out.println("Error: Age must be between 15 and 60!");
            return;
        }
        if(grade < 0 || grade > 100){
            System.out.println("Error: Grade must be between 0 and 100!");
            return;
        }

        Student newStudent = new Student(nextId, name, age, course, grade);
        studentList.add(newStudent);
        nextId++;

        System.out.println("Student added successfully! ID is: " + newStudent.id);
    }

    static void searchStudent(Scanner scanner){

        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine();

        boolean found = false;

        System.out.println("===== SEARCH RESULTS =====");

        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);

            if (s.name.toLowerCase().contains(searchName.toLowerCase())){
                s.printInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student found with name: " + searchName);
        }
    }

    static void updateStudent(Scanner scanner){

        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student foundStudent = null;

        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).id == id) {
                foundStudent = studentList.get(i);
                break;
            }
        }
        if (foundStudent == null){
            System.out.println("Student with ID " + id + " not found!");
            return;
        }

        System.out.println("Current info:");
        foundStudent.printInfo();

        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();

        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new course: ");
        String newCourse = scanner.nextLine();

        System.out.print("Enter new grade: ");
        double newGrade = scanner.nextDouble();
        scanner.nextLine();

        foundStudent.name   = newName;
        foundStudent.age    = newAge;
        foundStudent.course = newCourse;
        foundStudent.grade  = newGrade;

        System.out.println("Student updated successfully!");
    }

    static void deleteStudent(Scanner scanner){
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student foundStudent = null;

        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).id == id) {
                foundStudent = studentList.get(i);
                break;
            }
        }
        if (foundStudent == null){
            System.out.println("Student with ID " + id + " not found!");
            return;
        }
        System.out.println("Are you sure you want to delete " + foundStudent.name + "? (yes/no)");
        String answer = scanner.nextLine();

        if (answer.equals("yes") || answer.equals("y")){
            studentList.remove(foundStudent);
            System.out.println("Student deleted successfully!");
        } else{
            System.out.println("Delete cancelled.");
        }
    }
}