package TestApp;

public class Course {

    // instance variables
    private String name;
    private String code;
    private String startDate;
    private int numberofStudents;

    // local variable
    private static int count = 0;

    // constructor with parameters

    public Course(){
        count++;
    }
    public Course(String name, String code, String startDate, int numberofStudents) {
        this();
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.numberofStudents = numberofStudents;
        count++;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumberofStudents() {
        return numberofStudents;
    }

    public void setNumberofStudents(int numberofStudents) {
        this.numberofStudents = numberofStudents;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Course.count = count;
    }

    // overrides

    @Override
    public String toString() {
        return "[ " + this.code + ", " + this.name + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Course course = (Course) obj;
        return this.code.equals(course.code) && this.name.equals(course.name);
    }
}
