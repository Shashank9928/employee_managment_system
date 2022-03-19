POST- http://127.0.0.1:8080/departmentController/addDepartment

REQUEST-
{
    "name": "Management"
}

RESPONSE-
{
    "departId": 22,
    "departName": null
}


GET- http://127.0.0.1:8080/departmentController/getAllDepartment

REQUEST-

RESPONSE-
[
    {
        "departId": 0,
        "departName": "IT"
    },
    {
        "departId": 1,
        "departName": "FINENCE"
    },
    {
        "departId": 21,
        "departName": null
    }
]


GET- http://127.0.0.1:8080/departmentController/getAllDepartmentByPagination/{maxPage}

REQUEST-

RESPONSE-
[
    {
        "departId": 0,
        "departName": "IT"
    },
    {
        "departId": 1,
        "departName": "FINENCE"
    },
    {
        "departId": 21,
        "departName": null
    }
]


GET- http://127.0.0.1:8080/departmentController/getCount

REQUEST-

RESPONSE- 
3
Status:200 OK


DELETE- http://127.0.0.1:8080/departmentController/deleteDepartment/{departId}

REQUEST-

RESPONSE-
Status: 202 Accepted

