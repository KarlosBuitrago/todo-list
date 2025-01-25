package net.dev.carlosdev.api;
import lombok.RequiredArgsConstructor;
import net.dev.carlosdev.model.tasks.Tasks;
import net.dev.carlosdev.usecase.managetasks.ManageTasksUseCase;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * API Rest controller.
 * 
 * Example of how to declare and use a use case:
 * <pre>
 * private final MyUseCase useCase;
 * 
 * public String commandName() {
 *     return useCase.execute();
 * }
 * </pre>
 */
@RestController
@ResponseBody
@RequestMapping(value = "/api/v1/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ApiRest {

    private final ManageTasksUseCase manageTasksUseCase;

    @GetMapping("/all")
    public Iterable<Tasks> getTasks() {
        return  manageTasksUseCase.getTasks();         
    }

    @GetMapping("/get/{id}")
    public Tasks getTaskById(@PathVariable("id") Long id) {
        return manageTasksUseCase.getTask(id);
    }

    @PostMapping("/save")
    public Tasks createTask(@RequestBody Tasks tasksDto) {
        System.out.println("tasksDto: " + tasksDto.toString());
        return manageTasksUseCase.createTask(tasksDto);
    }

    @PutMapping("/update/{id}")
    public Tasks updateTask(@PathVariable Long id, @RequestBody Tasks task) {
        return manageTasksUseCase.updateTask(id, task);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteTask(@PathVariable Long id) {
        manageTasksUseCase.deleteTask(id);
    }
}
