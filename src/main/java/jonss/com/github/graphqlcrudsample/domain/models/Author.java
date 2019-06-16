package jonss.com.github.graphqlcrudsample.domain.models;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String fullname;
    private String email;
    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    private List<Book> books = new ArrayList();

    public String getEmail() {
        return email;
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public Long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }
}
