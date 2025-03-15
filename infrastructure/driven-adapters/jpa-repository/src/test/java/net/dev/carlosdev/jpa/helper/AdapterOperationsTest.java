package net.dev.carlosdev.jpa.helper;

import net.dev.carlosdev.jpa.jpa.TasksDto;
import net.dev.carlosdev.model.tasks.Tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

interface TasksRepository extends CrudRepository<TasksDto, Long>, QueryByExampleExecutor<TasksDto> {
}

class AdapterOperationsTest {

    @Mock
    private TasksRepository repository;

//    @InjectMocks
//    private AdapterOperations<Tasks, TasksDto, Long, TasksRepository> adapter;
//
//    private TasksDto taskDto;
//    private Tasks task;
//    private List<TasksDto> taskDtos;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//
//        // Initialize test objects with correct types
//        taskDto = new TasksDto(1L, "name", "description", "status", "priority", "date", "time");
//        task = new Tasks(1L, "name", "description", "status", "priority", "date", "time");
//        taskDtos = List.of(taskDto);
//    }
//
//    @Test
//    void testFindById() {
//        when(repository.findById(Long.valueOf("id"))).thenReturn(Optional.of(taskDto));
//        Tasks result = adapter.findById(Long.valueOf("id"));
//        assertNotNull(result);
//        assertEquals(task.getId(), result.getId());
//    }
//
//    @Test
//    void testFindAll() {
//        when(repository.findAll()).thenReturn(taskDtos);
//        List<Tasks> result = adapter.findAll();
//        assertNotNull(result);
//        assertEquals(1, result.size());
//        assertEquals(task.getId(), result.get(0).getId());
//    }
//
//    @Test
//    void testSaveAllEntities() {
//        when(repository.saveAll(taskDtos)).thenReturn(taskDtos);
//        List<Tasks> result = adapter.saveAllEntities(List.of(task));
//        assertNotNull(result);
//        assertEquals(1, result.size());
//    }
//
//    @Test
//    void testSave() {
//        when(repository.save(taskDto)).thenReturn(taskDto);
//        Tasks result = adapter.save(task);
//        assertNotNull(result);
//        assertEquals(task.getId(), result.getId());
//    }
//
//    @Test
//    void testFindByExample() {
//        when(repository.findById(Long.valueOf("id"))).thenReturn(Optional.of(taskDto));
//        Tasks result = (Tasks) adapter.findByExample(task);
//        assertNotNull(result);
//        assertEquals(task.getId(), result.getId());
//    }
}
