package it.epicode.CodeCampus.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;




//@Data
@Table(name="USERS")
@Entity
public class User {
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

 @Column(nullable = false)
 private String firstName;

 @Column(nullable = false)
 private String lastName;
 
 @Column(nullable = false)
 //@JsonIgnore
 private String password;


 //@Enumerated(EnumType.STRING)
 @Column(nullable = false)
 private String role;

 
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = true)//non obbligatorio
    private String email;
    
    @Column(nullable = true)//non obbligatorio
    private String address;
    
    @Column(nullable = true)//non obbligatorio
    private Date lastUpdate;
    
    private String token;//lo uso solo per mandare l'user+token al frontend quando loggo o mi registro (non viene salvato a db)
  

  /*  @OneToMany(mappedBy = "buyer")
    private List<Purchase> purchases;

    @OneToMany(mappedBy = "author")
    private List<Course> publishedCourses;*/

    /*@Column(nullable = true)
    private LocalDate registrationDate;



    @Column(nullable = false)
    private String email;
    
    @Column(nullable = true)
    private String address;
*/
    


    

    //costruttore vuoto
    public User() {
    }




public Date getLastUpdate() {
		return lastUpdate;
	}




	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}




public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




public String getToken() {
		return token;
	}




	public void setToken(String token) {
		this.token = token;
	}




	//costruttore
   /* public User(String username, String password, String role, LocalDate registrationDate, String email, String name, String surname,String address) {
        this.username = username;
        this.password = password;
        this.role = role;
       // this.registrationDate = registrationDate;

        //this.email = email;
        this.firstName = name;
        this.lastName = surname;
      //  this.address = address;
    }
*/
    //getter e setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    /*public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }*/

    
    




	//toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", role=" + role +
                //", registrationDate=" + registrationDate +
               // ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                //", address='" + address + '\'' +
                '}';
    }


    public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public void setHashPassword(String encode) {
        this.password = encode;
    }
    
    public String getPassword() {
        return this.password;
    }

  /*  public Collection<? extends GrantedAuthority> getAuthorities() {
        GrantedAuthority[] Role = new GrantedAuthority[0];
        return List.of(Role);
    }
*/

    @JsonIgnore
    public String getHashPassword() {
        return password;
    }


}
