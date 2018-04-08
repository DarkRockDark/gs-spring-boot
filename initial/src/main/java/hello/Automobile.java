package hello;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
// H2 Login
// http://localhost:8080/h2-console/login.jsp
// JDBC URL: jdbc:h2:mem:testdb
public class Automobile {
    @Id
    @GeneratedValue
    private Long id;
    private String VinNumber;
    private String Make;
}
