package com.cognizant.handson;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;


/*
    TODO: Add spring annotation to create spring bean service
 */
public class GitHubService {

	private final RestTemplate restTemplate;

	public GitHubService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}


	public UserDto[] getUsers() {

		System.out.println("Getting github users" );

		String urlGitHub = "https://api.github.com/users";

		UserDto[] result = null;

		/*
			TODO: Use restTemplate method to get a lists of users from GitHub api transformed into UserDto[].
		 */

		return result;
	}



	public String getUsersUrlProperty() {

		System.out.println("Getting github users and extract url property" );

		UserDto[] users = getUsers();

		String result = null;

		/*
			TODO: Through Java1.8 streams, iterate the github users, extract all the UserDto url property
			 and return a string with all the url values concatenated with "," as a separator

			 Expected Result: "url1,url2,url3, ... "
		 */

		return result;
	}



	public UserDto getUserByLogin(String login) {

		System.out.println("Getting user " + login);

		String urlGitHub = String.format("https://api.github.com/users/%s", login);


		UserDto result = null;

		/*
			TODO: Use restTemplate method to get a user from GitHub api transformed into UserDto.
		 */

		return result;
	}



	public UserDto searchUserByLogin(String loginUser) {

		System.out.println("Looking up user for login:" + loginUser);

		UserDto[] users = getUsers();

		UserDto user = null;

		/*
			TODO: Through Java1.8 streams, iterate the github users, find and extract the UserDto that is equal to loginUser
		*/

		System.out.println("User found: " + user);

		return user;

	}

}
