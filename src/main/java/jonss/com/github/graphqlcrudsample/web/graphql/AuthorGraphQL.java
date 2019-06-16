package jonss.com.github.graphqlcrudsample.web.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import jonss.com.github.graphqlcrudsample.domain.models.Author;
import jonss.com.github.graphqlcrudsample.domain.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuthorGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    private AuthorService authorService;

    public Optional<Author> findAuthor(String email){
        return authorService.findAuthorByEmail(email);
    }

    public Author createAuthor(Author author) {
        return authorService.create(author);
    }

}
