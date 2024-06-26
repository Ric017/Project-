package usecourse;

import java.util.ArrayList;

/**
 *
 * @author ericr
 */
// Class UseCourse
// Class UseCourse
public class UseCourse {
    public static void main(String[] args) {
        // Create Faculty object
        Faculty faculty1 = new Faculty("F001", "Leroy Jenkins");

        // Create ProgrammingCourse objects
        ProgrammingCourse course1 = new ProgrammingCourse("C001", "Java Programming", 30, 100, faculty1, "Java");
        ProgrammingCourse course2 = new ProgrammingCourse("C002", "Python Programming", 25, 120, faculty1, "Python");

        // Add courses to ArrayList
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        // Display revenue generated by each course
        for (Course course : courses) {
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Course Title: " + course.getCourseTitle());
            System.out.println("Faculty ID: " + course.getFaculty().getFacultyId());
            System.out.println("Faculty Name: " + course.getFaculty().getFacultyName());
            System.out.println("Revenue Generated: $" + course.calculateRevenue());
            System.out.println();
        }
    }
}
