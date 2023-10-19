package com.rest;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class GoRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  //given().contentType(ContentType.JSON)
		  //.get("https://gorest.co.in/public/v2/users/5157306") .then().log().all();
		 
		
		
			/*
			 * given().contentType(ContentType.JSON) .header(
			 * "Authorization","Bearer b4660193e4f176d53e5c6015b2462869d823e7135737332338f4f43f41ee8bbf"
			 * ) .body("{\r\n" + "    \"id\": 628042,\r\n" + "    \"name\": \"MK\",\r\n" +
			 * "    \"email\": \"mk@toy.name\",\r\n" + "    \"gender\": \"male\",\r\n" +
			 * "    \"status\": \"inactive\"\r\n" + "}")
			 * .post("https://gorest.co.in/public/v2/users") .then().log().all();
			 */
		 
		 given().contentType(ContentType.JSON)
		 .header("Authorization","Bearer b4660193e4f176d53e5c6015b2462869d823e7135737332338f4f43f41ee8bbf")
		 .body("{\r\n" + "    \"id\": 628042,\r\n" + "    \"name\": \"MK\",\r\n" +
				 "    \"email\": \"mk@toy.name\",\r\n" + "    \"gender\": \"male\",\r\n" +
				 "    \"status\": \"inactive\"\r\n" + "}")
		 .delete("https://gorest.co.in/public/v2/users/6280[42")
		 .then().log().all();
		
	}

}
