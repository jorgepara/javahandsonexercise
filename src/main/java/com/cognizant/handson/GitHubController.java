package com.cognizant.handson;

import org.springframework.http.ResponseEntity;

/*
	TODO: Add annotation to create a Rest Controller from this class
*/
public class GitHubController {

	/*
		TODO: Inject GitHubService spring bean service into the GitHubController class through spring annotation.
	 */
	private GitHubService gitHubService;


	/*
		1 - REST GET API: http://localhost:8080/users

		Example: http://localhost:8080/users

		Example result:
			[{"id":"1","login":"mojombo","type":"User","url":"https://api.github.com/users/mojombo"},{"id":"2","login":"defunkt","type":"User","url":"https://api.github.com/users/defunkt"}, ... ]

		TODO: Add REST method annotation to support path "/users"

	*/
	public ResponseEntity<UserDto[]> getUsers()
	{
		// 	TODO: You should use one GitHubService method.
		return null;
	}


	/*
		2 - REST GET API: http://localhost:8080/users/url

		Example: http://localhost:8080/users/url

		Example result:
			https://api.github.com/users/mojombo,https://api.github.com/users/defunkt,https://api.github.com/users/pjhyett, ...

		TODO: Add REST GET method annotation to support path "/users/url"
	*/
	public String getUsersUrlProperty()
	{
		// 	TODO: You should use one GitHubService method.
		return null;
	}



	/*
		3 - REST GET API: http://localhost:8080/users/:login

		Example: http://localhost:8080/users/kevinclark

		Example result:
			{"id":"20","login":"kevinclark","type":"User","url":"https://api.github.com/users/kevinclark"}

		TODO: Add REST method annotation to support path "/users/:login" and get the path variable :login into the String login var.
	*/
	public ResponseEntity<UserDto> getUserByLogin(String login) {

		// 	TODO: You should use one GitHubService method.
		return null;

	}



	/*
		4 - REST GET API: http://localhost:8080/users/:login/search

		Example: http://localhost:8080/users/kevinclark/search

		Example result:
			{"id":"20","login":"kevinclark","type":"User","url":"https://api.github.com/users/kevinclark"}

		TODO: Add REST method annotation to support path "/users/:login/search" and get the path variable :login into the String login var.
	*/
	public ResponseEntity<UserDto> findUserByLoginUser(String login) {

		// 	TODO: You should use one GitHubService method.
		return null;

	}

}
