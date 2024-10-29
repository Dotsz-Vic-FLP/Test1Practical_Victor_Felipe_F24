package TestApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    private Course course1;
    private Course course2;
    private Course course3;

    @BeforeEach
    void setUp() {
        course1 = new Course("Math", "MATH101", "2021-09-01", 30);
        course2 = new Course("Science", "SCI101", "2021-09-01", 30);
        course3 = new Course("Science", "SCI101", "2021-09-01", 30);
    }

    @Test
    void testIfCoursesAreEqual(){
        assert(course2.equals(course3));
    }

    @Test
    void testIfCoursesAreNotEqual(){
        assert(!course1.equals(course2));
    }

}