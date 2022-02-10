package co.com.taller1.taller1.controller;


import co.com.taller1.taller1.entities.Backlog;
import co.com.taller1.taller1.services.BacklogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Backlog")
public class BacklogController {


    @Autowired
    private BacklogServices services;


    @GetMapping("")
    public List<Backlog> findAll(){

        return services.findAll();
    }

    @PostMapping
      public Backlog create(@RequestBody Backlog backlog){
        return  services.create(backlog);
    }

}
