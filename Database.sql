-- Create a new database for student management
CREATE DATABASE student_db;

-- Use the created database
USE student_db;

-- Create students table with appropriate data types
CREATE TABLE students (
    roll_no INT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    marks DECIMAL(5,2)
);

-- Example query to insert data into the table
INSERT INTO students (roll_no, student_name, marks) 
VALUES (1, 'Sample Student', 85.50);

-- Query to view recent student records
SELECT * FROM students;
