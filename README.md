# WEB APPLICATION GROUP 5

Project developed as an assignment for Web Application Development subject, Software Engineering degree.
Rey Juan Carlos University 2019/2020

Development off a web application for La Caverna del Dragon association (URJC - Mostoles).

## Video - Demo Phase 4
https://youtu.be/Q4QKvOvLdIg

## PHASE 0: Project attributes

## Developer team
| Name	| Email	| User |
|-------|-------|--------|
| Alfonso Pajuelo Aguirre	| va.pajuelo@alumnos.urjc.es	| alfonsopajueloaguirre |
| Carlos Palomares Becerra	| c.palomaresb@alumnos.urjc.es	| carlospabe |
| Daniel Moreno Godoy		| d.moreno.2016@alumnos.urjc.es	| Danielmg21 |
| Miguel Jiménez Granizo	| m.jimenezgra@alumnos.urjc.es	| byGranizo |
| Óscar Rivas Melar         | o.rivas.2017@alumnos.urjc.es 	| oscar-llury |

- Project's trello board: https://trello.com/b/3Y1kgUPj/

### Project description
**Entities:**
* Events: date, location, game rules and team quota.
* Merchandising: price, delivery and products availability.
* Registered user: profiles and preferences.
* Administration user: administration permissions and tools.

**User's role and permissions:**
- Registered users that belong to the association:
  - President and vicepresident: association's members permisisions and responsabilities managment. 
  - Secretary: events and tournaments managment.
  - Treasurer: accounts manager and merchandising store managment.
  - Board member: site maintenance and user support.
- Registered user: profile and preferences managment, join events and purchase merchandising.
- Visitors: browse the website

**Complementary tecnology:**
* Bootstrap for responsive style.
* ChartJS for diagram designs.
* Subscribe to the newsletter.
* Contact block by application form.
* Event location by google maps.

**Advanced query or algorithm:**
Based on user's purchases and inscripted activites, they will recieve a mail about new events according to their preferences.
  
## PHASE 1: Website structure by HTML and CSS
  
**Table of contents**:
  - Main page: presentation of the website.
  ![Main page](backend/src/main/resources/static/assets/img/webScreenShots/index.PNG)
  
  - Merchandising: shows all merchandising products.
  ![Merchandising page](backend/src/main/resources/static/assets/img/webScreenShots/merchandising.png)
  
  - Merchandising product: shows more details of a merchandising product and let registered users to make purchases.
  ![Merchandising product_page](backend/src/main/resources/static/assets/img/webScreenShots/merch.PNG)
  
  - Events: shows all events.
  ![Events page](backend/src/main/resources/static/assets/img/webScreenShots/events.PNG)
 
  - Event : allows users to check event's details and registered users to submit their attendance.
  ![Event page](backend/src/main/resources/static/assets/img/webScreenShots/event.PNG)
  
  - About us: information about our history and leadership.
  ![About us page](backend/src/main/resources/static/assets/img/webScreenShots/aboutUs.PNG)
  
  - Contact: association main contact details.
  ![Contact page](backend/src/main/resources/static/assets/img/webScreenShots/contact.PNG)
  
  - Login: credentials log screen.
  ![Login page](backend/src/main/resources/static/assets/img/webScreenShots/login.PNG)
  
  - Register: creates a new user profile and credentials.
  ![Register page](backend/src/main/resources/static/assets/img/webScreenShots/register.PNG)
  
  - Profile: shows user information.
  ![Profile page](backend/src/main/resources/static/assets/img/webScreenShots/profile.PNG)
  
  - Profile edit: permit user to show and edit him personal information.
  ![Profile edit_page](backend/src/main/resources/static/assets/img/webScreenShots/edit-profile.PNG)
 
  - Error page: personalized error page.
  ![Error_page](backend/src/main/resources/static/assets/img/webScreenShots/error.PNG)
  
  - Management admin: exclusive to change user roles that belong to the association.
  ![Management_admin_page](backend/src/main/resources/static/assets/img/webScreenShots/gestiones-admin.PNG)

  - Management events: exclusive to show user inscriptions and all events rates.
  ![Management_events_page](backend/src/main/resources/static/assets/img/webScreenShots/user-events-registers.PNG)
  
  - Management merchandising: exclusive to show user purchases and all merchandising rates.
  ![Management_merchandising_page](backend/src/main/resources/static/assets/img/webScreenShots/user-merch-purchases.PNG)
  
  - Management events register: exclusive to register a new event.
  ![Management_events_from_page](backend/src/main/resources/static/assets/img/webScreenShots/event-form.PNG)
  
  - Management merchandising register: exclusive to register a new merchandising.
  ![Management_merchandising_form_page](backend/src/main/resources/static/assets/img/webScreenShots/merch-form.PNG)
  
**Navigation Diagram**: 
![Navigation Diagram for all types of users](backend/src/main/resources/static/assets/img/navigationDiagram.png)

## PHASE 2: Web with HTML generated by servidor and AJAX

### Development direction

- Repository: Github/webapp5
- Development tools: Visual Studio Code, Spring Tool Suite4, Eclipse.
- Dependencies: MySQL Workbench
- To be able to execute the files included in this repository yo should follow the next steps:
1. Open the project in Spring Tool Suite4.
2. Start a service MySQL in the local host 3306, we recommend using XAMPP.
3. Start a connection with de database from the ip: 127.0.0.1 in the port: 3306 with the user "root"and without password. We recomend using MySQL Workbench.
4. (RECOMENDED) In Spring, right click over the root project folder > Maven > Update Project
5. Start running the applicattion from Spring by Spring Boot App.
6. Enter from a browser to: https://localhost:8443

### Diagrams

**Navigation Diagram for public pages**:
![Navigation Diagram for public pages](backend/src/main/resources/static/assets/img/navigationDiagramFase2-1.png)

**Navigation Diagram for private pages**:
![Navigation Diagram for private pages](backend/src/main/resources/static/assets/img/navigationDiagramFase2-2.png)

**Data Base Diagram**
![BBDD Diagram](backend/src/main/resources/static/assets/img/BBDDDiagram.png)

**Class-Template Diagram**
![Class-Template Diagram](backend/src/main/resources/static/assets/img/ClassTemplate.png)

### Members participation

**Miguel**

- Completed tasks: creation of the Spring project, generation of the "Entity" classes for the database and its previous modeling. Integration of components and creation of the admin dashboard. Certification https and port 8443.

- 5 most significant commits:
  1. Pojo classers + Session
  2. Added https and secure config class
  3. All adapted to db, Lasting relations
  4. Header and footer as components + session controlle + header user menu
  5. dashboard example
  
- 5 files with participation:
  1. dashboard.html
  2. header.html
  3. dashboard.js
  4. DashboardControllerjava
  5. package com.lcdd.backend.pojo

**Daniel**

-  Completed tasks: generate the event and merchandaising templates forms. Configure the user roles of the application. Security configuration when accessing the database.

- 5 most significant commits:
  1. Added register event view
  2. Inserted event-form in backend
  3. Added data base user roles
  4. Added CSRFconfig
  5. Fixed errors in security classes
  
- 5 files with participation:
  1. merch-form.html
  2. event-form.html
  3. SecurityConfiguration.java
  4. CSRFHandlerConfiguration
  5. UserRepositoryAuthenticationProvider

**Carlos**

- Completed tasks: implementation of a function for the "Show more" button on the Events and Merchandising pages. Sample image editing for assets. Text writing for all web.

- 5 most significant commits:
  1. fix not showing multiple times
  2. updated event images
  3. scrolling into show more button
  4. early version of the feature (showMore)
  5. removed scroll to button functionality

- 5 files with participation:
  1. events.html
  2. about_us.html
  3. merchandising.html

**Óscar**

- Completed tasks: generate the event more information template that is filled from the form data template and its java controllers. Convert all static html pages into templates, also include the head, nav and footer as components. Create the error page and configure it to replace the "white error page".

- 5 most significant commits:
  1. event-form done, remining event-template
  2. updates, remaining photo, id, game, isTorunament (also added display none/block to Premio)
  3. created page 404
  4. changes in templates and html
  5. all pages converted to templates with head and footer in components

- 5 files with participation:
  1. event-template.html
  2. event-form.html
  3. (page)Controller.java
  4. Event.java
  5. error.html

**Alfonso**

- Completed tasks: pagination and show more merchandising, convert the user view into a template, implement the user's logic for editing after the creation of the profile.

- 5 most significant commits:
  1. Implemented User Profile Logic
  2. Repository and User Controllers
  3. Updated Diagramns and Assets
  4. Added More Merch Types
  5. Show More Feature

- 5 files with participation:
  1. merchandising.html
  2. user_view.html
  3. user-form.html
  4. User.java
  5. UserController.java

## PHASE 3: API REST to the web application and docker deployment
- Document [Api documentation](API.md) with information about the REST API.
### Docker
Docker allows you to use our application without having anything install.You just need to follow the next steps:
  1. Install docker, you can download it [here](https://docs.docker.com/install/#supported-platforms). 
  2. To run the app you simply have to open a terminal in Docker folder and execute "docker-compose up".
  3. If you are in Docker Desktop to access the app you have to open your navigator and go to https://localhost:8443. If you are in Docker Toolbox to acces to the app you have to open your navigator and go to https://localhost: with the port number that it is indicated in the first lines of the command line: for example: `docker is configured to use the default machine with IP 192.168.99.100 `

- To stop the app you have to execute "docker-compose down".
- The docker-compose.yml file uses a mysql image sets up in port 3306 (Don't forget to stop your local mysql), and a contafin image, sets up in port 8080.

#### Linux Commands
To execute docker in linux you should follow the next commands:
- ./create-image.sh
- docker-compose up
To stop running the docker use:
- docker-compose down

**Class Diagram**: 
![Class Diagram](backend/src/main/resources/static/assets/img/ClassTemplateFase3.png)

### Members participation

**Miguel**

- Completed tasks: Dockerizing of app and database. script for building the app and pushing it to docker hub repository.

- 5 most significant commits:
  1. Everything working, lasting little chyanges before merging
  2. Script + dockerfile ready
  3. build script ready
  4. workflow finished
  5. base image stablished

- 5 files with participation:
  1. Dockerfile
  2. docker-compose.yml
  3. create-image.sh
  4. wait-for.sh
  
**Daniel**

-  Completed tasks:generate Rest security configuration, Login Rest Controller, RestControllerExceptionHandler and README.

- 5 most significant commits:
  1. LoginController done + RestSecurity started
  2. Security User
  3. Security role + merch 
  4. Event security
  5. Added class diagram
  
- 5 files with participation:
  1. RestSecurityConfig
  2. LoginRestController
  3. RestControllerExceptionHandler
  4. README.md
  5. API.md

**Carlos**

- Completed tasks: APIRest and services implemented to every event related entity, and implemented GET, POST, PUT and DELETE methods for event related purposes with its own security implementation.

- 5 most significant commits:
  1. initial api rest changes on event related classes
  2. changed repositories to services
  3. added security, fixed post and checked put and delete
  4. fixed errors after merge
  5. updated local variable names

- 5 files with participation:
  1. EventRestController.java
  2. RestSecuriryConfig.java
  3. UserRegisterEventService.java
  4. EventService.java
  5. GameService.java

**Óscar**

- Completed tasks: generate the role and user service and rest controllers for api rest. Update initController with data more realistic data.

- 5 most significant commits:
  1. fixed new errors from the last commit.
  2. use Role and User Service from all fase2 controllers.
  3. Rest user and role controller working good, updated initController.
  4. created RoleRestController and RoleService update UserRestController too.
  5. created userService and profileRestController

- 5 files with participation:
  1. UserRestController.java
  2. RoleRestController.java
  3. RoleService.java
  4. UserService.java
  5. InitController.java

**Alfonso**

- Completed tasks: APIRest and services implemented to every merchandising entity, finished advanced algorithm and implemented methods POST and GET images in the APIREST.

- 5 most significant commits:
  1. Started merchandising rest controller.
  2. Implemented services merch and merchtypes.
  3. Postman testing.
  4. Update security.
  5. Algorithm progress. 

- 5 files with participation:
  1. MerchandisingRestController.java 
  2. MerchandisingService.java
  3. MerchTypeService.java
  4. profile.html
  5. SecurityConfiguration.java
  
  

## PHASE 4: Web with SPA architecture

- Document [Api documentation](API.md) with information about the REST API.

### Docker
Docker allows you to use our application without having anything install.You just need to follow the next steps:
  1. Install docker, you can download it [here](https://docs.docker.com/install/#supported-platforms). 
  2. To run the app you simply have to open a terminal in Docker folder and execute "docker-compose up".
  3. If you are in Docker Desktop to access the app you have to open your navigator and go to https://localhost:8443/new/. If you are in Docker Toolbox to acces to the app you have to open your navigator and go to https://localhost:8443/new/ with the port number that it is indicated in the first lines of the command line: for example: `docker is configured to use the default machine with IP 192.168.99.100 `

- To stop the app you have to execute "docker-compose down".
- The docker-compose.yml file uses a mysql image sets up in port 3306 (Don't forget to stop your local mysql), and a contafin image, sets up in port 8080.

#### Linux Commands
To execute docker in linux you should follow the next commands:
- ./create-image.sh
- docker-compose up
To stop running the docker use:
- docker-compose down

### How to run
  1. Run the MySQL database.
  2. Run Spring Boot backend.
  3. On console, go to the root folder of the angular project. 
  4. Run `npm install` to update packages.
  5. Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.
  6. Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.
  7. To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

### Templates, Components and Services Diagram
![Templates, Components and Services Diagram](frontend/src/assets/img/readme/diagramPhase4.png)

### Members participation

**Miguel**

- Completed tasks: adapting most of static pages to angular framework. new front services to get data to fill chats of dashboard, add new angular technology to dockerize script. 

- 5 most significant commits:
  1. Front structure
  2. All services for dashboard created
  3. Login and logout ready
  4. Save role + delete user ready
  5. Charts ready

- 5 files with participation:
  1. Merch-line-chart
  2. Events-bar-chart
  3. Dashboard
  4. User-dash
  5. Event-dash
  
**Daniel**

- Completed tasks: update the security  for angular technology, creation of login and register pages to permit the access to the app. Resolving errors in different components.

- 5 most significant commits:
  1. apiRest calls fixed
  2. apiRest calls fixed
  3. backend security active
  4. Register working
  5. finishing userRegister

- 5 files with participation:
  1. Login-component
  2. Register-component
  3. Auth-interceptor
  4. Validator-interceptor
  5. RestSecurityConfig


**Carlos**

- Completed tasks: coding profile page frontend, http put for the edit profile functionality, updating the README and helping with the logic behind the events and merch pages.

- 5 most significant commits:
  1. http put for user working
  2. first steps on profile front 
  3. first readme update
  4. working tabs
  5. fixed not showing correct user info after refreshing

- 5 files with participation:
  1. profile.component.html
  2. profile.component.ts
  3. users.service.ts
  4. app.component.html
  5. README.md

**Óscar**

- Completed tasks: creating events pages with angular technology. Catch the form data information and save it into the data base. Then, get the information ftom the data base and show it at the web page.

- 5 most significant commits:
  1. create an event work SUPER NICE
  2. create user registration in an event
  3. create event-template
  4. create new api purchase post
  5. create home by angular

- 5 files with participation:
  1. event-form-component
  2. event-template.component
  3. home.component
  4. error.component
  5. PurchaseRestController.java

**Alfonso**

- Completed tasks: creating merch and profile pages with angular technology. From creating new merchandising to displaying the details in a template. Great contribution in profile implementing the advanced algorithm that suggest events to users.

- 5 most significant commits:
  1. created a merch template
  2. started MerchPageable
  3. merchList finished
  4. implemented buyMerch button
  5. finished advanced algorithm

- 5 files with participation:
  1. merch-form-component
  2. merch-template.component
  3. merch.component
  4. profile.component
  5. MerchRestController.java
