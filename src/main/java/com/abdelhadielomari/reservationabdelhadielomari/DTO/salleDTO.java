package com.abdelhadielomari.reservationabdelhadielomari.DTO;

import com.abdelhadielomari.reservationabdelhadielomari.entities.reservation;
import com.abdelhadielomari.reservationabdelhadielomari.enums.TypeS;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class salleDTO {

    private Long ids;
    private Integer numero;
    private String noms;
    private Integer nombreplace;
    private TypeS typeSalle;

}
