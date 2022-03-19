## ADD Employee

POST
http://127.0.0.1:8080/employee/saveEmployee

Request: 
{
        "firstName" : "Lakshita",
        "lastName" : "Mathur",
        "email" : "Lakshita@gmail.com",
        "dateOfBirth" : "2000-06-28",
        "u_id" : 1,
        "d_id" : 0
}

Reponse:
201 Created
{
    "id": 38,
    "firstName": "Lakshita",
    "lastName": "Mathur",
    "email": "Lakshita@gmail.com",
    "dateOfBirth": "2000-06-28",
    "u_id": 1,
    "d_id": 0,
    "user": {
        "id": 1,
        "password": "1234",
        "role": "SDE",
        "result": 55
    },
    "department": {
        "departName": "IT",
        "departId": 0
    }
}


## Get All Employee

GET

http://127.0.0.1:8080/employee/getAllEmployee

Response:
200 OK
[
    {
        "id": 31,
        "firstName": "Lakshita",
        "lastName": "Mathur",
        "email": "Lakshita@gmail.com",
        "dateOfBirth": "2000-06-28",
        "u_id": 1,
        "d_id": 0,
        "user": {
            "id": 1,
            "password": "1234",
            "role": "SDE",
            "result": 55
        },
        "department": {
            "departName": "IT",
            "departId": 0
        }
    },
    {
        "id": 32,
        "firstName": "Lakshita",
        "lastName": "Mathur",
        "email": "Lakshita@gmail.com",
        "dateOfBirth": "2000-06-28",
        "u_id": 1,
        "d_id": 29,
        "user": {
            "id": 1,
            "password": "1234",
            "role": "SDE",
            "result": 55
        },
        "department": {
            "departName": "Management",
            "departId": 29
        }
    },
    {
        "id": 30,
        "firstName": "Tanmay",
        "lastName": "Mathur",
        "email": "Lakshita@gmail.com",
        "dateOfBirth": "2000-06-28",
        "u_id": 1,
        "d_id": 29,
        "user": {
            "id": 1,
            "password": "1234",
            "role": "SDE",
            "result": 55
        },
        "department": {
            "departName": "Management",
            "departId": 29
        }
    },
    {
        "id": 37,
        "firstName": "Lakshita",
        "lastName": "Mathur",
        "email": "Lakshita@gmail.com",
        "dateOfBirth": "2000-06-28",
        "u_id": 1,
        "d_id": 0,
        "user": {
            "id": 1,
            "password": "1234",
            "role": "SDE",
            "result": 55
        },
        "department": {
            "departName": "IT",
            "departId": 0
        }
    },
    {
        "id": 38,
        "firstName": "Lakshita",
        "lastName": "Mathur",
        "email": "Lakshita@gmail.com",
        "dateOfBirth": "2000-06-28",
        "u_id": 1,
        "d_id": 0,
        "user": {
            "id": 1,
            "password": "1234",
            "role": "SDE",
            "result": 55
        },
        "department": {
            "departName": "IT",
            "departId": 0
        }
    }
]



## Update Employee
PUT
http://127.0.0.1:8080/employee/updateEmployeeById/30

Request:
{
        "firstName" : "Lakshita",
        "lastName" : "Mathur",
        "email" : "Lakshita@gmail.com",
        "dateOfBirth" : "2000-06-28",
        "u_id" : 1,
        "d_id" : 0
}

Response:

200 ok

{
    "id": 30,
    "firstName": "Lakshita",
    "lastName": "Mathur",
    "email": "Lakshita@gmail.com",
    "dateOfBirth": "2000-06-28",
    "u_id": 1,
    "d_id": 0,
    "user": {
        "id": 1,
        "password": "1234",
        "role": "SDE",
        "result": 55
    },
    "department": {
        "departName": "IT",
        "departId": 0
    }
}



## Delete Employee
Delete
http://127.0.0.1:8080/employee/deleteEmployee/30

202 Accepted

## Get Employee By Pagination
http://127.0.0.1:8080/employee/getAllEmployeeByPagination/5

200 OK

Response:
[
    {
        "id": 31,
        "firstName": "Lakshita",
        "lastName": "Mathur",
        "email": "Lakshita@gmail.com",
        "dateOfBirth": "2000-06-28",
        "u_id": 1,
        "d_id": 0,
        "user": {
            "id": 1,
            "password": "1234",
            "role": "SDE",
            "result": 55
        },
        "department": {
            "departName": "IT",
            "departId": 0
        }
    },
    {
        "id": 32,
        "firstName": "Lakshita",
        "lastName": "Mathur",
        "email": "Lakshita@gmail.com",
        "dateOfBirth": "2000-06-28",
        "u_id": 1,
        "d_id": 29,
        "user": {
            "id": 1,
            "password": "1234",
            "role": "SDE",
            "result": 55
        },
        "department": {
            "departName": "Management",
            "departId": 29
        }
    },
    {
        "id": 37,
        "firstName": "Lakshita",
        "lastName": "Mathur",
        "email": "Lakshita@gmail.com",
        "dateOfBirth": "2000-06-28",
        "u_id": 1,
        "d_id": 0,
        "user": {
            "id": 1,
            "password": "1234",
            "role": "SDE",
            "result": 55
        },
        "department": {
            "departName": "IT",
            "departId": 0
        }
    },
    {
        "id": 38,
        "firstName": "Lakshita",
        "lastName": "Mathur",
        "email": "Lakshita@gmail.com",
        "dateOfBirth": "2000-06-28",
        "u_id": 1,
        "d_id": 0,
        "user": {
            "id": 1,
            "password": "1234",
            "role": "SDE",
            "result": 55
        },
        "department": {
            "departName": "IT",
            "departId": 0
        }
    }
]
