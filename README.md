# Cinema Management System

The Cinema Management System is an open-source Java project that provides a platform for managing various aspects of a cinema, such as admin operations, ticket handling, and cinema management. The system is built on top of a relational database, allowing seamless data storage and retrieval.

## Features

- **Admin Operations**: Manage cinema administrators with options for adding, updating, and searching admins in the system.

- **Ticket Handling**: Facilitate ticket operations, including ticket booking, canceling, and viewing ticket details.

- **Cinema Management**: Support cinema management functionalities, such as adding new cinemas, confirming cinema registrations, and displaying unconfirmed cinemas.

## Project Structure

The project contains several Java classes, each responsible for specific functionality:

- `AdminRepository`: Handles admin-related database operations, including admin import and search.

- `BasketRepository`: Manages the user's basket, allowing the addition and removal of tickets.

- `CinemaRepository`: Responsible for cinema-related database operations, including cinema import, confirmation, and search.

- `TicketRepository`: Manages ticket-related database operations, such as ticket import, viewing, and search.

- `UserRepository`: Handles user-related database operations, including user import and search.

## How to Use

To use the Cinema Management System in your Java application, follow these steps:

1. Clone the repository to your local machine.

2. Ensure you have the required database (e.g., MySQL) and configure the connection details in the respective classes.

3. Build the project and include the necessary dependencies, if any.

4. Import the required classes into your application.

5. Instantiate the necessary repositories with a valid database connection.

6. Start using the available methods in each repository to perform desired operations.

## Contributing

We welcome contributions to the Cinema Management System! If you find a bug, have a suggestion, or want to add new features, please follow these steps:

1. Fork the repository.

2. Make the necessary changes and commit them.

3. Push your changes to your fork.

4. Open a pull request to the main repository,

## Contributors

<a href="https://github.com/farzadafi/cinema_96/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=farzadafi/cinema_96" />
</a>