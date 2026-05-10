package com.abdelhadielomari.reservationabdelhadielomari.Repository;

import com.abdelhadielomari.reservationabdelhadielomari.entities.equipement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipementRepo extends JpaRepository<equipement,Long> {
    List<equipement> findByReservationListIdr(Long idr);
}
