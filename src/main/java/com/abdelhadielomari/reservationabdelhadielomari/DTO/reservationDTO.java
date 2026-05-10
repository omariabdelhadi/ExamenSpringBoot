package com.abdelhadielomari.reservationabdelhadielomari.DTO;

import com.abdelhadielomari.reservationabdelhadielomari.entities.employe;
import com.abdelhadielomari.reservationabdelhadielomari.entities.equipement;
import com.abdelhadielomari.reservationabdelhadielomari.entities.salle;
import com.abdelhadielomari.reservationabdelhadielomari.enums.reservationStatue;
import jakarta.persistence.*;
import lombok.Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class reservationDTO {

    private Long idr;
    private Date date;
    private Integer duree;
    private String description;
    private reservationStatue reservationstatue;

}
