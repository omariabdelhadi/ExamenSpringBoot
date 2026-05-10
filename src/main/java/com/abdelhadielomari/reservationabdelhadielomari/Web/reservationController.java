package com.abdelhadielomari.reservationabdelhadielomari.Web;

import com.abdelhadielomari.reservationabdelhadielomari.DTO.reservationDTO;
import com.abdelhadielomari.reservationabdelhadielomari.Service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class reservationController {

    @Autowired
    private IReservationService iReservationService;
    @PostMapping("/ajouterReservation")
    public void addR(@RequestBody reservationDTO reservationDTO){
        iReservationService.AddReservation(reservationDTO);
    }
    @GetMapping("/listReservation/{ide}")
    public List<reservationDTO> listr(@PathVariable Long ide){
        return iReservationService.listreservation(ide);
    }
}
