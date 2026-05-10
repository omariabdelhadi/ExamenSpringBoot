package com.abdelhadielomari.reservationabdelhadielomari.entities;


import com.abdelhadielomari.reservationabdelhadielomari.enums.TypeS;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class salle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ids;
    private Integer numero;
    private String noms;
    private Integer nombreplace;
    private TypeS typeSalle;
    @OneToMany(mappedBy = "salle")
    private List<reservation> reservationList;
}
