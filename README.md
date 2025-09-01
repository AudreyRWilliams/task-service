# Java Task Service Project
A small Java application that lets you create, view, and complete tasks. It uses a TaskService class to manage tasks in memory, supports adding new tasks, retrieving all tasks, and marking tasks as complete. The project is built with Maven, includes unit tests with JUnit, and runs as a simple console program.

<img width="628" height="388" alt="Screen Shot 2025-09-01 at 2 41 35 PM" src="https://github.com/user-attachments/assets/1bf7a8a7-aef9-45c1-8f4b-0972a43e0193" />
<hr>
<img width="678" height="291" alt="Screen Shot 2025-09-01 at 8 15 33 AM" src="https://github.com/user-attachments/assets/b501f410-c51c-4039-971b-f08a43a524fa" />
<hr>
Below are the steps to <b>recreate and run</b> this project in <b>GitHub Codespaces</b>:

## 🔹 Step 1: Create the repository
- Go to GitHub.
- Click <b>New Respository</b>.
     - Name: `task-service`
     - Public (or private if you prefer)
     - Initialize with a README
- Click <b>Create Repository</b>
## 🔹 Step 2: Open the repository in a Codespace
- In your repo page, click the green <b>Code</b> button.
- Go to the <b>Codespaces</b> tab → click <b>Create codespace on main</b>.
     - GitHub will provision a Linus dev environment with VS Code inside the browser.
## 🔹 Step 3. Add the Java Project
- In Codespaces, open a terminal (bottom panel).
- Create the project structure:

<img width="520" height="121" alt="Screen Shot 2025-09-01 at 9 32 02 AM" src="https://github.com/user-attachments/assets/2b11e80c-b706-48de-949e-2074f11d7c08" />

- Create `pom.xml` in the `task-service/` folder.
- Add your Java files in `src/main/java/com/example/taskservice/`. (Main.java, Task.java, TaskService.java)
- Add the unit tests (optional but a good practice)  `src/test/java/com/example/taskservice/TaskServiceTest.java`
## 🔹 Step 4. Verify Java & Maven
Codespaces usually comes with Java, but check:

<img width="302" height="110" alt="Screen Shot 2025-09-01 at 9 47 48 AM" src="https://github.com/user-attachments/assets/4a5b0dc7-69db-40f0-bc5a-64d172616300" />

- If missing, install Maven:
     
<img width="246" height="113" alt="Screen Shot 2025-09-01 at 9 49 26 AM" src="https://github.com/user-attachments/assets/856126b9-f9d2-43b4-a54d-0f4694df6821" />

## 🔹 Step 5. Build the Project
In terminal:

<img width="269" height="87" alt="Screen Shot 2025-09-01 at 1 11 21 PM" src="https://github.com/user-attachments/assets/91079b22-1235-4abd-986c-877a9099cc47" />

## 🔹 Step 6. Run the Project
Use Maven’s exec plugin (already in pom.xml):

<img width="203" height="78" alt="Screen Shot 2025-09-01 at 1 13 14 PM" src="https://github.com/user-attachments/assets/09000250-1c03-4ff0-ac28-cd917651f79e" />

You should see output like:

<img width="526" height="224" alt="Screen Shot 2025-09-01 at 1 15 21 PM" src="https://github.com/user-attachments/assets/9855e8a3-31d2-42f8-a9d1-4199925dfd47" />

## 🔹 Step 7. Run Tests

<img width="171" height="83" alt="Screen Shot 2025-09-01 at 1 16 03 PM" src="https://github.com/user-attachments/assets/4b640b3b-6e19-48de-aedb-7decdc5fff85" />

## 🔹 Step 8. Commit and Push
When everything works in the GitHub Codespace, push the application to the GitHub repository:

<img width="498" height="134" alt="Screen Shot 2025-09-01 at 1 17 58 PM" src="https://github.com/user-attachments/assets/6f8597ae-718f-4b39-bb10-d59a9610d711" />
