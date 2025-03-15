package net.dev.carlosdev.jpa.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.dev.carlosdev.model.tasks.Tasks;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")
public class TasksDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private String date;
    private String time;

    public Tasks toTasks() {
        return new Tasks(id, name, description, status, priority, date, time);
    }

    public static TasksDto fromTasks(Tasks tasks) {
        return new TasksDto();
    }

}
