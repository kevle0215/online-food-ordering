<h3 align="center">Online Food Ordering Application</h3>

  <p align="center">
    Full-stack project implementing a SpringBoot backend RESTful API and MySQL database to store customer and restaurant information connected to a React, Redux, and Tailwind frontend. Features JWT Authentication for easy scalability and role-based access.
    <br />
    <a href="https://github.com/kevle0215/online-food-ordering/issues">Report Bug</a>
    ·
    <a href="https://github.com/kevle0215/online-food-ordering/issues">Request Feature</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
    <li><a href="#features">Features</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

### Built With
* Java/SpringBoot
  * Spring Security / JWT Authentication / Role-Based Access
  * yfinance
  * unittest/mock
* JavaScript
  * React
  * Redux
  * MUI
* HTML/CSS
  * Tailwind
* MySQL
* Stripe API Payment Integration

<!-- GETTING STARTED -->
## Getting Started
1. Clone the repo
   ```sh
   git clone https://github.com/kevle0215/online-food-ordering.git
   ```
2. Install NPM packages in the frontend (/online-food-ordering-frontend)
    ```
    npm install
    ```
3. Run the frontend with NPM 
   ```
   npm start
   ```
4. Run the backend with Spring
    ```
    mvn spring
    ```

<!-- Features -->
## Features

1. Login feature distinguishes between the roles of ```RESTAURANT_OWNER``` and ```CUSTOMER``` and implements JWT Authentication.
2. ```RESTAURANT_OWNER``` role has access to the admin panel where they can add restaurants, menu items, events, ingredients, and view their stock. They can also view orders that the ```CUSTOMER``` role has submitted to their restaurant.
3. ```CUSTOMER``` role has access to the customer panel where they can make orders linked to the Stripe payment gateway, add favorite restaurants, view open/closed restaurants, events, and the menus of each restaurant. 

<p align="right">(<a href="#readme-top">back to top</a>)</p>
