package jonss.com.github.graphqlcrudsample.domain.repositories;

import jonss.com.github.graphqlcrudsample.domain.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByIsbn(String isbn);
}
