package it.epicode.CodeCampus.model;

/*
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_date")

    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;


    public Subscription() {
    }

    public Subscription(LocalDate startDate, LocalDate endDate, String status, User user, Course course) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.user = user;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status='" + status + '\'' +
                ", user=" + user +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscription)) return false;

        Subscription that = (Subscription) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        return course != null ? course.equals(that.course) : that.course == null;
    }



}*/