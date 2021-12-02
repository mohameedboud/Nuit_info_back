package org.sid.nuit_info_backend.dao;

import org.sid.nuit_info_backend.entities.Volontaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VolontaireRepository extends JpaRepository<Volontaire, Long> {
}
