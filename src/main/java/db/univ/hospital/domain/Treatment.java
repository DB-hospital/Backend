package db.univ.hospital.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String treatment;

    @Column(nullable = false)
    private String description;

    @ManyToMany(mappedBy = "treatments")
    private List<Symptom> symptoms;
}
