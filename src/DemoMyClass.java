import com.pojo.Employee;
import com.myabastract.Shape;
public class DemoMyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeIO empIO= new EmployeeIO() {
			
			@Override
			public void writeEmployee(Employee employee) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Employee readEmployee() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		empIO.writeEmployee(empIO.readEmployee());
		
	
		Shape s= new Shape() {
			
			@Override
			public double area() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
