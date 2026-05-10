package com.abdelhadielomari.reservationabdelhadielomari.entities;


import com.abdelhadielomari.reservationabdelhadielomari.enums.TypeS;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class salle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdS;
    private Integer numero;
    private String nomS;
    private Integer nombrePlace;
    private TypeS typeSalle;
    @OneToMany(mappedBy = "salle")
    private List<reservation> reservationList;
}
