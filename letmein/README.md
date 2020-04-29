# Let Me In
Semester Project for CSCI4448 Object Oriented Programming
Spring 2020

## How to Run Code
#### 1. Start the server
This will also start the server and also create the "database" (that is created locally)
```
cd letmein/functionality
mvn spring-boot:run
```

#### 2. Start the website
```
cd ../letmein_website
npm start
```
If there is an issue with 'npm start', you may need to
```
npm install
```
then
```
npm start
```
A tab of localhost:3000 should pop up via your web browser

#### 3. Try out the web application
1. Adding a new job entry
* Click "Add New Entry"
* (Note: Any, some, or none of these fields can be left empty. The Builder pattern is able to handle creating entries where not all fields are completed)
* Status: Only accepts either "Rejected", "Pending", or "Accepted"
* Date: Insert date (perhaps of when application is due, expected time of job opening, or expected date of when you're supposed to get a reply)
* Company: Company you are applying to
* Position: Position you are applying for
* Type: Only accepts either "Full Time" or "Internship"
* Click the "Submit" button
* Refresh page
* Feel free to add more entries

2. Edit an entry
* Click "Edit" on one of the entries
* Edit any of the fields (i.e. the status field)
* Click the "Submit" button
* Refresh page

3. Delete an entry
* Click the "Delete" button
* Refresh page

#### Technologies Used
* Java for backend/patterns
* Sqlite3 for database
* Spring as our web framework
* React.js for frontend
* Axios for HTTP requests

