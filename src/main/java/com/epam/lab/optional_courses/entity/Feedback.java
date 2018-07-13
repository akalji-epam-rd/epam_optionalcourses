package com.epam.lab.optional_courses.entity;

import java.util.Objects;

/**
 * That class represent feedback
 *
 * @author Anton Kulaga
 */


public class Feedback {
    private User user;
    private Course course;
    private int grade;
    private String feedbackBody;

    public Feedback(User user, Course course, int grade, String feedbackBody) {
        this.user = user;
        this.course = course;
        this.grade = grade;
        this.feedbackBody = feedbackBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return (user != null ) && user.equals(feedback.user) &&
                (course != null) && course.equals(feedback.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, user);
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFeedbackBody() {
        return feedbackBody;
    }

    public void setFeedbackBody(String feedbackBody) {
        this.feedbackBody = feedbackBody;
    }
}