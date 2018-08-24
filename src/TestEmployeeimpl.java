import com.pojo.Employee;


public class TestEmployeeimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeIOimpl ei = new EmployeeIOimpl();
		Employee emp=ei.readEmployee();
		ei.writeEmployee(emp);

	}

}
