# **Movies Review WebApp**

Movies Review WebApp is a backend-focused project built using **Spring Boot** and **MongoDB** to manage and handle movie reviews efficiently. It features API endpoints to perform CRUD operations for movie reviews.

---

## **Features**

- **Add New Reviews**: Submit reviews for different movies.
- **Retrieve Reviews**: Fetch reviews based on movie titles or other filters.
- **Update Reviews**: Edit existing reviews.
- **Delete Reviews**: Remove reviews no longer needed.
- **Testing**: APIs are tested using **Postman**.

---

## **Technologies Used**

- **Backend**: Spring Boot
- **Database**: MongoDB
- **API Testing**: Postman

---

## **Getting Started**

### **Prerequisites**

- Java Development Kit (JDK 8 or higher)
- MongoDB Server
- Maven

### **Steps to Run**

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/MandarNalhe/Movies_Review_WebApp.git
   cd Movies_Review_WebApp
   ```

2. **Setup MongoDB:**
   - Ensure MongoDB is running locally or provide the connection string in `application.properties`.

3. **Build and Run the Application:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Test APIs Using Postman:**
   - Import the provided Postman collection or test the endpoints manually.

---

## **API Endpoints**

| Method | Endpoint                 | Description               |
|--------|--------------------------|---------------------------|
| POST   | `/api/reviews`           | Add a new movie review    |
| GET    | `/api/reviews`           | Retrieve all reviews      |
| GET    | `/api/reviews/{title}`   | Retrieve reviews by title |
| PUT    | `/api/reviews/{id}`      | Update a specific review  |
| DELETE | `/api/reviews/{id}`      | Delete a specific review  |

---

## **Future Enhancements**

- Add user authentication for review submissions.
- Implement advanced search and filtering options.
- Develop a frontend for better user interaction.

---

### **Contributions**

Contributions are welcome! Feel free to fork the repository and submit a pull request with your improvements.


