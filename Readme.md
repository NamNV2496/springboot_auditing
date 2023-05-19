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
	curl --location --request PUT 'http://localhost:8080/post' \
	--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTY2NDQ2MjEyOCwiZXhwIjoxNjY0NDY1NzI4LCJkYXRhIjpbeyJyb2xlcyI6WyJhZG1pbiIsIm1lbWJlciJdfV19.YrwB4s_pe6Gg9GwwFhVGv3JW7AumivKLGxFudSMNDRM' \
	--header 'Content-Type: application/json' \
	--data-raw '{
		"id": 2,
		"name": "asdfasfdsafdasddasasda"
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



# how to import a service to static class

## Step 1: define service normally

![img.png](img.png)


## Step 2: define import function `setMyConfig`

![img_1.png](img_1.png)

## Step 3: create a static class to import `StaticContextInitializer`


must use `@Component` and `@PostConstruct` to init

![img_2.png](img_2.png)

```java
    @PostConstruct
    public void init() {
        CacheUtils.setMyConfig(cacheService);
    }
```


Now we call use CacheUtils in everywhere

![img_3.png](img_3.png)