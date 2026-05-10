package com.abdelhadielomari.reservationabdelhadielomari.entities;


import com.abdelhadielomari.reservationabdelhadielomari.enums.reservationStatue;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idr;
    private Date date;
    private Integer duree;
    private String description;
    private reservationStatue reservationstatue;

    @ManyToOne
    @JsonIgnore
    private employe employe;
    @ManyToOne
    @JsonIgnore
    private salle salle;

    @Builder.Default
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "reservation_equipement",
            joinColumns =@JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name= "equipement_id")
    )
    private List<equipement> equipements=new ArrayList<>();
}
