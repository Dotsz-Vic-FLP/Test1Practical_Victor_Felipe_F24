package TestApp;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    void run() {
        Scanner in = new Scanner(System.in);
        ArrayList<Course> listOfCourses = new ArrayList<>();
        String menu = """
            1. Add a course
            2. Edit a course
            3. List Courses
            3. Exit\n
            """;

        Boolean running = true;

        while(running){
            System.out.println(menu);
            int choice = in.nextInt();
            in.nextLine();

            switch(choice){
                case 1: {
                    listCourses(listOfCourses);
                    System.out.println("Enter the name of the course: ");
                    String name = in.next();
                    System.out.println("Enter the code of the course: ");
                    String code = in.next();
                    System.out.println("Enter the start date of the course: ");
                    String startDate = in.next();
                    System.out.println("Enter the number of students in the course: ");
                    int numberofStudents = in.nextInt();
                    in.nextLine();
                    Course course = new Course(name, code, startDate, numberofStudents);
                    listOfCourses = addCourse(listOfCourses, course);
                    break;
                }
                case 2: {
                    listCourses(listOfCourses);
                    System.out.println("Select the course you want to edit: ");
                    int index = in.nextInt();
                    System.out.println("Enter the name of the course you want to edit: ");
                    String name = in.next();
                    System.out.println("Enter the code of the course you want to edit: ");
                    String code = in.next();
                    System.out.println("Enter the start date of the course you want to edit: ");
                    String startDate = in.next();
                    System.out.println("Enter the number of students in the course you want to edit: ");
                    int numberofStudents = in.nextInt();
                    in.nextLine();

                    Course course = new Course(name, code, startDate, numberofStudents);
                    listOfCourses = editCourse(listOfCourses, index, course);

                }

                case 3:{}
                default:{
                    running = false;
                    System.out.println("Exiting...");
                }
            }

        }



    }
    public ArrayList<Course> addCourse(ArrayList<Course> listOfCourses, Course course){
        listOfCourses.add(course);
        return listOfCourses;
    }

    public ArrayList<Course> editCourse(ArrayList<Course> listOfCourses, int index, Course course){
        listOfCourses.set(index-1 , course);
        return listOfCourses;
    }

    public void listCourses(ArrayList<Course> listOfCourses) {
        for (int index = 0; index < listOfCourses.size(); index++) {
            System.out.println((index + 1)+ ": " + listOfCourses.get(index).toString());
        }
    }

}
