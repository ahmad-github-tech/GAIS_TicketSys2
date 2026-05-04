package com.supportflow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "support_tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupportTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String ticketId;

    @Column(nullable = false)
    private String projectId;

    @Enumerated(EnumType.STRING)
    private SupportLevel supportLevel;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    private LocalDateTime generationDate;
    private LocalDateTime responseDate;
    private LocalDateTime closureDate;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    private boolean userIntimated;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @Column(columnDefinition = "TEXT")
    private String solution;
    
    @Column(columnDefinition = "TEXT")
    private String remarks;

    private String assignedTo;
}
