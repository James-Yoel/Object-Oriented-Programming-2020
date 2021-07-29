package Tutorial;

public class PrintNameEmployeeAddedListener implements EmployeeAddedListenener{
	
	public void onEmployeeAdded(Employee employee) {
		System.out.println("Ditambahkan karyawan baru dengan posisi '"+employee.getPosition()+"' bernama '"+employee.getName()+"'");
	}
	
}
