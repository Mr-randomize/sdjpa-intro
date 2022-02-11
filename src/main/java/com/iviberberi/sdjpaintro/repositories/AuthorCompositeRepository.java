package com.iviberberi.sdjpaintro.repositories;

import com.iviberberi.sdjpaintro.domain.AuthorUuid;
import com.iviberberi.sdjpaintro.domain.composite.AuthorComposite;
import com.iviberberi.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}
