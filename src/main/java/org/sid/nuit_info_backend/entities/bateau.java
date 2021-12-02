package org.sid.nuit_info_backend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class bateau {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Long capacite ;
    private Date dateFabrication ;
    private String type ;
    @OneToMany
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Equipage> equipages ;
}
