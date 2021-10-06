# Songr

## Feature Tasks

### Lab 11

- As you work on these feature tasks, remember to consider your basic application setup. What classes should you create? How should they be related?

1. Ensure that you can run the Spring app.
2. Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
3. Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
4. Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.
5. Create an Album class to act as a model in our app.
An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
6. Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)

### Lab 12

- Update your Album model so that it can be saved in a database.
- An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
- A user should be able to see information about all the albums on the site.
- A user should be able to add albums to the site.

## Setup

- Run the application via IntelliJ
- While the server is running
- Open a browser and navigate to the following routes:
  - `localhost:8080`
  - `localhost:8080/hello`
  - `localhost:8080/capitalize/insertTextHere`
  - `localhost:8080/albums`
  