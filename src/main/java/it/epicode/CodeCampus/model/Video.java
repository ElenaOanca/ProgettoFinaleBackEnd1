package it.epicode.CodeCampus.model;
/*
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private String format;

    // URL del video su Vimeo
    @Column(nullable = false)
    private String vimeoUrl;

    // Identificativo unico del video su Vimeo, se necessario
    @Column(nullable = true)
    private String vimeoId;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    // getters and setters

    // Getter e setter per vimeoUrl e vimeoId
    public String getVimeoUrl() {
        return vimeoUrl;
    }

    public void setVimeoUrl(String vimeoUrl) {
        this.vimeoUrl = vimeoUrl;
    }

    public String getVimeoId() {
        return vimeoId;
    }

    public void setVimeoId(String vimeoId) {
        this.vimeoId = vimeoId;
    }

    // Resto dei getters e setters

    // toString aggiornato per includere vimeoUrl e vimeoId
    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", format='" + format + '\'' +
                ", vimeoUrl='" + vimeoUrl + '\'' +
                ", vimeoId='" + vimeoId + '\'' +
                ", course=" + course +
                '}';
    }
}*/
