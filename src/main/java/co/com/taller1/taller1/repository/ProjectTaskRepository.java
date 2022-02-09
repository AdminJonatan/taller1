package co.com.taller1.taller1.repository;


import co.com.taller1.taller1.entities.ProjecTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjecTask,Long> {

    //POR DEBAJO HACE EL CRUD
}
