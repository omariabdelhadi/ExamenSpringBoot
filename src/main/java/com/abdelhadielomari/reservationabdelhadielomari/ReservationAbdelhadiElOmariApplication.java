package com.abdelhadielomari.reservationabdelhadielomari;

import com.abdelhadielomari.reservationabdelhadielomari.Repository.EmployeRepo;
import com.abdelhadielomari.reservationabdelhadielomari.Repository.EquipementRepo;
import com.abdelhadielomari.reservationabdelhadielomari.Repository.ReservationRepo;
import com.abdelhadielomari.reservationabdelhadielomari.Repository.SalleRepo;
import com.abdelhadielomari.reservationabdelhadielomari.entities.employe;
import com.abdelhadielomari.reservationabdelhadielomari.entities.equipement;
import com.abdelhadielomari.reservationabdelhadielomari.entities.reservation;
import com.abdelhadielomari.reservationabdelhadielomari.entities.salle;
import com.abdelhadielomari.reservationabdelhadielomari.enums.TypeEq;
import com.abdelhadielomari.reservationabdelhadielomari.enums.TypeS;
import com.abdelhadielomari.reservationabdelhadielomari.enums.reservationStatue;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ReservationAbdelhadiElOmariApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationAbdelhadiElOmariApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EmployeRepo employeRepo, EquipementRepo equipementRepo, ReservationRepo reservationRepo, SalleRepo salleRepo){
        return args -> {
            employe e= employe.builder()
                    .nom("ahmed")
                    .email("exemple@gmail.com")
                    .build();
            reservation r=reservation.builder()
                    .date(new Date())
                    .duree(5)
                    .description("description")
                    .reservationstatue(reservationStatue.PENDING)
                    .build();
            equipement eq=equipement.builder()
                    .nomeq("data show")
                    .poids(132.0)
                    .typeeq(TypeEq.CAMERA)
                    .build();
            salle s=salle.builder()
                    .numero(123)
                    .noms("INFO")
                    .nombreplace(8)
                    .typeSalle(TypeS.COURS)
                    .build();

            r.setEmploye(e);
            r.setSalle(s);
            r.getEquipements().add(eq);
            employeRepo.save(e);
            salleRepo.save(s);
            equipementRepo.save(eq);
            reservationRepo.save(r);

        };
    }

}
