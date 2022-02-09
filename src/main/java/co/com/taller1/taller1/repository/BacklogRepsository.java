package co.com.taller1.taller1.repository;

import co.com.taller1.taller1.entities.Backlog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BacklogRepsository extends JpaRepository<Backlog,Long> {
    //POR DEBAJO HACE EL CRUD

}
