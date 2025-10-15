package db.univ.hospital.repository;

import db.univ.hospital.domain.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment, Long> {

}
