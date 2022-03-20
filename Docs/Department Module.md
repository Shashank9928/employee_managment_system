## Department Module API DOCS

>### Add Department:-
>- **Endpoint:** http://127.0.0.1:8080/departmentController/addDepartment
>- **Methord:** POST
>- **Status Code:**
> i. 	201 CREATED: On Success.
> 
> **- Request Data:**
> > ```js
> >{
> >		"departName": "Management"
> >}
> **- Response Data:**
> > ```js
> >{
> >		"departId": 22,
> >		"departName": "Management"
> >}
>
>### Get All Department:-
>- **Endpoint:** http://127.0.0.1:8080/departmentController/getAllDepartment
>- **Methord:** GET
>- **Status Code:**
> i. 	201 CREATED: On Success.
> ii 204 No Content: When No data present. 
> 
> **- Request Data:**
>
> **- Response Data:**
> > ```js
> >[
> >		{
> >			"departId": 0,
> >			"departName": "IT"
> >		},
> >		{
> >			"departId": 1,
> >			"departName": "FINENCE"
> >		},
> >		{
> >			"departId": 21,
> >			"departName": null
> >		}
> >]
>


>### Get All Department By Pagination:-
>- **Endpoint:** http://127.0.0.1:8080/departmentController/getAllDepartmentByPagination/{maxPage}
>- **Methord:** GET
>- **Status Code:**
> i. 	201 CREATED: On Success.
> ii 204 No Content: When No data present. 
> 
> **- Request Data:**
>
> **- Response Data:**
> > ```js
> >[
> >		{
> >			"departId": 0,
> >			"departName": "IT"
> >		},
> >		{
> >			"departId": 1,
> >			"departName": "FINENCE"
> >		},
> >		{
> >			"departId": 21,
> >			"departName": null
> >		}
> >]
>

>### Get All Department Count:-
>- **Endpoint:** http://127.0.0.1:8080/departmentController/getCount
>- **Methord:** GET
>- **Status Code:**
> i. 	201 CREATED: On Success.
> ii 204 No Content: When No data present. 
> 
> **- Request Data:**
>
> **- Response Data:**
> > ```js
> >	3
>

>### Delete Department:-
>- **Endpoint:** http://127.0.0.1:8080/departmentController/deleteDepartment/{departId}
>- **Methord:** GET
>- **Status Code:**
> i. 	202 Accepted: On Success.
> ii 204 No Content: When No data present. 
> 
> **- Request Data:**
>
> **- Response Data:**
>

