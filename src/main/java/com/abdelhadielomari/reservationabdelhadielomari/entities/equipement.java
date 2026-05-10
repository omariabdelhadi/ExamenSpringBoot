package com.abdelhadielomari.reservationabdelhadielomari.entities;

import com.abdelhadielomari.reservationabdelhadielomari.enums.TypeEq;
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
public class equipement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdEq;
    private String nomEq;
    private double poids;
    private TypeEq typeEq;

    @ManyToMany(mappedBy = "equipements")
    private List<reservation> reservationList;


}
