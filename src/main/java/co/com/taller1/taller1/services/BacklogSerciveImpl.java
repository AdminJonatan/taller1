package co.com.taller1.taller1.services;


import co.com.taller1.taller1.entities.Backlog;
import co.com.taller1.taller1.repository.BacklogRepsository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BacklogSerciveImpl implements BacklogServices {

    @Autowired
    private BacklogRepsository repsository;

    @Override
    public List<Backlog> findAll() {
        return repsository.findAll();
    }

    @Override
    public Backlog create(Backlog backlog) {
        return repsository.save(backlog);
    }
}
