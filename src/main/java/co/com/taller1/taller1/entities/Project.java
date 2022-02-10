package co.com.taller1.taller1.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@Entity
@Table(name = "project")
public class Project extends Backlog {



    @Column(name = "NOMBRE")
    private String projecNAME;
    @Column(name = "IDENTIFICADOR")
    private String projecidentifier;
    @Column(name = "DESCRIPCION")
    private String description;
    @Column(name = "FECAH_INICIO")
    private Date startDate;
    @Column(name = "FECAH_FIN")
    private Date endDate;

/*
    @JsonBackReference // para que no muestre la relacion
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "backlog_id")
    private Backlog backlog;
*/



    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
