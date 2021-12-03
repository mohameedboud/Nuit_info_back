package org.sid.nuit_info_backend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="personne_type")
@Data @AllArgsConstructor @NoArgsConstructor
public abstract class personne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom ;
    private String prenom ;
    private String sex ;
    @ManyToOne
    private bateau bateau ;
    @OneToMany(mappedBy = "personne")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<documentation> documentations ;
}
