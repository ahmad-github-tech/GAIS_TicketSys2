INSERT INTO support_tasks (ticket_id, project_id, support_level, priority, status, description, assigned_to, generation_date, response_date, user_intimated) 
VALUES ('INC8821', 'MERCURY_ERP', 'L2', 'HIGH', 'Open', 'Database connection timeout in production', 'Jamal Ahmad', CURRENT_TIMESTAMP, NULL, false);

INSERT INTO support_tasks (ticket_id, project_id, support_level, priority, status, description, assigned_to, generation_date, response_date, user_intimated) 
VALUES ('INC8822', 'SAP_INTEG', 'L3', 'URGENT', 'In Progress', 'Middleware sync failure after patch upgrade', 'Sarah Chen', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);

INSERT INTO support_tasks (ticket_id, project_id, support_level, priority, status, description, assigned_to, generation_date, response_date, closure_date, user_intimated) 
VALUES ('INC8823', 'MERCURY_ERP', 'L1', 'LOW', 'Resolved', 'Password reset for finance user', 'Admin', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, true);
