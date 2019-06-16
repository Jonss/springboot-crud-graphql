package jonss.com.github.graphqlcrudsample.domain.services;

import jonss.com.github.graphqlcrudsample.domain.repositories.AuthorRepository;
import jonss.com.github.graphqlcrudsample.domain.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author create(Author author) {
        return authorRepository.save(author);
    }

    public Optional<Author> findAuthorByEmail(String email) {
        return authorRepository.findByEmail(email);
    }
}
