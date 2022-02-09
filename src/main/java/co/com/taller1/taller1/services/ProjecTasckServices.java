package co.com.taller1.taller1.services;


import co.com.taller1.taller1.entities.ProjecTask;


import java.util.List;

public interface ProjecTasckServices {

    List<ProjecTask> findAll();
    ProjecTask create(ProjecTask projecTask);
}
