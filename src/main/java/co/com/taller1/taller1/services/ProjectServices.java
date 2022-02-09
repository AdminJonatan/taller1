package co.com.taller1.taller1.services;


import co.com.taller1.taller1.entities.Project;

import java.util.List;

public interface ProjectServices {


    //LOS METODOS QUE VAMOS A HACER
    List<Project> findAll();
    Project create(Project project);
}
