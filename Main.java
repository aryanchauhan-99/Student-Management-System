import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Simulating the Database Connection Status Header
        System.out.println("=================================================");
        System.out.println(">>> DATABASE CONNECTION LOGS <<<");
        System.out.println("=================================================");
        System.out.println("[INFO] Loading MySQL JDBC Driver...");
        System.out.println("[INFO] Establishing Connection to Localhost:3306...");
        System.out.println("[SUCCESS] Connected to 'student_db' successfully!\n");
        
        // Data Entry Mode via Scanner Terminal
        System.out.println("=================================================");
        System.out.println(">>> STUDENT DATA ENTRY FORM <<<");
        System.out.println("=================================================");
        
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); // Consuming the leftover newline
        
        System.out.print("Enter Full Name: ");
        String studentName = sc.nextLine();
        
        System.out.print("Enter Secured Marks: ");
        double studentMarks = sc.nextDouble();
        
        // Simulating SQL Insert Operation execution
        System.out.println("\n[SQL EXECUTION] INSERT INTO students VALUES(" + rollNumber + ", '" + studentName + "', " + studentMarks + ");");
        System.out.println("[INFO] 1 Row affected. Commit operation success.\n");
        
        // Formatting and Displaying Data Layout via Console
        System.out.println("=================================================");
        System.out.println(">>> RECENT STUDENT RECORDS FROM DATABASE <<<");
        System.out.println("=================================================");
        
        // Table Header Layout formatting using Structured Dividers
        System.out.printf("%-12s | %-22s | %-10s\n", "ROLL NO", "STUDENT NAME", "MARKS");
        System.out.println("-------------------------------------------------");
        
        // Formatted structured data display row
        System.out.printf("%-12d | %-22s | %-10.2f\n", rollNumber, studentName, studentMarks);
        System.out.println("=================================================");
        
        sc.close();
    }
}
