package usecourse;

/**
 *
 * @author ericr
 */
import java.util.ArrayList;

// Abstract class Course
abstract class Course {
    // Attributes
    private String courseId;
    private String courseTitle;
    private int enrollmentLimit;
    private double pricePerStudent;
    private Faculty faculty;

    // Constructor
    public Course(String courseId, String courseTitle, int enrollmentLimit, double pricePerStudent, Faculty faculty) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.enrollmentLimit = enrollmentLimit;
        this.pricePerStudent = pricePerStudent;
        this.faculty = faculty;
    }

    // Abstract method
    public abstract double calculateRevenue();

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getEnrollmentLimit() {
        return enrollmentLimit;
    }

    public double getPricePerStudent() {
        return pricePerStudent;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}

// Concrete class ProgrammingCourse
class ProgrammingCourse extends Course {
    // Additional attribute
    private String programmingLanguage;

    // Constructor
    public ProgrammingCourse(String courseId, String courseTitle, int enrollmentLimit, double pricePerStudent, Faculty faculty, String programmingLanguage) {
        super(courseId, courseTitle, enrollmentLimit, pricePerStudent, faculty);
        this.programmingLanguage = programmingLanguage;
    }

    // Implement calculateRevenue method
    @Override
    public double calculateRevenue() {
        return getEnrollmentLimit() * getPricePerStudent();
    }
}

// Class Faculty
class Faculty {
    // Attributes
    private String facultyId;
    private String facultyName;

    // Constructor
    public Faculty(String facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    // Getters
    public String getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }
}

// Class UseCourse
