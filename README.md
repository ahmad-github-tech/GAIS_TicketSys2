# SupportFlow IT Support Task Manager

This project is a full-stack application with a **React frontend** and a **Java (Spring Boot) backend**.

## Project Structure

- `pom.xml`: Maven configuration file.
- `src/main/java`: Spring Boot backend source code.
- `src/main/resources`: Backend configuration, SQL schema, and templates.
- `frontend/`: React frontend source code (Vite).

## Fixing STS Errors

### 1. "Cannot find the declaration of element 'project'"
This is often caused by STS being unable to download the Maven XSD.
- Go to **Window -> Preferences -> General -> Network Connections -> Cache**.
- Click **Remove All** and then **OK**.
- Right-click project name -> **Maven -> Update Project...** -> Check **Force Update** -> Click **OK**.

### 2. "Selection does not contain main type"
This means STS doesn't realize `src/main/java` contains your code.
- Right-click the project -> **Properties**.
- Go to **Java Build Path** -> **Source** tab.
- Click **Add Folder...** and ensure `src/main/java` and `src/main/resources` are checked.
- If they are already there but nested (e.g., `src` is checked but not subfolders), remove `src` and add the specific subfolders.

### 3. Missing Getters/Setters
I have removed the Lombok dependency and added explicit Getters and Setters to `SupportTask.java` to ensure compatibility with all IDEs without needing extra plugins.

## Simplest Way to Run (Recommended)

I have pre-built the frontend for you and combined it with the backend. You do **not** need to install Node.js or run any terminal commands.

1. **In STS**:
   - Right-click the project.
   - Select **Refresh** (or press F5).
   - Right-click `SupportFlowApplication.java`.
   - Select **Run As -> Java Application**.

2. **In Browser**:
   - Open **http://localhost:8080**.
   - Your application is now running entirely on this single port.

---

## Technical Details (For Developers)

## Database details

Uses **H2 In-Memory Database** by default.
- H2 Console: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:supportflow_db`
