package net.dev.carlosdev.model.tasks.gateways;

import net.dev.carlosdev.model.tasks.Tasks;

public interface TasksRepository {

    Iterable<Tasks> findAll();

    Tasks findById(Long id);

    Tasks save(Tasks task);

    void delete(Long id);
}
