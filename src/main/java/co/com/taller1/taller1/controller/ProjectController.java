package co.com.taller1.taller1.controller;

import co.com.taller1.taller1.entities.Backlog;
import co.com.taller1.taller1.entities.ProjecTask;
import co.com.taller1.taller1.entities.Project;
import co.com.taller1.taller1.services.ProjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Project")
public class ProjectController {


    @Autowired
    private ProjectServices services;

    @GetMapping
    public List<Project> findAll(){
        return services.findAll();
    }

    @PostMapping
    public Project create(@RequestBody Project project){
        return  services.create(project);
    }
}
