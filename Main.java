import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=================================================");
        System.out.println(">>> STUDENT DATA ENTRY FORM <<<");
        System.out.println("=================================================");
        
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter Full Name: ");
        String studentName = sc.nextLine();
        
        System.out.print("Enter Secured Marks: ");
        double studentMarks = sc.nextDouble();
        
        System.out.println("\n[INFO] Data processed successfully.\n");
        
        System.out.println("=================================================");
        System.out.println(">>> RECENT STUDENT RECORDS <<<");
        System.out.println("=================================================");
        
        System.out.printf("%-12s | %-22s | %-10s\n", "ROLL NO", "STUDENT NAME", "MARKS");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-12d | %-22s | %-10.2f\n", rollNumber, studentName, studentMarks);
        System.out.println("=================================================");
        
        sc.close();
    }
}
