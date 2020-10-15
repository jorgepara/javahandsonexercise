# hands-on incompleted exercise

First you have to download the hands-on Gradle project and start the **Spring Boot Application** with the web server listening at localhost:8080.

Second exercise you must complete the REST **HandsOnController** class.  
Read the TODO comments and follow the instructions.

Third exercise you must complete the REST **GitHubController** class and **GitHubService** class.
Read the TODO comments and follow the instructions.

To complete the GitHub exercise you'll need to call the following GitHub REST API Url:

 1 - URL GET Method - List Users: https://api.github.com/users
 
    Return an array of GitHub users (aprox. 30) with the following JSON format:
     
     [
       {
         "login": "rsl",
         "id": 92,
         "node_id": "MDQ6VXNlcjky",
         "avatar_url": "https://avatars0.githubusercontent.com/u/92?v=4",
         "gravatar_id": "",
         "url": "https://api.github.com/users/rsl",
         "html_url": "https://github.com/rsl",
         "followers_url": "https://api.github.com/users/rsl/followers",
         "following_url": "https://api.github.com/users/rsl/following{/other_user}",
         "gists_url": "https://api.github.com/users/rsl/gists{/gist_id}",
         "starred_url": "https://api.github.com/users/rsl/starred{/owner}{/repo}",
         "subscriptions_url": "https://api.github.com/users/rsl/subscriptions",
         "organizations_url": "https://api.github.com/users/rsl/orgs",
         "repos_url": "https://api.github.com/users/rsl/repos",
         "events_url": "https://api.github.com/users/rsl/events{/privacy}",
         "received_events_url": "https://api.github.com/users/rsl/received_events",
         "type": "User",
         "site_admin": false
       },
       {
         "login": "imownbey",
         "id": 93,
         "node_id": "MDQ6VXNlcjkz",
         "avatar_url": "https://avatars0.githubusercontent.com/u/93?v=4",
         "gravatar_id": "",
         "url": "https://api.github.com/users/imownbey",
         "html_url": "https://github.com/imownbey",
         "followers_url": "https://api.github.com/users/imownbey/followers",
         "following_url": "https://api.github.com/users/imownbey/following{/other_user}",
         "gists_url": "https://api.github.com/users/imownbey/gists{/gist_id}",
         "starred_url": "https://api.github.com/users/imownbey/starred{/owner}{/repo}",
         "subscriptions_url": "https://api.github.com/users/imownbey/subscriptions",
         "organizations_url": "https://api.github.com/users/imownbey/orgs",
         "repos_url": "https://api.github.com/users/imownbey/repos",
         "events_url": "https://api.github.com/users/imownbey/events{/privacy}",
         "received_events_url": "https://api.github.com/users/imownbey/received_events",
         "type": "User",
         "site_admin": false
       },
       ...
     ] 
 
 2 - URL GET Method - User Information: https://api.github.com/users/:login
  
     Return an JSON object with GitHub user ":login" data information.
     
    Example:    https://api.github.com/users/imownbey  
    
    {
      "login": "imownbey",
      "id": 93,
      "node_id": "MDQ6VXNlcjkz",
      "avatar_url": "https://avatars0.githubusercontent.com/u/93?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/imownbey",
      "html_url": "https://github.com/imownbey",
      "followers_url": "https://api.github.com/users/imownbey/followers",
      "following_url": "https://api.github.com/users/imownbey/following{/other_user}",
      "gists_url": "https://api.github.com/users/imownbey/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/imownbey/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/imownbey/subscriptions",
      "organizations_url": "https://api.github.com/users/imownbey/orgs",
      "repos_url": "https://api.github.com/users/imownbey/repos",
      "events_url": "https://api.github.com/users/imownbey/events{/privacy}",
      "received_events_url": "https://api.github.com/users/imownbey/received_events",
      "type": "User",
      "site_admin": false,
      "name": "Ian Ownbey",
      "company": null,
      "blog": "http://twitter.com/iano",
      "location": "San Francisco, CA",
      "email": null,
      "hireable": null,
      "bio": null,
      "twitter_username": null,
      "public_repos": 53,
      "public_gists": 44,
      "followers": 63,
      "following": 66,
      "created_at": "2008-01-29T23:13:44Z",
      "updated_at": "2020-06-24T19:02:36Z"
    } 
    
Thank you very much.

Cognizant
