package guru.springframework.spring5webapp;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String FirstName;
    private String LastName;

    @ManyToMany(mappedBy = "Authors")
    private Set<Book> Books;

    public Author() {
    }

    public Author(String firstName, String lastName, Set<Book> books) {
        FirstName = firstName;
        LastName = lastName;
        this.Books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Set<Book> getBooks() {
        return Books;
    }

    public void setBooks(Set<Book> books) {
        this.Books = books;
    }
}
