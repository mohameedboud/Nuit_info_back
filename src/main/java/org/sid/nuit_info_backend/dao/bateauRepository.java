package org.sid.nuit_info_backend.dao;

import org.sid.nuit_info_backend.entities.bateau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface bateauRepository extends JpaRepository<bateau,Long> {

}

