package com.iviberberi.sdjpaintro.repositories;

import com.iviberberi.sdjpaintro.domain.composite.AuthorComposite;
import com.iviberberi.sdjpaintro.domain.composite.AuthorEmbedded;
import com.iviberberi.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorEmbeddedRepository extends JpaRepository<AuthorEmbedded, NameId> {
}
