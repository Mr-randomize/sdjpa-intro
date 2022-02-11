package com.iviberberi.sdjpaintro.repositories;

import com.iviberberi.sdjpaintro.domain.AuthorUuid;
import com.iviberberi.sdjpaintro.domain.BookUuid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookUuidRepository extends JpaRepository<BookUuid, UUID> {
}
