package co.com.taller1.taller1.controller;

import co.com.taller1.taller1.entities.ProjecTask;
import co.com.taller1.taller1.services.ProjecTasckServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/ProjecTask")
public class ProjectTaskController {


    @Autowired
    private ProjecTasckServices services;

    @GetMapping
    public List<ProjecTask> findAll(){
        return services.findAll();
    }

    @PostMapping
    public ProjecTask create(@RequestBody ProjecTask projecTask){
        return  services.create(projecTask);
    }
}

