package jonss.com.github.graphqlcrudsample.domain.repositories;

import jonss.com.github.graphqlcrudsample.domain.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByEmail(String email);
}
