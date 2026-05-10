package com.abdelhadielomari.reservationabdelhadielomari.mappers;

import com.abdelhadielomari.reservationabdelhadielomari.DTO.reservationDTO;
import com.abdelhadielomari.reservationabdelhadielomari.Repository.EmployeRepo;
import com.abdelhadielomari.reservationabdelhadielomari.Repository.EquipementRepo;
import com.abdelhadielomari.reservationabdelhadielomari.Repository.ReservationRepo;
import com.abdelhadielomari.reservationabdelhadielomari.Repository.SalleRepo;
import com.abdelhadielomari.reservationabdelhadielomari.entities.reservation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class reservationMapper {

    @Autowired
    SalleRepo salleRepo;
    @Autowired
    EmployeRepo employeRepo;
    @Autowired
    EquipementRepo equipementRepo;

    public reservationDTO fromreservation(reservation reservation){
        reservationDTO reservationDTO=new reservationDTO();
        BeanUtils.copyProperties(reservation,reservationDTO);
        return reservationDTO;
    }

    public reservation fromreservationDTO(reservationDTO reservationDTO){
        reservation reservation=new reservation();
        BeanUtils.copyProperties(reservationDTO,reservation);
        reservation.setSalle(salleRepo.findById(reservationDTO.getIds()).orElse(null));
        reservation.setEmploye(employeRepo.findById(reservationDTO.getIde()).orElse(null));
        reservation.setEquipements(equipementRepo.findAllById(reservationDTO.getEquipementIds()));
        return reservation;
    }
}
