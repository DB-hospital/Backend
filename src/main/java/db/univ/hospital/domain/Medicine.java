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
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String manufacturer;

    @Column(nullable = false)
    private String efficacy;

    @ManyToMany
    @JoinTable(
            name = "contains",
            joinColumns = @JoinColumn(name = "medicine_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private List<Ingredient> ingredients;

    @OneToMany(mappedBy = "medicine", cascade = CascadeType.ALL)
    private List<Precaution> precautions;

    @ManyToMany(mappedBy = "medicines")
    private List<Symptom> symptoms;
}
