import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    private static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {

        initializeEmployees();
        displayEmployees();

        addEmployee();
        displayEmployees();

        removeEmployee();
        displayEmployees();
    }
    private static void initializeEmployees() {
        for (int i = 1; i <= 10; i++) {
            employees.add(new Employee(i, "Nhân viên " + i, 20 + i, "Phòng " + i, "TLU-HTTT02-" + i, 1000 + i * 100));
        }
    }

    private static void displayEmployees() {
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin cho nhân viên mới:");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tên: ");
        String name = scanner.nextLine();

        System.out.print("Tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Phòng ban: ");
        String department = scanner.nextLine();

        System.out.print("Mã nhân viên: ");
        String code = scanner.nextLine();

        System.out.print("Tỉ lệ lương: ");
        double salaryRate = scanner.nextDouble();

        employees.add(new Employee(id, name, age, department, code, salaryRate));
        System.out.println("Nhân viên mới đã được thêm vào danh sách.");
    }

    private static void removeEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID của nhân viên muốn xóa: ");
        int id = scanner.nextInt();

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Nhân viên có ID " + id + " đã được xóa.");
                return;
            }
        }

        System.out.println("Không tìm thấy nhân viên có ID " + id);
    }
}
