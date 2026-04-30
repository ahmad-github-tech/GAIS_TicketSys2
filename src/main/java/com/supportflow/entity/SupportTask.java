package com.supportflow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "support_tasks")
public class SupportTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String ticketId;
    private String projectId;
    private String supportLevel;
    private String priority;
    private String generationDate;
    private String responseDate;
    private String closureDate;
    private String status;
    private boolean userIntimated;
    private String description;
    private String solution;
    private String remarks;
    private String assignedTo;
}
