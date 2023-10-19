package com.rest;

import static io.restassured.RestAssured.given;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//given().when().get("https://reqres.in/api/users?page=2").then().log().all();
		System.out.println("-----------------");
		//given().when().get("https://reqres.in/api/users/2").then().log().all();
		//given().when().post("https://reqres.in/api/users")
		//.header("Content-Type", "application/json")
		given().log().all().header("Content-Type", "application/json")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.when()
		.post("https://reqres.in/api/users")
		.then().log().all().assertThat().statusCode(201);
	}

}
