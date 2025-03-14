## Project Title
Registration Form with JSP (Not Laravel)

## Description
This project is an e-commerce website created for studying purposes. It is not intended for commercial use. The project was built within 3 days. 
The primary goal of this project is develop the form in JSP (Not Laravel), connect to MySQL and save the values in the database. 

## Scenario for registration
1. Create a Registration form for the programmer along with required validation
2. Save the submitted form value to database
3. Display a Thank You page

## Installation
1. Clone the repository or download the files.
2. Ensure you have the required dependencies installed.
3. Place the Apache Tomcat File at C:/xampp/apache (default xamp path)
4. Follow the setup instructions below.

## Usage
- Open the folder with Intellij IDEA (maven)
- Select Oracle Open JDK 23.0.2 under File > Project Structure > Project
- At File > Project Structure > Libraries, add file JAVA of downloaded file of Tomcat 9.0.102 ".\apache-tomcat-9.0-102\lib\servlet-api.java"
- Add Server Configurations for:
  - Smart Tomcat > Tomcat Server > Select the Apache Tomcat 9.0.102 file that u added into xamp
  - Catalina base:".\IdeaProjects\DSE105_Assignment-1"
  - Deployment Directory:".\IdeaProjects\DSE105_Assignment-1\src\main\web"
  - Context path :"/" (any)
  - Note that u had to add context path, change the default Server port if u are using port 8080 somewhere else

## Technologies/Dependency Used
- Intellij IDEA Community Edition 2024.3.4.1
- Apache Tomcat 9.0.102
- Oracle Open JDK 23.0.2
- XAMPP v 3.3.0 (Apache, MySQL, Tomcat)
- HTML, CSS, JavaScript, Java, JSP, mySQL
- Bootstrap, Jquery
