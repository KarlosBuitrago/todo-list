package net.dev.carlosdev.jpa;

import net.dev.carlosdev.jpa.helper.AdapterOperations;
import net.dev.carlosdev.jpa.jpa.TasksDto;
import net.dev.carlosdev.model.tasks.Tasks;

import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Tasks/* change for domain model */, TasksDto/* change for adapter model */, String, JPARepository>
 //implements TasksRepository
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Tasks.class/* change for domain model */));
    }

    public void deleteById(String valueOf) {
        repository.deleteById(valueOf);
    }

    public Optional<Tasks> findByName(String name) {
        return repository.findById(name).stream()
                .map(d -> mapper.map(d, Tasks.class/* change for domain model */)).findFirst();

    }
}
