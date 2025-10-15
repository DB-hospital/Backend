package db.univ.hospital.repository;

import db.univ.hospital.domain.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SymptomRepository extends JpaRepository<Symptom, Long> {

}
