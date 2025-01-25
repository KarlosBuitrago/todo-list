package net.dev.carlosdev.model.tasks.gateways;

import net.dev.carlosdev.model.tasks.Tasks;

import java.util.Optional;

public interface TasksRepository {

    Iterable<Tasks> findAll();

    Tasks findById(Long id);

    Optional<Tasks> findByName(String name);

    Tasks save(Tasks task);

    void delete(Long id);
}
