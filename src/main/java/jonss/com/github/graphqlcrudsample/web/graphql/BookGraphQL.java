package jonss.com.github.graphqlcrudsample.web.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import jonss.com.github.graphqlcrudsample.domain.models.Book;
import jonss.com.github.graphqlcrudsample.domain.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    private BookService bookService;

    public Optional<Book> findBook(String isbn) {
        return bookService.findBook(isbn);
    }

    public Book createBook(Book book, String email) {
        return bookService.create(book, email);
    }

}


