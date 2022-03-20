## Regulation-Legislation  Module API DOCS

>### Add Compliance:-
>- **Endpoint:** http://127.0.0.1:8080/compliance/addCompliance
>- **Methord:** POST
>- **Status Code:**
> i. 	201 CREATED: On Success.
> **- Request Data:**
> >
> > ```js
> >{
>>	"complianceType":"Hardware",
>> 	"complianceDescription":"BUILT OF SPRING BROKE",
>>  	"employeeCount":9,
>> 	"stsCount":6,
>> 	"complianceStatus":"Completed",
>>  	"d_id":1,
>>	"u_id":1 
>>}
>
>
>### Get All Compliance:-
>- **Endpoint:** http://127.0.0.1:8080/compliance/getAllCompliance
>- **Methord:** GET
>- **Status Code:**
> i. 	201 CREATED: On Success.
> ii. 204 No Content: No Data.
> 
> **- Request Data:**
> >
>  **-Response Data**
> > ```js
> >[
> >		{
> >			"complianceId": 5,
> >			"complianceType": "Hardware",
> >			"complianceDescription": "BUILT OF SPRING BROKE",
> >			"complianceDate": "2022-03-17",
> >			"employeeCount": 9,
> >			"stsCount": 6,
> >			"complianceStatus": "Completed",
> >			"d_id": 1,
> >			"u_id": 0,
> >			"department": 
> >			{
> >				"id": 1,
> >				"name": "FINENCE"
> >			},
> >			"user": null
> >		},
> >		{
> >			"complianceId": 6,
> >			"complianceType": "Hardware",
> >			"complianceDescription": "BUILT OF SPRING BROKE",
> >			"complianceDate": "2022-03-17",
> >			"employeeCount": 9,
> >			"stsCount": 6,
> >			"complianceStatus": "Completed",
> >			"d_id": 1,
> >			"u_id": 0,
> >			"department": 
> >			{
> >				"id": 1,
> >				"name": "FINENCE"
> >			},
> >			"user": null
> >		},
> >		{
> >			"complianceId": 7,
> >			"complianceType": "Hardware",
> >			"complianceDescription": "BUILT OF SPRING BROKE",
> >			"complianceDate": "2022-03-17",
> >			"employeeCount": 9,
> >			"stsCount": 6,
> >			"complianceStatus": "Completed",
> >			"d_id": 1,
> >			"u_id": 0,
> >			"department": 
> >			{
> >				"id": 1,
> >				"name": "FINENCE"
> >			},
> >			"user": null
> >		},
> >		{
> >			"complianceId": 8,
> >			"complianceType": "Hardware",
> >			"complianceDescription": "BUILT OF SPRING BROKE",
> >			"complianceDate": "2022-03-17",
> >			"employeeCount": 9,
> >			"stsCount": 6,
> >			"complianceStatus": "Completed",
> >			"d_id": 1,
> >			"u_id": 1,
> >			"department": 
> >			{
> >				"id": 1,
> >				"name": "FINENCE"
> >			},
> >			"user": 
> >			{
> >				"id": 1,
> >				"password": "1234",
> >				"role": "SDE",
> >				"result": 55
> >			}
> >		}
> >]



>### Get Complience By ID
>- **Endpoint:** http://127.0.0.1:8080/compliance/getComplianceByUserId/{User_Id}
>- **Methord:** GET
>- **Status Code:**
> i. 	201 CREATED: On Success.
> ii. 404 Not Found : If no data of User Id
> 
> **- Request Data:**
> >
>  **-Response Data**
> > ```js
> >[
> >		{
> >			"complianceId": 8,
> >			"complianceType": "Hardware",
> >			"complianceDescription": "BUILT OF SPRING BROKE",
> >			"complianceDate": "2022-03-17",
> >			"employeeCount": 9,
> >			"stsCount": 6,
> >			"complianceStatus": "Completed",
> >			"d_id": 1,
> >			"u_id": 1,
> >			"department": 
> >			{
> >				"id": 1,
> >				"name": "FINENCE"
> >			},
> >			"user":
> >			{
> >				"id": 1,
> >				"password": "1234",
> >				"role": "SDE",
> >				"result": 55
> >			}
> >		},
> >]
>

>### ADD Status Report
>- **Endpoint:** http://127.0.0.1:8080/statusReport/addStatusReport
>- **Methord:** POST
>- **Status Code:**
> i. 	201 CREATED: On Success.
>
> - **Request Data:**
> >```js
> >{
> >		"comments":"comments",
> >		"details":"First Status Report",
> >		"d_id":1,
> >		"u_id":1,
> >		"c_id":6
> >}
> >
> - **Response Data:**
> > ```js
> >{
> >		"statusReportId": 14,
> >		"comments": "comments",
> >		"details": "First Status Report",
> >		"createdDate": "2022-03-17",
> >		"u_id": 0,
> >		"d_id": 0,
> >		"c_id": 0,
> >		"user": 
> >		{
> >			"id": 1,
> >			"password": "1234",
> >			"role": "SDE",
> >			"result": 55
> >		},
> >		"department": 
> >		{
> >			"id": 1,
> >			"name": "FINENCE"
> >		},
> >		"compliance": 
> >		{
> >			"complianceId": 6,
> >			"complianceType": "Hardware",
> >			"complianceDescription": "BUILT OF SPRING BROKE",
> >			"complianceDate": "2022-03-17",
> >			"employeeCount": 9,
> >			"stsCount": 6,
> >			"complianceStatus": "Completed",
> >			"d_id": 1,
> >			"u_id": 0,
> >			"department": 
>> 		{
> >					"id": 1,
> >					"name": "FINENCE"
> >			},
> >			"user": null
> >		}
> >}
>

>### Get All Status Report
>- **Endpoint:**http://127.0.0.1:8080/statusReport/allStatusReport
>- **Methord:** GET
>- **Status Code:**
> i. 	201 CREATED: On Success.
> ii. 404 Not Found : If no data .
> 
> **- Request Data:**
> >
> **-Response Data**
> > ```js
> >[
> >		{
> >			"statusReportId": 14,
> >			"comments": "comments",
> >			"details": "First Status Report",
> >			"createdDate": "2022-03-17",
> >			"u_id": 0,
> >			"d_id": 0,
> >			"c_id": 0,
> >			"user": 
> >			{
> >				"id": 1,
> >				"password": "1234",
> >				"role": "SDE",
> >				"result": 55
> >			},
> >			"department": 
> >			{
> >				"id": 1,
> >				"name": "FINENCE"
> >			},
> >			"compliance": 
> >			{
> >				"complianceId": 6,
> >				"complianceType": "Hardware",
> >				"complianceDescription": "BUILT OF SPRING BROKE",
> >				"complianceDate": "2022-03-17",
> >				"employeeCount": 9,
> >				"stsCount": 6,
> >				"complianceStatus": "Completed",
> >				"d_id": 1,
> >				"u_id": 0,
> >				"department": 
> >				{
> >					"id": 1,
> >					"name": "FINENCE"
> >				},
> >				"user": null
> >			}
> >		},
> >		{
> >			"statusReportId": 115,
> >			"comments": "comments",
> >			"details": "Trial Report",
> >			"createdDate": "2022-03-17",
> >			"u_id": 0,
> >			"d_id": 0,
> >			"c_id": 0,
> >			"user": 
> >			{
> >				"id": 1,
> >				"password": "1234",
> >				"role": "SDE",
> >				"result": 55
> >			},
> >			"department": 
> >			{
> >				"id": 1,
> >				"name": "FINENCE"
> >			},
> >			"compliance": 
> >			{
> >				"complianceId": 6,
> >				"complianceType": "Hardware",
> >				"complianceDescription": "Fan Sopped Working",
> >				"complianceDate": "2022-03-17",
> >				"employeeCount": 9,
> >				"stsCount": 6,
> >				"complianceStatus": "Accepted",
> >				"d_id": 1,
> >				"u_id": 0,
> >				"department": 
> >				{
> >					"id": 1,
> >					"name": "IT"
> >				},
> >				"user": null
> >			}
> >		}
> >]