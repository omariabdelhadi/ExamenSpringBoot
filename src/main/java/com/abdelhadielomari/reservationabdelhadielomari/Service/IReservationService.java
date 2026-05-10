package com.abdelhadielomari.reservationabdelhadielomari.Service;

import com.abdelhadielomari.reservationabdelhadielomari.DTO.employeDTO;
import com.abdelhadielomari.reservationabdelhadielomari.DTO.reservationDTO;

import java.util.List;

public interface IReservationService {
    void AddReservation(reservationDTO reservationDTO);
    List<reservationDTO> listreservation(Long Idemp);
}
