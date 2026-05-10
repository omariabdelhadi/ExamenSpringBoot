package com.abdelhadielomari.reservationabdelhadielomari.DTO;

import com.abdelhadielomari.reservationabdelhadielomari.entities.reservation;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class employeDTO {

    private Long ide;
    private String nom;
    private String email;
}
