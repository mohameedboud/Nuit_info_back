package org.sid.nuit_info_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor

public class documentation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String Titre ;
    private String Contenue ;
    private Boolean isValid ;
    @ManyToOne
    private personne personne ;
   /* @ManyToOne
    private Rescape rescape ;
    @ManyToOne
    private Volontaire volontaire ;*/
}
