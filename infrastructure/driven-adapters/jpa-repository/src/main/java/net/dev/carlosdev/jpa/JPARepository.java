package net.dev.carlosdev.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import net.dev.carlosdev.jpa.jpa.TasksDto;

import java.util.Optional;

public interface JPARepository extends CrudRepository<TasksDto/* change for adapter model */, String>, QueryByExampleExecutor<TasksDto/* change for adapter model */> {

        void deleteById(String valueOf);

        Optional<TasksDto> findByName(String name);
}
