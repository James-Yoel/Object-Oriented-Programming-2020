package Tutorial;

public class CountingEmployeeAddedListener implements EmployeeAddedListenener{
	
	private static int employeesAddedCount = 0;
	
	public void onEmployeeAdded (Employee employee) {
		employeesAddedCount++;
		
		System.out.println("Total Karyawan : " +employeesAddedCount);
	}
	
}
