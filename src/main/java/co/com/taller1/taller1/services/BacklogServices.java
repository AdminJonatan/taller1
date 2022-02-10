package co.com.taller1.taller1.services;

import co.com.taller1.taller1.entities.Backlog;

import java.util.List;

public interface BacklogServices {

    List<Backlog> findAll();
    Backlog create(Backlog backlog);
}
