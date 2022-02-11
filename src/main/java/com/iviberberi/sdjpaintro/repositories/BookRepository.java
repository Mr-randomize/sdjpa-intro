package com.iviberberi.sdjpaintro.repositories;

import com.iviberberi.sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}