package Tutorial;

import java.util.ArrayList;
import java.util.List;

public class Office {
	
	private List<Employee> employees = new ArrayList<>();
	private List<EmployeeAddedListenener> listeners = new ArrayList<>();
	
	public void addEmployee (Employee employee) {
		this.employees.add(employee);
		this.notifyEmployeeAddedListeners(employee);
	}
	
	public void registerEmployeeAddedListener(EmployeeAddedListenener listener) {
		this.listeners.add(listener);
	}
	
	public void unregisterEmployeeAddedListener(EmployeeAddedListenener listener) {
		this.listeners.remove(listener);
	}
	protected void notifyEmployeeAddedListeners(Employee employee) {
		//Memberitahu Setiap Listener dalam Daftar Listener
		this.listeners.forEach(listener -> listener.onEmployeeAdded(employee));
	}
	
}
