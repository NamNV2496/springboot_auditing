# Auditing

would you think about updating created user, created date , last updated user and last updated date automatically

=> auditing will support that.

in domain please extends `extends AuditTrail<String>`


then when you work with data the history will save


    GET http://localhost:8080/post
    {
    "id": 2,
    "name": "hellop"
    }
    ==================================================================
    curl --location --request GET 'http://localhost:8081/' \
    --header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTY2NDQ2MjEyOCwiZXhwIjoxNjY0NDY1NzI4LCJkYXRhIjpbeyJyb2xlcyI6WyJhZG1pbiIsIm1lbWJlciJdfV19.YrwB4s_pe6Gg9GwwFhVGv3JW7AumivKLGxFudSMNDRM' \
    --header 'Content-Type: application/json' \
    --data-raw '{
    "id": 1,
    "name": "cat"
    }'
    ==================================================================
    PATCH http://localhost:8080/patch
    {
    "id": 2,
    "name": "replaced"
    }
    ==================================================================
    curl --location --request PUT 'http://localhost:8080/patch' \
    --header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTY2NDQ2MjEyOCwiZXhwIjoxNjY0NDY1NzI4LCJkYXRhIjpbeyJyb2xlcyI6WyJhZG1pbiIsIm1lbWJlciJdfV19.YrwB4s_pe6Gg9GwwFhVGv3JW7AumivKLGxFudSMNDRM' \
    --header 'Content-Type: application/json' \
    --data-raw '{
    "id": 2,
    "name": "asdfasfdsafdasddasasda"
    }'
    ==================================================================
