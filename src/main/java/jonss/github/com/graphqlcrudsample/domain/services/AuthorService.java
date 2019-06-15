package jonss.github.com.graphqlcrudsample.domain.services;

import jonss.github.com.graphqlcrudsample.domain.models.Author;
import jonss.github.com.graphqlcrudsample.domain.repositories.AuthorRepository;
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
