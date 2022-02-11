package com.iviberberi.sdjpaintro.bootstrap;

import com.iviberberi.sdjpaintro.domain.AuthorUuid;
import com.iviberberi.sdjpaintro.domain.Book;
import com.iviberberi.sdjpaintro.domain.BookUuid;
import com.iviberberi.sdjpaintro.repositories.AuthorUuidRepository;
import com.iviberberi.sdjpaintro.repositories.BookRepository;
import com.iviberberi.sdjpaintro.repositories.BookUuidRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"local", "default"})
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorUuidRepository authorUuidRepository;
    private final BookUuidRepository bookUuidRepository;

    public DataInitializer(BookRepository bookRepository, AuthorUuidRepository authorUuidRepository,BookUuidRepository bookUuidRepository) {

        this.bookRepository = bookRepository;
        this.authorUuidRepository = authorUuidRepository;
        this.bookUuidRepository = bookUuidRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();
        authorUuidRepository.deleteAll();

        Book bookDDD = new Book("Domain Driven Design", "123", "RandomHouse", null);
        Book savedDDD = bookRepository.save(bookDDD);

        Book bookSIA = new Book("Spring In Action", "234234", "Oriely", null);
        Book savedSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });

        AuthorUuid authorUuid = new AuthorUuid();
        authorUuid.setFirstName("Joe");
        authorUuid.setLastName("Buck");
        AuthorUuid savedAuthorUuid = authorUuidRepository.save(authorUuid);
        System.out.println("Saved author UUID: " + savedAuthorUuid.getId());

        BookUuid bookUuid = new BookUuid();
        bookUuid.setTitle("All about UUIDs");
        BookUuid savedBookUuid = bookUuidRepository.save(bookUuid);
        System.out.println("Saved book UUID: " + savedBookUuid.getId());

    }
}