package co.com.taller1.taller1.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "Backlog")
public class Backlog {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String projecidentifier;


    @JsonBackReference // para que no muestre la relacion
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private  Project project;

    @JsonManagedReference //MANEJAR LA CONSULTA
    @OneToMany(mappedBy = "projecTaks_id",cascade = CascadeType.PERSIST) // PERSIST PARA QUE NO ELIMINE LA RESERVA
    private  List<Backlog> backlogs;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backlog backlog = (Backlog) o;
        return Objects.equals(id, backlog.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
