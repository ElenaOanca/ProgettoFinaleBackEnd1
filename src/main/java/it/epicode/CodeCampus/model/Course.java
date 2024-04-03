package it.epicode.CodeCampus.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Table(name="CORSI")
@Entity
public class Course {
    public enum Status {
        ACTIVE, INACTIVE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "category")
    private String category;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "duration")
    private int duration;
    
    @Column(name = "name", nullable = false)
    private String name;
    

    @Column(name = "price")
    private int price;
    

    @Column(name = "img")
    private String img;
    
    /*@ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User author;*/

    /*@Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;*/

   /* @OneToMany(mappedBy = "course")
    private List<Subscription> subscriptions;

    @OneToMany(mappedBy = "course")
    private List<Purchase> purchases;*/

    

 

   

    /*@Column(name = "level")
    private String level;

    @Column(name = "language")
    private String language;

    @Column(name = "teacher")
    private String teacher;

    @Column(name = "start_date")
    private LocalDate startDate; // Modificato da String a LocalDate

    @Column(name = "end_date")
    private LocalDate endDate; // Modificato da String a LocalDate

    @Column(name = "schedule")
    private String schedule;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "video_url")
    private String videoUrl;*/


    /*public Course(User author, String name, String description, int duration, int price, String category, String level, String language, String teacher, String startDate, String endDate, String schedule, String imageUrl, String videoUrl, Status status) {
        this.author = author;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.price = price;
        this.category = category;
        this.level = level;
        this.language = language;
        this.teacher = teacher;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.startDate = LocalDate.parse(startDate, formatter);
        this.endDate = LocalDate.parse(endDate, formatter);

        this.schedule = schedule;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
        this.status = status;
    }*/
    
    public Course() {}
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
/*
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    

  public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	/*  public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
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



    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
/*
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }
*/
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
               // ", author=" + author +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", category='" + category + '\'' +
                //", level='" + level + '\'' +
                //", language='" + language + '\'' +
                //", teacher='" + teacher + '\'' +
                //", startDate='" + startDate + '\'' +
                //", endDate='" + endDate + '\'' +
                //", schedule='" + schedule + '\'' +
                //", imageUrl='" + imageUrl + '\'' +
                //", videoUrl='" + videoUrl + '\'' +
                //", status=" + status +
               // ", subscriptions=" + subscriptions +
                //", purchases=" + purchases +
                '}';
    }


    //ALTER TABLE Course
    //ALTER COLUMN end_date TYPE date
    //USING end_date::date;

    //ALTER TABLE Course
    //ALTER COLUMN start_date TYPE date
    //USING start_date::date;

}
