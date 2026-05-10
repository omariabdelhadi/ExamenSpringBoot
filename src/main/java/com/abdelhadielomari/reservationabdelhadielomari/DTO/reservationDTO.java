package com.abdelhadielomari.reservationabdelhadielomari.DTO;

import com.abdelhadielomari.reservationabdelhadielomari.entities.employe;
import com.abdelhadielomari.reservationabdelhadielomari.entities.equipement;
import com.abdelhadielomari.reservationabdelhadielomari.entities.salle;
import com.abdelhadielomari.reservationabdelhadielomari.enums.reservationStatue;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class reservationDTO {

    private Long idr;
    private Long ids;
    private Long ide;
    private List<Long> equipementIds=new ArrayList<>();
    private Date date;
    private Integer duree;
    private String description;
    private reservationStatue reservationstatue;

}
