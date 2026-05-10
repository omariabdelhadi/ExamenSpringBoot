package com.abdelhadielomari.reservationabdelhadielomari.Repository;

import com.abdelhadielomari.reservationabdelhadielomari.entities.reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepo extends JpaRepository<reservation,Long> {
    List<reservation> findAllByEmployeIde(Long employeIde);
}
