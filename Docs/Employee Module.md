## Employee Module API DOCS

>### Add Employee:-
>- **Endpoint:** http://127.0.0.1:8080/employee/saveEmployee
>- **Methord:** POST
>- **Status Code:**
> i. 	201 CREATED: On Success.
> 
> **- Request Data:**
> > ```js
> >{
> >		"firstName" : "Lakshita",
> >		"lastName" : "Mathur",
> >		"email" : "Lakshita@gmail.com",
> >		"dateOfBirth" : "2000-06-28",
> >		"u_id" : 1,
> >		"d_id" : 0
> >}
> **- Response Data:**
> > ```js
> >{
> >		"id": 38,
> >		"firstName": "Lakshita",
> >		"lastName": "Mathur",
> >		"email": "Lakshita@gmail.com",
> >		"dateOfBirth": "2000-06-28",
> >		"u_id": 1,
> >		"d_id": 0,
> >		"user": 
> >		{
> >			"id": 1,
> >			"password": "1234",
> >			"role": "SDE",
> >			"result": 55
> >		},
> >		"department": 
> >		{
> >			"departName": "IT",
> >			"departId": 0
> >		}
> >}
>

>### Get All Employee:-
>- **Endpoint:** http://127.0.0.1:8080/employee/getAllEmployee
>- **Methord:** GET
>- **Status Code:**
> i. 	200 OK: On Success.
> ii. 204 No Content : On No Data of Employee.
> 
> **- Request Data:**
>
> **- Response Data:**
> > ```js
> >[
> >		{
> >			"id": 38,
> >			"firstName": "Lakshita",
> >			"lastName": "Mathur",
> >			"email": "Lakshita@gmail.com",
> >			"dateOfBirth": "2000-06-28",
> >			"u_id": 1,
> >			"d_id": 0,
> >			"user": 
> >			{
> >				"id": 1,
> >				"password": "1234",
> >				"role": "SDE",
> >				"result": 55
> >			},
> >			"department": 
> >			{
> >				"departName": "IT",
> >				"departId": 0
> >			}
> >		},
> >		{
> >			"id": 39,
> >			"firstName": "Lakshita",
> >			"lastName": "Mathur",
> >			"email": "Lakshita@gmail.com",
> >			"dateOfBirth": "2000-06-28",
> >			"u_id": 1,
> >			"d_id": 0,
> >			"user": 
> >			{
> >				"id": 1,
> >				"password": "1234",
> >				"role": "SDE",
> >				"result": 55
> >			},
> >			"department": 
> >			{
> >				"departName": "IT",
> >				"departId": 0
> >			}
> >		}
> >]
> 
>### Update Employee:-
>- **Endpoint:** http://127.0.0.1:8080/employee/updateEmployeeById/{id}
>- **Methord:** POST
>- **Status Code:**
> i. 	200 OK: On Success.
> 
> **- Request Data:**
> > ```js
> >{
> >		"firstName" : "Huajkbkhsbkabk",
> >		"lastName" : "Mathur",
> >		"email" : "Lakshita@gmail.com",
> >		"dateOfBirth" : "2000-06-28",
> >		"u_id" : 1,
> >		"d_id" : 0
> >}
> **- Response Data:**
> > ```js
> >{
> >		"id": 38,
> >		"firstName": "Huajkbkhsbkabk",
> >		"lastName": "Mathur",
> >		"email": "Lakshita@gmail.com",
> >		"dateOfBirth": "2000-06-28",
> >		"u_id": 1,
> >		"d_id": 0,
> >		"user": 
> >		{
> >			"id": 1,
> >			"password": "1234",
> >			"role": "SDE",
> >			"result": 55
> >		},
> >		"department": 
> >		{
> >			"departName": "IT",
> >			"departId": 0
> >		}
> >}
>

>### Delete Employee:-
>- **Endpoint:** http://127.0.0.1:8080/employee/updateEmployeeById/{id}
>- **Methord:** DELETE
>- **Status Code:**
> i. 	202 Accepted: On Success.
> ii 400 Bad Request: On no data of id provided
> 
> **- Request Data:**
> **- Response Data:**


>### Get Employee By Pagination:-
>- **Endpoint:** http://127.0.0.1:8080/employee/getAllEmployee
>- **Methord:** GET
>- **Status Code:**
> i. 	200 OK: On Success.
> ii. 204 No Content : On No Data of Employee.
> 
> **- Request Data:**
>
> **- Response Data:**
> > ```js
> >[
> >		{
> >			"id": 38,
> >			"firstName": "Lakshita",
> >			"lastName": "Mathur",
> >			"email": "Lakshita@gmail.com",
> >			"dateOfBirth": "2000-06-28",
> >			"u_id": 1,
> >			"d_id": 0,
> >			"user": 
> >			{
> >				"id": 1,
> >				"password": "1234",
> >				"role": "SDE",
> >				"result": 55
> >			},
> >			"department": 
> >			{
> >				"departName": "IT",
> >				"departId": 0
> >			}
> >		},
> >		{
> >			"id": 39,
> >			"firstName": "Lakshita",
> >			"lastName": "Mathur",
> >			"email": "Lakshita@gmail.com",
> >			"dateOfBirth": "2000-06-28",
> >			"u_id": 1,
> >			"d_id": 0,
> >			"user": 
> >			{
> >				"id": 1,
> >				"password": "1234",
> >				"role": "SDE",
> >				"result": 55
> >			},
> >			"department": 
> >			{
> >				"departName": "IT",
> >				"departId": 0
> >			}
> >		}
> >]
> 
