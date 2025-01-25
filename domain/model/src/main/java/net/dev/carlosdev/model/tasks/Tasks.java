package net.dev.carlosdev.model.tasks;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Tasks {
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private String date;
    private String time;
}
