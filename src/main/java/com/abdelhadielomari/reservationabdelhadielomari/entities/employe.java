package com.abdelhadielomari.reservationabdelhadielomari.entities;


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
public class employe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ide;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "employe")
    private List<reservation> reservationList;
}
