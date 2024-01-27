package com.array.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Implementation {

	public List<Employee> getEmployeeList() {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(11, "Rahul", "pune"));
		list.add(new Employee(21, "Ram", "mumbai"));
		return list;
	}

	public static void main(String[] args) {
		ArrayList<Employee> arr = new ArrayList<Employee>();

		arr.add(new Employee(20, "Ganesh", "2500"));
		arr.add(new Employee(20, "Ganesh", "2500"));
		
		
		Implementation impl = new Implementation();
		System.out.println(impl.getEmployeeList());
		

		for (Employee emp : arr) {
			// System.out.println(emp);
		}

		Iterator<Employee> itr = arr.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());

		}

	}

}
