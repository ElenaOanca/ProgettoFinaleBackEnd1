package it.epicode.CodeCampus.model;
/*
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fileName;

    // Storing Cloudinary URL
    @Column(nullable = true)
    private String cloudinaryUrl;

    @Lob
    @Column(nullable = false)
    private byte[] data;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    // Getters and setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }

    public String getCloudinaryUrl() { return cloudinaryUrl; }

    public void setCloudinaryUrl(String cloudinaryUrl) { this.cloudinaryUrl = cloudinaryUrl; }

    public byte[] getData() { return data; }

    public void setData(byte[] data) { this.data = data; }

    public Course getCourse() { return course; }

    public void setCourse(Course course) { this.course = course; }

    // toString
    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", cloudinaryUrl='" + cloudinaryUrl + '\'' +
                ", course=" + course +
                '}';
    }
}**/
