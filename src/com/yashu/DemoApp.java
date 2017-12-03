package com.yashu;

import com.google.gson.Gson;
import com.yashu.model.Address;
import com.yashu.model.Company;
import com.yashu.model.Employee;

public class DemoApp {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId("1");
		emp.setEmpName("Yashashwini");
		emp.setDesignation("Manager");
		
		Address address = new Address();
		address.setHouseNo("123");
		address.setPincode("516115");
		emp.setAddress(address);
		
		Gson gson = new Gson();
		String empJson = gson.toJson(emp);
		System.out.println("employee json :"+empJson);
		
		String jsonString = "[\n" + 
				"  {\n" + 
				"    \"empName\": \"Yashashwini\",\n" + 
				"    \"empId\": \"1\",\n" + 
				"    \"designation\": \"Manager\",\n" + 
				"    \"address\": {\n" + 
				"      \"houseNo\": \"123\",\n" + 
				"      \"pincode\": \"516115\",\n" + 
				"      \"state\": \"Telangana\"\n" + 
				"    }\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"empName\": \"Sangeetha\",\n" + 
				"    \"empId\": \"2\",\n" + 
				"    \"designation\": \"Admin\",\n" + 
				"    \"address\": {\n" + 
				"      \"houseNo\": \"897\",\n" + 
				"      \"pincode\": \"500098\",\n" + 
				"      \"state\": \"Maharasta\"\n" + 
				"    }\n" + 
				"  }\n" + 
				"]";
		
		Employee[] empObj = gson.fromJson(jsonString, Employee[].class);
		for (Employee employee : empObj) {
			System.out.println("emp name ::::"+ employee.getEmpName());
			System.out.println("designation ::::"+ employee.getDesignation());

		}

		empJson = gson.toJson(empObj);
		System.out.println("employee json :"+empJson);
	}

}
