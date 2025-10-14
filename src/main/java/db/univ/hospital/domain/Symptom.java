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
public class Symptom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String symptom;

    @Column(nullable = false)
    private String body_part;

    @Lob
    @Column(nullable = false)
    private String description;

    @ManyToMany
    @JoinTable(
            name = "recommends",
            joinColumns = @JoinColumn(name = "symptom_id"),
            inverseJoinColumns = @JoinColumn(name = "medicine_id")
    )
    private List<Medicine> medicines;

    @ManyToMany
    @JoinTable(
            name = "suggests",
            joinColumns = @JoinColumn(name = "symptom_id"),
            inverseJoinColumns = @JoinColumn(name = "treatment_id")
    )
    private List<Treatment> treatments;

    @ManyToMany(mappedBy = "symptoms")
    private List<Department> departments;
}
