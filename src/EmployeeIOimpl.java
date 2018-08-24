import com.pojo.Employee;

public class EmployeeIOimpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		Employee e=new Employee(123,1200d,22,"sherin");
		return e;
	}

	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println(employee);

	}

}
