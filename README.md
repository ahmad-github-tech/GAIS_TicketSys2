# SupportFlow IT Support Task Manager

This project is a full-stack application with a **React (Vite) frontend** and a **Java (Spring Boot) backend**.

## Project Structure

- `pom.xml`: Maven configuration file.
- `package.json`: NPM package configuration for the React frontend.
- `/src/main/java`: Spring Boot backend source code.
- `/src/main/resources`: Backend configuration, SQL schema, and templates.
- `/src/App.tsx`, `/src/main.tsx`, etc.: React frontend source code.

## How to Run in STS (Spring Tool Suite)

1. **Prerequisites**: Ensure you have **Java 17+** and **Maven** installed.
2. **Import Project**:
   - Open STS.
   - Go to `File -> Import...`.
   - Select `Maven -> Existing Maven Projects`.
   - Browse to the root of this project and click `Finish`.
3. **Build Frontend**:
   - The `pom.xml` is configured with the `frontend-maven-plugin`.
   - Running `mvn clean install` will automatically:
     - Install Node.js and NPM locally (in the target folder).
     - Run `npm install` to get frontend dependencies.
     - Run `npm run build` to compile the React app.
     - Copy the compiled React app (`dist/`) into `src/main/resources/static`, making it accessible via the Spring Boot server.
4. **Run Backend**:
   - Right-click the project in STS.
   - Select `Run As -> Spring Boot App`.
   - The application will be available at `http://localhost:8080`.

## Database

By default, the application uses an **H2 In-Memory Database** for easy local development.
- H2 Console: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:supportflow_db`
- Username: `sa`
- Password: (blank)

## Features

- Real-time KPI tracking.
- SLA analytics.
- Searchable task logs.
- Corporate dark-mode interface.
