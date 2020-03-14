package StepDefination.RestAPI;

import PageFactory.Pojo;
import cucumber.api.java.en.Given;

public class RestApiStepdDefination {

		private String testData;
		private Pojo objPojo;
		public RestApiStepdDefination(Pojo Pojo){
			objPojo=Pojo;
		}
		@Given("I am requesting {string}")
		public void i_am_requesting(String Url){
			
		}
		
		
		
	}


