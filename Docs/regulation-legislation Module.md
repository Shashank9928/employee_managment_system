POST
http://127.0.0.1:8080/compliance/addCompliance

ReQuest:
{
    "complianceType":"Hardware",
    "complianceDescription":"BUILT OF SPRING BROKE",
    "employeeCount":9,
    "stsCount":6,
    "complianceStatus":"Completed",
    "d_id":1,
    "u_id":1
}


Response:

201 CREATED
{
    "complianceId": 8,
    "complianceType": "Hardware",
    "complianceDescription": "BUILT OF SPRING BROKE",
    "complianceDate": "2022-03-17",
    "employeeCount": 9,
    "stsCount": 6,
    "complianceStatus": "Completed",
    "d_id": 1,
    "u_id": 1,
    "department": {
        "id": 1,
        "name": "FINENCE"
    },
    "user": {
        "id": 1,
        "password": "1234",
        "role": "SDE",
        "result": 55
    }
}



GET
http://127.0.0.1:8080/compliance/getAllCompliance

Response:
204 No Content

200 OK
[
    {
        "complianceId": 5,
        "complianceType": "Hardware",
        "complianceDescription": "BUILT OF SPRING BROKE",
        "complianceDate": "2022-03-17",
        "employeeCount": 9,
        "stsCount": 6,
        "complianceStatus": "Completed",
        "d_id": 1,
        "u_id": 0,
        "department": {
            "id": 1,
            "name": "FINENCE"
        },
        "user": null
    },
    {
        "complianceId": 6,
        "complianceType": "Hardware",
        "complianceDescription": "BUILT OF SPRING BROKE",
        "complianceDate": "2022-03-17",
        "employeeCount": 9,
        "stsCount": 6,
        "complianceStatus": "Completed",
        "d_id": 1,
        "u_id": 0,
        "department": {
            "id": 1,
            "name": "FINENCE"
        },
        "user": null
    },
    {
        "complianceId": 7,
        "complianceType": "Hardware",
        "complianceDescription": "BUILT OF SPRING BROKE",
        "complianceDate": "2022-03-17",
        "employeeCount": 9,
        "stsCount": 6,
        "complianceStatus": "Completed",
        "d_id": 1,
        "u_id": 0,
        "department": {
            "id": 1,
            "name": "FINENCE"
        },
        "user": null
    },
    {
        "complianceId": 8,
        "complianceType": "Hardware",
        "complianceDescription": "BUILT OF SPRING BROKE",
        "complianceDate": "2022-03-17",
        "employeeCount": 9,
        "stsCount": 6,
        "complianceStatus": "Completed",
        "d_id": 1,
        "u_id": 1,
        "department": {
            "id": 1,
            "name": "FINENCE"
        },
        "user": {
            "id": 1,
            "password": "1234",
            "role": "SDE",
            "result": 55
        }
    }
]



GET
http://127.0.0.1:8080/compliance/getComplianceByUserId/{User_Id}
http://127.0.0.1:8080/compliance/getComplianceByUserId/1


404 Not Found : If no data of User Id


200 OK
{
    "complianceId": 8,
    "complianceType": "Hardware",
    "complianceDescription": "BUILT OF SPRING BROKE",
    "complianceDate": "2022-03-17",
    "employeeCount": 9,
    "stsCount": 6,
    "complianceStatus": "Completed",
    "d_id": 1,
    "u_id": 1,
    "department": {
        "id": 1,
        "name": "FINENCE"
    },
    "user": {
        "id": 1,
        "password": "1234",
        "role": "SDE",
        "result": 55
    }
}



POST 
http://127.0.0.1:8080/statusReport/addStatusReport

Request:
{
    "comments":"comments",
    "details":"First Status Report",
    "d_id":1,
    "u_id":1,
    "c_id":6
}


Response 

201 Created
{
    "statusReportId": 14,
    "comments": "comments",
    "details": "First Status Report",
    "createdDate": "2022-03-17",
    "u_id": 0,
    "d_id": 0,
    "c_id": 0,
    "user": {
        "id": 1,
        "password": "1234",
        "role": "SDE",
        "result": 55
    },
    "department": {
        "id": 1,
        "name": "FINENCE"
    },
    "compliance": {
        "complianceId": 6,
        "complianceType": "Hardware",
        "complianceDescription": "BUILT OF SPRING BROKE",
        "complianceDate": "2022-03-17",
        "employeeCount": 9,
        "stsCount": 6,
        "complianceStatus": "Completed",
        "d_id": 1,
        "u_id": 0,
        "department": {
            "id": 1,
            "name": "FINENCE"
        },
        "user": null
    }
}
