📚 Library Manager CLI – Java Mini Project
⚙️ A simple console-based Library Manager written entirely from scratch in Java, using Maps, Streams, and clean separation of logic.

✏ Description
This is a basic library management system built as a CLI (Command Line Interface) application.
It lets you:
📥 Add books (with auto-incrementing IDs)
🗑 Delete books by name
📋 Display all books
✏ (Optionally) update book names by ID
All core logic is separated into manager classes, keeping the code modular and easier to maintain.
🧩 Project Structure
bash
Copy
Edit
.
├── Book.java             # Data model (Book ID, name, etc.)
├── bookmanager.java      # Logic layer: add, delete, display books
└── librarymanager.java   # CLI layer: menu & user interaction
🛠 Features
✅ Auto-incrementing unique book IDs
✅ Delete by name (case-insensitive)
✅ Display all books in the library
✅ Modular design (menu in librarymanager, logic in bookmanager)
✅ Simple Java Streams & Maps for data handling

🚀 Technologies & Concepts Used
Java Collections (Map, Set)

Java Streams & lambda expressions

CLI with Scanner

Separation of concerns (UI vs logic)

Auto-increment counters

📦 How to Run
Clone or download this repository

Open in any Java IDE (VS Code / IntelliJ / Eclipse)
Compile all .java files
bash
javac *.java
Run the main class:
bash
java librarymanager

✏ Future Enhancements
✅ Update book details by ID
✅ Search books by name or ID
✅ Sort books by ID or name before displaying
✅ Persist data to a file or database

🙌 Author
Built completely from scratch by ME – as a self-written practice project to learn Java collections, streams, and CLI design.

⭐ Why this project matters
I didn’t copy-paste; every line was written by me to deeply understand:
How to design simple CRUD logic
How to use Java streams for filtering
How to separate menu/UI from business logic
If you’re learning Java, building something from scratch like this teaches way more than following a tutorial.
