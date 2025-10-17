package org.itdma.springapi.service;

import org.itdma.springapi.api.model.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CoursesService {

    public List<Courses> coursesList;

    public CoursesService(){

        /// Sample Data
        coursesList = new ArrayList<>();
        Courses courses1 = new Courses(1, "Java Programming", "Java is a programming language", "1 Month", "1000", "Active");
        Courses courses2 = new Courses(2, "C++ Programming", "C++ is a programming language", "1 Month", "1000", "Active");
        Courses courses3 = new Courses(3, "Python Programming", "Python is a programming language", "1 Month", "1000", "Active");
        Courses courses4 = new Courses(4, "HTML Programming", "HTML is a markup language", "1 Month", "1000", "Active");
        Courses courses5 = new Courses(5, "CSS Programming", "CSS is a style sheet language", "1 Month", "1000", "Active");
        Courses courses6 = new Courses(6, "JavaScript Programming", "JavaScript is a programming language", "1 Month", "1000", "Active");

        coursesList.addAll(Arrays.asList(courses1,courses2,courses3,courses4,courses5,courses6));

    }

    public Optional<Courses> getCourses(int courseId) {

        Optional optional = Optional.empty();
        for (Courses courses : coursesList) {
            try {
                if (courses.getCourseId() == courseId) {
                    optional = Optional.of(courses);
                    return optional;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;

    }

    public Optional<Courses> getNamedName(String courseName){
        Optional optional1 = Optional.empty();
        for (Courses courses : coursesList) {
            try{
                if (courses.getName().equals(courseName)) {
                    optional1 = Optional.of(courses);
                    return optional1;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Courses getNamedDescription(String courseDescription){
        for (Courses courses : coursesList) {
            try{
                if (courses.getDescription().equals(courseDescription)) {
                    return courses;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Courses getNamedDuration(String courseDuration){
        for (Courses courses : coursesList) {
            try{
                if (courses.getDuration().equals(courseDuration)) {
                    return courses;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Courses getNamedFee(String courseFee){
        for (Courses courses : coursesList) {
            try{
                if (courses.getFee().equals(courseFee)) {
                    return courses;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Courses getNamedStatus(String courseStatus){
        for (Courses courses : coursesList) {
            try{
                if (courses.getStatus().equals(courseStatus)) {
                    return courses;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
