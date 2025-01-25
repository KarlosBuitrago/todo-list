package net.dev.carlosdev.usecase.managetasks;

import lombok.RequiredArgsConstructor;
import net.dev.carlosdev.model.tasks.Tasks;
import net.dev.carlosdev.model.tasks.gateways.TasksRepository;
@RequiredArgsConstructor
public class ManageTasksUseCase {

    private final TasksRepository repository;

    public String execute() {
        return repository.findAll().toString();
    }

    public Tasks createTask(Tasks task) {
        return repository.save(task);
    }

    public Tasks updateTask(Long id, Tasks task) {
        if (repository.findById(id) != null) {
            throw new RuntimeException("Task not found");
        }else {
            return repository.save(task);
        }
    }

    public void deleteTask(Long id) {
        repository.delete(id);
    }

    public Tasks getTask(Long id) {
        return repository.findById(id);
    }

    public Iterable<Tasks> getTasks() {
        return repository.findAll();
    }
}
