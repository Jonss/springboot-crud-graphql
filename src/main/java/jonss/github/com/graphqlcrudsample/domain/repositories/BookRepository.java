package jonss.github.com.graphqlcrudsample.domain.repositories;

import jonss.github.com.graphqlcrudsample.domain.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByIsbn(String isbn);
}
