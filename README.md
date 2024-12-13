# book_management_backend
Book Management System - Backend

This is the backend of the Book Management System, built using Spring Boot. The backend provides RESTful APIs for managing books and reviews. It uses MongoDB as the database.
Features

    CRUD operations for books
    MongoDB database integration
    RESTful API endpoints
    Deployed for public access

Getting Started
Prerequisites

Ensure you have the following installed:

    Java 17 or higher
    Maven 3.6 or higher
    MongoDB (local or Atlas for cloud)

Setup and Installation

    Clone the Repository:

git clone https://github.com/your-username/book-management-backend.git
cd book-management-backend

Configure the MongoDB Connection:

Update the application.properties file in the src/main/resources directory:

spring.application.name=BookManagementApp
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster>.mongodb.net/<database>?retryWrites=true&w=majority

Replace <username>, <password>, <cluster>, and <database> with your MongoDB Atlas credentials or local MongoDB configuration.

Build the Project:

./mvnw clean package

Run the Application:

    java -jar target/BookManagementApp-0.0.1-SNAPSHOT.jar

    The backend will start on http://localhost:8080.

Deployment
Deploying to Railway

    Create a New Project:
        Log in to Railway.app and create a new project.
        Deploy the backend repository.

    Add MongoDB Plugin:
        Add the MongoDB plugin to your Railway project or use your existing MongoDB Atlas connection string.

    Set Environment Variables:
        Set spring.data.mongodb.uri as an environment variable in Railway with the MongoDB connection string.

    Deploy:
        Push your code to Railway, and it will handle the deployment.

API Endpoints
Base URL

http://localhost:8080/api/v1

Replace http://localhost:8080 with your deployed backend's URL.
Endpoints
Method	Endpoint	Description
GET	/books	Get all books
GET	/books/{id}	Get a book by ID
POST	/books	Add a new book
PUT	/books/{id}	Update a book
DELETE	/books/{id}	Delete a book
Database Configuration
MongoDB Atlas Setup

    Sign up at MongoDB Atlas.
    
    Use the connection string provided in the Atlas dashboard.

Example MongoDB Connection String

"mongodb+srv://username:password@cluster.mongodb.net/database?retryWrites=true&w=majority"

Folder Structure

src/
├── main/
│   ├── java/com/book/       # Java code (controllers, services, repositories)
│   ├── resources/           # Configuration and properties files
│   └── application.properties
└── test/                    # Test cases

Technologies Used

    Spring Boot: Java framework for building the backend
    MongoDB: NoSQL database
    Maven: Build tool
    Railway: Deployment platform

Contributing

    Fork the repository.
    Create a feature branch: git checkout -b feature-name.
    Commit your changes: git commit -m 'Add some feature'.
    Push to the branch: git push origin feature-name.
    Submit a pull request.

Contact

For questions or feedback, reach out to:

    Name: Ribin Raju
    Email:ribinraju2000@gmail.com
