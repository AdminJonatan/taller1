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
@Table(name = "ProjecTask")
public class ProjecTask extends Backlog{



    private String name;
    private String summary;
    private String acceptanceCriteria;
    private String status;
    private  Integer priority;
    private Double hours;
    private Date startDate;
    private Date endDate;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_task_id")
    private  ProjecTask projecTask;


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

