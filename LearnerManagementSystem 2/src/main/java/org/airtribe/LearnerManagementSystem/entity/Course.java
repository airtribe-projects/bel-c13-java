package org.airtribe.LearnerManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;


@Entity
public class Course {

  @Id
  @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
  private long courseId;

  private String courseName;

  @OneToMany(mappedBy = "course")
  private List<Cohort> cohortsList;

  public Course(long courseId, String courseName) {
    this.courseId = courseId;
    this.courseName = courseName;
  }

  public Course() {

  }

  public long getCourseId() {
    return courseId;
  }

  public void setCourseId(long courseId) {
    this.courseId = courseId;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public List<Cohort> getCohortsList() {
    return cohortsList;
  }

  public void setCohortsList(List<Cohort> cohortsList) {
    this.cohortsList = cohortsList;
  }
}
