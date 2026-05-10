package com.abdelhadielomari.reservationabdelhadielomari.DTO;

import com.abdelhadielomari.reservationabdelhadielomari.entities.reservation;
import com.abdelhadielomari.reservationabdelhadielomari.enums.TypeEq;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

public class equipementDTO {

    private Long Ideq;
    private String nomeq;
    private double poids;
    private TypeEq typeeq;

}
