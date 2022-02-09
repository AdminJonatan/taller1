package co.com.taller1.taller1.repository;


import co.com.taller1.taller1.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    //POR DEBAJO HACE EL CRUD
}
