package com.cospina.ingecaem.app.controller.general;

import com.cospina.ingecaem.app.models.documents.general.Task;
import com.cospina.ingecaem.app.models.services.general.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@SessionAttributes("task")
public class TaskController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);
    @Autowired
    private TaskService taskService;

    /*@GetMapping("/task/show/all")
    public Mono<String> showAll(Model model) {
        Flux<Task> taskFlux = taskService.findAll();

        model.addAttribute("task", taskFlux);
        model.addAttribute("title", "Listado de tareas");

        return Mono.just("task/show/all");
    }*/
}
