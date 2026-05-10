package com.abdelhadielomari.reservationabdelhadielomari.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class employe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdE;
    private String nomE;
    private String email;
    @OneToMany(mappedBy = "employe")
    private List<reservation> reservationList;
}
