package com.cospina.ingecaem.app.models.dao.general;

import com.cospina.ingecaem.app.models.documents.general.Task;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TaskDao extends ReactiveMongoRepository<Task, String> {
}
