package model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "tugas")
public class Tugas extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "tugasSequence", sequenceName = "tugas_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "tugasSequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    public Long id;

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "score", nullable = false)
    public Integer score;

    @ManyToOne
    @JoinColumn(name = "peserta_id")
    public Peserta peserta;

}
