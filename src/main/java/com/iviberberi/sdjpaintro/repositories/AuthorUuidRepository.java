package com.iviberberi.sdjpaintro.repositories;

import com.iviberberi.sdjpaintro.domain.AuthorUuid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorUuidRepository extends JpaRepository<AuthorUuid, UUID> {
}
