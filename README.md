## Employee CRUD Operations - Spring Boot Application

This repository contains a Spring Boot application that implements CRUD (Create, Read, Update, Delete) operations on an Employee entity. The application provides a RESTful API for managing employee data.

### Features

- **Create**: Add a new employee to the system by providing employee details such as name, age, and department.
- **Read**: Retrieve employee information by employee ID or retrieve a list of all employees.
- **Update**: Update employee details, such as name, age, or department, based on the employee ID.
- **Delete**: Delete an employee from the system by providing the employee ID.

### Technologies Used

- **Spring Boot**: The application is built using the Spring Boot framework, which provides a powerful and flexible platform for developing Java applications.
- **Spring Data JPA**: JPA (Java Persistence API) is used for database access and object-relational mapping. Spring Data JPA simplifies the development of data access layer by providing common CRUD operations out of the box.
- **MySQL**: The application uses MySQL as the database to store employee information. You can configure the database connection details in the `application.properties` file.
- **Maven**: Maven is used as the build automation tool and for managing dependencies.

### Getting Started

To run the application locally, follow these steps:

1. Clone the repository: `git clone https://github.com/17sid/CRUD-Operations-SpringBoot.git`
2. Navigate to the project directory: `cd SpringBootMySQL`
3. Configure the database connection by updating the `application.properties` file with your MySQL credentials.
4. Build the application: `mvn clean install`
5. Run the application: `mvn spring-boot:run`

Once the application is running, you can access the API endpoints using a tool like Postman or cURL.

### API Endpoints

The following API endpoints are available:

- **GET api/employees**: Retrieve a list of all employees.
- **GET api/employees/{id}**: Retrieve employee information by employee ID.
- **POST api/employees**: Create a new employee by providing employee details in the request body.
- **PUT api/employees/{id}**: Update employee details by employee ID.
- **DELETE api/employees/{id}**: Delete an employee by employee ID.

### Contributing

Contributions to this project are welcome! If you have any ideas, suggestions, or bug fixes, feel free to open an issue or submit a pull request.


### Contact

If you have any questions or need further assistance, please feel free to contact me at [siddheshbhosale04646@gmail.com](mailto:siddheshbhosale04646@gmail.com).

Thank you for using the Employee CRUD Operations - Spring Boot Application!
