POST
http://127.0.0.1:8080/compliance/addCompliance

ReQuest:
{
    "complianceType":"Hardware",
    "complianceDescription":"BUILT OF SPRING BROKE",
    "employeeCount":9,
    "stsCount":6,
    "complianceStatus":"Completed",
    "d_id":1
}


Response:

201 CREATED
{
    "complianceId": 3,
    "complianceType": "Hardware",
    "complianceDescription": "BUILT OF SPRING BROKE",
    "complianceDate": "2022-03-17",
    "employeeCount": 9,
    "stsCount": 6,
    "complianceStatus": "Completed",
    "d_id": 1,
    "department": {
        "id": 1,
        "name": "FINENCE"
    }
}



GET
http://127.0.0.1:8080/compliance/getAllCompliance

Response:
204 No Content

200 OK
[
    {
        "complianceId": 1,
        "complianceType": "Hardware",
        "complianceDescription": "CPU BROKE",
        "complianceDate": "2022-03-17",
        "employeeCount": 5,
        "stsCount": 6,
        "complianceStatus": "Approved",
        "d_id": 0,
        "department": {
            "id": 0,
            "name": "IT"
        }
    },
    {
        "complianceId": 2,
        "complianceType": "Hardware",
        "complianceDescription": "CPU BROKE",
        "complianceDate": "2022-03-17",
        "employeeCount": 5,
        "stsCount": 6,
        "complianceStatus": "Approved",
        "d_id": 0,
        "department": {
            "id": 0,
            "name": "IT"
        }
    },
    {
        "complianceId": 3,
        "complianceType": "Hardware",
        "complianceDescription": "BUILT OF SPRING BROKE",
        "complianceDate": "2022-03-17",
        "employeeCount": 9,
        "stsCount": 6,
        "complianceStatus": "Completed",
        "d_id": 1,
        "department": {
            "id": 1,
            "name": "FINENCE"
        }
    },
    {
        "complianceId": 4,
        "complianceType": "Hardware",
        "complianceDescription": "BUILT OF SPRING BROKE",
        "complianceDate": "2022-03-17",
        "employeeCount": 9,
        "stsCount": 6,
        "complianceStatus": "Completed",
        "d_id": 1,
        "department": {
            "id": 1,
            "name": "FINENCE"
        }
    }
]


