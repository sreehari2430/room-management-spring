# Room Management System (Spring Boot)

A simple **Room Management System** built with **Spring Boot**, demonstrating the use of:

- **Interfaces & Polymorphism**
- **In-memory storage** using `HashMap`
- **RESTful API** for adding, removing, booking, and viewing rooms
- Clean modular architecture with **Controller → Service → Model**

---

## 📁 Project Structure
room-management/
├─ src/main/java/com/example/roommanagement/
│ ├─ RoomManagementApplication.java
│ ├─ controller/
│ │ └─ RoomController.java
│ ├─ model/
│ │ └─ Room.java
│ ├─ service/
│ │ ├─ RoomService.java
│ │ └─ RoomServiceImpl.java
└─ src/main/resources/
└─ application.properties


---

## ⚙️ Features

1. **Add Room** – Add a new room with a unique room number.  
2. **Remove Room** – Remove an existing room.  
3. **Book Room** – Book a room if it is available.  
4. **View All Rooms** – List all rooms with booking status.  
5. **Polymorphic Design** – Controller interacts with `RoomService` interface; implementation can be changed easily.  

---

## 🚀 Getting Started

### Prerequisites

- Java 17+  
- Maven 3+  
- Git (optional, for version control)

### Run the Application

Clone the repository:

```bash
git clone https://github.com/yourusername/room-management-spring.git
cd room-management-spring

Build and run:

mvn spring-boot:run

The application will start on http://localhost:8080

🛠️ API Endpoints
Method	URL	Description
POST	/rooms/add/{roomNumber}	Add a new room
DELETE	/rooms/remove/{roomNumber}	Remove a room
POST	/rooms/book/{roomNumber}	Book a room
GET	/rooms/all	List all rooms

Example Usage
# Add room 101
curl -X POST http://localhost:8080/rooms/add/101

# Book room 101
curl -X POST http://localhost:8080/rooms/book/101

# Remove room 101
curl -X DELETE http://localhost:8080/rooms/remove/101

# Get all rooms
curl http://localhost:8080/rooms/all

🔧 Extensibility

Alternative Storage: Can implement RoomService with ArrayList or connect to a database.

Room Types: Add room categories (Single, Double, Suite).

Booking History: Track user bookings.

Spring Profiles: Switch implementations dynamically using @Primary or @Qualifier.

💡 Concepts Demonstrated

Interface + Implementation → RoomService + RoomServiceImpl

Polymorphism → Controller only uses interface reference

In-memory storage → HashMap<Integer, Room>

Spring Boot REST API → Easy testing via Postman or curl

📝 Author

Your Name : A


---

I can also make a **fancier version** with:

- UML diagram of **Controller → Service → Model flow**
- Sample screenshots or curl commands
- Git badges for **build, Java version, license**  

Do you want me to make that enhanced version too?