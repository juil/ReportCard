package com.juilyoon.reportcard;

/**
 * Created by juil on 16-07-04.
 */
public class Course {
    private String courseName;
    private int gradeYear;
    private String teacher;
    private int gradePercent;
    private String notes;

    public Course(String courseName, int gradeYear, String teacher, int gradePercent, String notes) {
        this.courseName = courseName;
        this.gradeYear = gradeYear;
        this.teacher = teacher;
        this.gradePercent = gradePercent;
        this.notes = notes;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getGradePercent() {
        return gradePercent;
    }

    public void setGradePercent(int gradePercent) {
        this.gradePercent = gradePercent;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isPass() {
        return (gradePercent >= 50);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", gradeYear=" + gradeYear +
                ", teacher='" + teacher + '\'' +
                ", gradePercent=" + gradePercent +
                ", notes='" + notes + '\'' +
                '}';
    }
}
