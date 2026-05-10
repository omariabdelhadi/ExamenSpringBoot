package com.abdelhadielomari.reservationabdelhadielomari.entities;


import com.abdelhadielomari.reservationabdelhadielomari.enums.reservationStatue;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idr;
    private Date date;
    private Integer duree;
    private String description;
    private reservationStatue reservationstatue;
    @ManyToOne
    private employe employe;
    @ManyToOne
    private salle salle;

    @ManyToMany
    @JoinTable(
            name = "reservation_equipement",
            joinColumns =@JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name= "equipement_id")
    )
    private List<equipement> equipements;
}
