package db.univ.hospital.repository;

import db.univ.hospital.domain.Precaution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrecautionRepository extends JpaRepository<Precaution, Long> {

}
