# Login App

**Login App** is a simple Java application that demonstrates how to create a login window using Swing. It takes a username and password input and checks if the credentials match predefined values ("username" and "password"). If they match, it prints a successful login message, otherwise, it prints a failed login message.

## Features

- **Graphical User Interface (GUI):**
  - A login screen with fields for username and password.
  - A login button to submit the entered credentials.
  
- **Login Functionality:**
  - Verifies the entered username and password against predefined values.
  - Provides feedback on successful or failed login attempts.

## Technologies Used

- **Java** - The main programming language used to build the application.
- **Swing** - A Java library for building graphical user interfaces (GUIs).
- **SpringLayout** - Used to arrange components in the login panel.

## Getting Started

### Prerequisites

To run this app, you need:

- JDK (Java Development Kit) installed on your machine.
- An IDE like IntelliJ IDEA, Eclipse, or NetBeans (optional, but recommended).

### Steps to Run

1. Clone or download the repository to your local machine.
2. Open the project in your IDE or text editor.
3. Compile and run the `LoginApp` class to launch the login window.

### Code Explanation

- **CommanConstants**: This class contains constant values for the application, such as the application name, frame size, and text field size.
  
- **LoginGUI**: The `LoginGUI` class is responsible for creating the login window using Swing components:
  - A `JLabel` for the username and password fields.
  - `JTextField` for entering the username.
  - `JPasswordField` for entering the password.
  - A `JButton` for submitting the credentials.
  - `SpringLayout` is used to manage the layout of the components.

- **LoginApp**: This is the entry point of the application. It launches the `LoginGUI` window.

## Example Usage

- Open the app, and enter the following credentials:
  - **Username**: username
  - **Password**: password

- If the credentials are correct, the console will display:
  ```
  LOGIN SUCCESSFUL!
  ```

- If the credentials are incorrect, the console will display:
  ```
  LOGIN FAILED...
  ```

## License

This project is open-source and available under the MIT License.
