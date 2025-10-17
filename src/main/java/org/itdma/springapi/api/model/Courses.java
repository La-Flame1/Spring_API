package org.itdma.springapi.api.model;

/* ERD~ Courses
    courseId | int | PK |
    courseName | varchar(10) |
    courseDescription | varchar(10) |
    courseDuration | varchar(10) |
    courseFee | varchar(10) |
    courseDuration | varchar(10) |
    courseStatus | varchar(10) |
 */

public class Courses {
    private final int courseId;
    private final String courseName;
    private final String courseDescription;
    private final String courseDuration;
    private final String courseFee;
    private final String courseStatus;

    public Courses(int courseId, String courseName, String courseDescription, String courseDuration, String courseFee, String courseStatus) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
        this.courseStatus = courseStatus;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getName() {
        return courseName;
    }

    public String getDescription() {
        return courseDescription;
    }

    public String getDuration() {
        return courseDuration;
    }

    public String getFee() {
        return courseFee;
    }

    public String getStatus() {
        return courseStatus;
    }
}
