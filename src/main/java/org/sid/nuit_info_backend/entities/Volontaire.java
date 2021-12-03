package org.sid.nuit_info_backend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("V")
public class Volontaire extends personne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom ;
    private String prenom ;
    private String sex ;

    @OneToMany(mappedBy = "volontaire")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<documentation> documentations ;

    private String association ;
}
