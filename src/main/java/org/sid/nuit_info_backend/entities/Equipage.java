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
@DiscriminatorValue("E")
public class Equipage extends personne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom ;
    private String prenom ;
    private String sex ;
    @ManyToOne
    private bateau bateau ;

  /*  @OneToMany( mappedBy = "Equipage" )
    private Collection<documentation> documentations */;

    private String role ;
}
