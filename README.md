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
3. **Troubleshooting "Main Type not found" or Files Missing**:
   - **Refresh**: Right-click the project name in Package Explorer and select **Refresh** (F5).
   - **Maven Update**: Right-click project -> **Maven -> Update Project...** -> Check **"Force Update of Snapshots/Releases"** -> Click **OK**.
   - **Source Folders**: If `src/main/java` is not showing as a source folder, right-click project -> **Properties -> Java Build Path -> Source tab**. Add `src/main/java` and `src/main/resources` if they are not listed.
4. **Build Frontend**:
   - The `pom.xml` is configured with the `frontend-maven-plugin`.
   - Running `mvn clean install` from the command line or within STS (Run As -> Maven install) will automatically:
     - Install Node.js and NPM locally.
     - Run `npm install` and `npm run build`.
     - Copy the compiled React app into `src/main/resources/static`.
5. **Run Backend**:
   - Right-click the project in STS.
   - Select **Run As -> Spring Boot App**.
   - If you still don't see "Spring Boot App", right-click `SupportFlowApplication.java` directly and select **Run As -> Java Application**.
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
