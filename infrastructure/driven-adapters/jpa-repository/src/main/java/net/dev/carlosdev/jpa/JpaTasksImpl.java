package net.dev.carlosdev.jpa;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import net.dev.carlosdev.model.tasks.Tasks;
import net.dev.carlosdev.model.tasks.gateways.TasksRepository;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class JpaTasksImpl implements TasksRepository{

    private final JPARepositoryAdapter jpaRepositoryAdapter;

    @Override
    public Iterable<Tasks> findAll() {
        return jpaRepositoryAdapter.findAll();
    }

    @Override
    public Tasks findById(Long id) {
        return jpaRepositoryAdapter.findById(String.valueOf(id));
    }

    @Override
    public Tasks save(Tasks task) {
        try {
            return jpaRepositoryAdapter.save(task);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delete(Long id) {
        jpaRepositoryAdapter.deleteById(String.valueOf(id));
    }

    @Override
    public Optional<Tasks> findByName(String name) {
        return jpaRepositoryAdapter.findByName(name);
    }
}
