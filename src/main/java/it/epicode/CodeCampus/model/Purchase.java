package it.epicode.CodeCampus.model;
/*
import jakarta.persistence.*;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "buyer_id", nullable = false)
    private User buyer;

    public double getCoursePrice() {
        return course.getPrice();
    }

    public String getCourseName() {
        return course.getName();
    }

    public String getCourseId() {
        return course.getId().toString();
    }

    // Metodo per ottenere il nome dell'acquirente se il ruolo è BUYER
    public String getBuyerNameWithRoleBuyer() {
        if (buyer != null && buyer.getRole() == Role.BUYER) {
            return buyer.getUsername();
        }
        return "Ruolo non corrispondente o utente null";
    }
}*/
