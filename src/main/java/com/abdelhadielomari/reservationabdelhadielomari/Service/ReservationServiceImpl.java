package com.abdelhadielomari.reservationabdelhadielomari.Service;

import com.abdelhadielomari.reservationabdelhadielomari.DTO.reservationDTO;
import com.abdelhadielomari.reservationabdelhadielomari.Repository.ReservationRepo;
import com.abdelhadielomari.reservationabdelhadielomari.entities.reservation;
import com.abdelhadielomari.reservationabdelhadielomari.mappers.reservationMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class ReservationServiceImpl implements IReservationService{
    @Autowired
    private ReservationRepo reservationRepo;
    @Autowired
    private reservationMapper reservationMapper;
    @Override
    public void AddReservation(reservationDTO reservationDTO) {
        reservation reservation;
        reservation=reservationMapper.fromreservationDTO(reservationDTO);
        reservationRepo.save(reservation);
    }

    @Override
    public List<reservationDTO> listreservation(Long Idemp) {
        List<reservation> reservationList=reservationRepo.findByEmployeIde(Idemp);
        List<reservationDTO> reservationDTOList=new ArrayList<>();
        reservationList.forEach(r->reservationDTOList.add(reservationMapper.fromreservation(r)));
        return reservationDTOList;
    }
}
