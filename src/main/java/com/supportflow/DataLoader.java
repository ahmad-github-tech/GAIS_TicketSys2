package com.supportflow;

import com.supportflow.model.*;
import com.supportflow.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Random;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initData(TaskRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                String[] projects = {"HR-Portal", "E-Commerce", "Internal-CRM", "Mobile-App"};
                String[] users = {"John.D", "Sarah.M", "Admin", "Support.Alpha"};
                String[] issues = {
                    "Network Connectivity Loss", "VPN Authentication Failed", 
                    "Slow Database Query response", "Software Install Request", 
                    "Password Reset Required", "Application Crash on Startup"
                };
                Random random = new Random();

                for (int i = 0; i < 50; i++) {
                    SupportTask task = new SupportTask();
                    task.setTicketId("INC-" + (1000 + i));
                    task.setProjectId(projects[random.nextInt(projects.length)]);
                    task.setSupportLevel(SupportLevel.values()[random.nextInt(4)]);
                    task.setPriority(Priority.values()[random.nextInt(4)]);
                    task.setGenerationDate(LocalDateTime.now().minusDays(random.nextInt(30)));
                    task.setResponseDate(task.getGenerationDate().plusHours(random.nextInt(2)));
                    
                    if (random.nextDouble() > 0.3) {
                        task.setClosureDate(task.getResponseDate().plusDays(random.nextInt(3)));
                        task.setStatus(random.nextDouble() > 0.2 ? TaskStatus.Closed : TaskStatus.Resolved);
                        task.setUserIntimated(random.nextBoolean());
                    } else {
                        task.setStatus(TaskStatus.InProgress);
                    }
                    
                    task.setDescription(issues[random.nextInt(issues.length)]);
                    task.setSolution("Standard system protocol followed.");
                    task.setRemarks("Monitored.");
                    task.setAssignedTo(users[random.nextInt(users.length)]);
                    
                    repository.save(task);
                }
                System.out.println("Mock tasks loaded.");
            }
        };
    }
}
