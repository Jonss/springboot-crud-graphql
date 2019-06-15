package jonss.github.com.graphqlcrudsample.domain.repositories;

import jonss.github.com.graphqlcrudsample.domain.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByEmail(String email);
}
