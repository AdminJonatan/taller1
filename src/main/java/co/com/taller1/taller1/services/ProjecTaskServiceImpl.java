package co.com.taller1.taller1.services;


import co.com.taller1.taller1.entities.Backlog;
import co.com.taller1.taller1.entities.ProjecTask;
import co.com.taller1.taller1.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjecTaskServiceImpl implements ProjecTasckServices{

    @Autowired
    private ProjectTaskRepository repository;

    @Override
    public List<ProjecTask> findAll() {
        return repository.findAll();
    }

    @Override
    public ProjecTask create(ProjecTask projecTask) {
        return repository.save(projecTask);
    }
}
