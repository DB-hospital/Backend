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
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String call;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private List<Review> reviews;

    @ManyToMany(mappedBy = "hospitals")
    private List<Department> departments;
}
