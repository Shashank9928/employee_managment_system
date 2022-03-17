POST
http://127.0.0.1:8080/compliance/add

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