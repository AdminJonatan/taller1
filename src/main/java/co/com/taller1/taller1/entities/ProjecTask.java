package co.com.taller1.taller1.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@Entity
@Table(name = "projecTask1")
public class ProjecTask extends EntidadBase{



    private String name;
    private String summary;
    private String acceptanceCriteria;
    private String status;
    private Integer priority;
    private Double hours;
    private Date startDate;
    private Date endDate;


/*
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "backlog_id")
    private  Backlog backlog;
*/

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

