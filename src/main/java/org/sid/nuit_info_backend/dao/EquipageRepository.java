package org.sid.nuit_info_backend.dao;

import org.sid.nuit_info_backend.entities.Equipage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EquipageRepository extends JpaRepository<Equipage, Long> {
}
