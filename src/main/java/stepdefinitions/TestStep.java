package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;

public class TestStep {
	
	@Given("I'm an existing customer of xyz company")
	public void i_m_an_existing_customer_of_xyz_company(io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
		 for (Map<String, String> user : users) {
	            String name = user.get("username");
	            String password = user.get("password");
	            System.out.println(name);
	            System.out.println(password);

	        }
	}

}
