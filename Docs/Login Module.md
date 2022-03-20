## Create User
POST
http://127.0.0.1:8080/authentication/addUser
Request:
{
    "userName":"hunter76",
    "password":1234,
    "role":"Mangment",
    "result":20
}

Response:
201 Created

{
    "id": 43,
    "userName": "hunter76",
    "password": "1234",
    "role": "Mangment",
    "result": 20
}

## Login
POST
http://127.0.0.1:8080/authentication/login
Request:
{
    "userName":"hunter76",
    "password":"1234"
}
Response:
200 ok
{
    "id": 43,
    "userName": "hunter76",
    "password": "1234",
    "role": "Mangment",
    "result": 20
}

## LogOut:
GET
http://127.0.0.1:8080/authentication/logout

Response:
200 ok ==> If User logged in and try to logOut

400 Bad Request ==> If User not Logged in.


## Get All User
GET
http://127.0.0.1:8080/authentication/getAllUsers


Response:

204 No Content: If No user Exist.


200 OK

[
    {
        "id": 1,
        "userName": null,
        "password": "1234",
        "role": "SDE",
        "result": 55
    },
    {
        "id": 41,
        "userName": "hunter56",
        "password": "1234",
        "role": "Mangment",
        "result": 20
    },
    {
        "id": 42,
        "userName": "hunter56",
        "password": "1234",
        "role": "Mangment",
        "result": 20
    },
    {
        "id": 43,
        "userName": "hunter76",
        "password": "1234",
        "role": "Mangment",
        "result": 20
    }
]


## User By Id
GET
http://127.0.0.1:8080/authentication/getUserById/{id}

Response:
400 Bad Request ==> If User does not exist.

200 Ok

{
    "id": 1,
    "userName": "Shashank",
    "password": "1234",
    "role": "SDE",
    "result": 55
}



## Delete User
DELETE
http://127.0.0.1:8080/authentication/removeUser/{id}

Response:
400 Bad Request ==> If User Not exist

200 Ok
{
    "id": 41,
    "userName": "hunter56",
    "password": "1234",
    "role": "Mangment",
    "result": 20
}