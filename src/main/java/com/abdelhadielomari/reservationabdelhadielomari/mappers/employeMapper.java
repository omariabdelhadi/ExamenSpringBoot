package com.abdelhadielomari.reservationabdelhadielomari.mappers;

import com.abdelhadielomari.reservationabdelhadielomari.DTO.employeDTO;
import com.abdelhadielomari.reservationabdelhadielomari.Repository.ReservationRepo;
import com.abdelhadielomari.reservationabdelhadielomari.entities.employe;
import com.abdelhadielomari.reservationabdelhadielomari.entities.reservation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tools.jackson.databind.util.BeanUtil;

import java.util.ArrayList;
import java.util.List;

@Component
public class employeMapper {

    @Autowired
    private ReservationRepo reservationRepo;
    public employeDTO fromemploye(employe employe){
        employeDTO employeDTO=new employeDTO();
        BeanUtils.copyProperties(employe,employeDTO);
        return employeDTO;
    }
    public employe fromemployeDTO(employeDTO employeDTO){
        employe employe=new employe();
        BeanUtils.copyProperties(employeDTO,employe);
        employe.setReservationList(reservationRepo.findByEmployeIde(employeDTO.getIde()));
        return employe;
    }
}
