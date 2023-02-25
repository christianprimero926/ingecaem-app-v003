package com.cospina.ingecaem.app.models.services.general;

import com.cospina.ingecaem.app.models.dao.general.TaskDao;
import com.cospina.ingecaem.app.models.documents.general.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskDao taskDao;

    /**
     * @return Flux<Task>
     */
    @Override
    public Flux<Task> findAll() {
        return taskDao.findAll();
    }

    /**
     * @param id
     * @return Mono<Task>
     */
    @Override
    public Mono<Task> findById(String id) {
        return taskDao.findById(id);
    }

    /**
     * @param task
     * @return
     */
    @Override
    public Mono<Task> save(Task task) {
        return taskDao.save(task);
    }

    /**
     * @param task
     * @return
     */
    @Override
    public Mono<Void> delete(Task task) {
        return taskDao.delete(task);
    }
}
