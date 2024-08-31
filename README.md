# Task Management Sytem

## Overview
This project is a Task Management System built using Spring Boot. The backend is powered by Java, with MySQL as the database. Lombok is used to reduce boilerplate code.

## Initial Commit

### Features:
- **Login/Signup API**:
  - Implemented basic authentication functionality, allowing users to register and log in.
  
- **Database Setup**:
  - Initialized the database schema.
  - Created the `user` table to store user credentials and information.

- **Admin Account**:
  - Added an initial admin account to manage the system. This account is created automatically during the database initialization.

### How to Get Started:
1. **Clone the Repository**:
   ```
   git clone <repository-url](https://github.com/shaikhafsaralli/Task-Management-System/new/master>
   ```
   
2. **Setup Database**:
   - Ensure you have MySQL installed and running.
   - Update the `application.properties` with your database credentials.
   - The `user` table and admin account will be created automatically when the application runs for the first time.

3. **Run the Application**:
   ```
   ./mvnw spring-boot:run
   ```

4. **Access the API**:
   - The API is accessible at `http://localhost:8080/api/login` and `http://localhost:8080/api/signup`.

### Next Steps:
- Implement additional APIs for task management.
- Develop role-based access controls.
- Create the front-end interface for easier interaction.

---

This provides a clear description of what has been done in the first commit and guides anyone who clones the repository on how to get started.
