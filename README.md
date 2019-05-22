# mule-api-lock-poc
Example to Lock a GET API end-point in Mule

## How to Run?
	Use Run As Mule Application with Maven
	
	http://localhost:8081/vibes/api/lock/poc/test

## Description
##### This is a POC(Dummy) flow to demonstrate Lock/Unlock Operation in Mule , just adding a sleep of 10sec before sending the response
	call /vibes/api/lock/poc/test using postman
	from two different tabs(when first call is in progress,invoke another instance) 
	first instance will return ##200 status code 
	second instance will return ##399(custom status)
	lockid is hard-coded in this example
	however it can be based on an unique identifier in a real world implementation
	
	

##### Reference
	https://ede65566-docs-migration.github.io/docs-site/mule-runtime/3.8/administer/clustering/distributed-locking
