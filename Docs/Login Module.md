## Authentication Module API DOCS

>### Add User:-
>- **Endpoint:** http://127.0.0.1:8080/authentication/addUser
>- **Methord:** POST
>- **Status Code:**
> i. 	201 CREATED: On Success.
> **- Request Data:**
> > ```js
> >{
> >		"userName":"hunter76",
> >		"password":1234,
> >		"role":"Mangment",
> >		"result":20
> >}
> **- Response Data:**
> > ```js
> >{
> >		"id": 43,
> >		"userName": "hunter76",
> >		"password": "1234",
> >		"role": "Mangment",
> >		"result": 20
> >}
>
>
>###  User LogIn:-
>- **Endpoint:** http://127.0.0.1:8080/authentication/login
>- **Methord:** POST
>- **Status Code:**
> i. 	201 CREATED: On Success.
> **- Request Data:**
> > ```js
> >{
> >		"userName":"hunter76",
> >		"password":1234,
> >}
> **- Response Data:**
> > ```js
> >{
> >		"id": 43,
> >		"userName": "hunter76",
> >		"password": "1234",
> >		"role": "Mangment",
> >		"result": 20
> >}
>
>
>###  User LogOut:-
>- **Endpoint:** http://127.0.0.1:8080/authentication/logout
>- **Methord:** GET
>- **Status Code:**
> i. 	201 CREATED: If User logged in and try to logOut.
> ii. 400 BAD REQUEST: If User not Logged in.



>###  Get All Users:-
>- **Endpoint:** http://127.0.0.1:8080/authentication/getAllUsers
>- **Methord:** GET
>- **Status Code:**
> i. 	201 CREATED: On Success.
> **- Request Data:**
>	
> **- Response Data:**
> > ```js
> >[
> >		{
> >			"id": 1,
> >			"userName": "Ramesh",
> >			"password": "1234",
> >			"role": "SDE",
> >			"result": 55
> >		},
> >		{
> >			"id": 41,
> >			"userName": "hunter56",
> >			"password": "1234",
> >			"role": "Mangment",
> >			"result": 20
> >		},
> >		{
> >			"id": 42,
> >			"userName": "hunter56",
> >			"password": "1234",
> >			"role": "Mangment",
> >			"result": 20
> >		},
> >		{
> >			"id": 43,
> >			"userName": "hunter76",
> >			"password": "1234",
> >			"role": "Mangment",
> >			"result": 20
> >		}
> >]
> 
>###  Get User By Id:-
>- **Endpoint:** http://127.0.0.1:8080/authentication/getUserById/{id}
>- **Methord:** GET
>- **Status Code:**
> i. 	201 CREATED: On Success.
> ii. 400 BAD REQUEST: If user not avilable.
> **- Request Data:**
>
> **- Response Data:**
> > ```js
> >{
> >		"id": 43,
> >		"userName": "hunter76",
> >		"password": "1234",
> >		"role": "Mangment",
> >		"result": 20
> >}


>###  Delete User By Id:-
>- **Endpoint:** http://127.0.0.1:8080/authentication/removeUser/{id}
>- **Methord:** DELETE
>- **Status Code:**
> i. 	201 CREATED: On Success.
> ii. 400 BAD REQUEST: If user not avilable.
> **- Request Data:**
>
> **- Response Data:**
> > ```js
> >{
> >		"id": 41,
> >		"userName": "Hukdsjjb",
> >		"password": "1234",
> >		"role": "Mangment",
> >		"result": 20
> >}