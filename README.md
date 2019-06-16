# Spring boot - CRUD - GraphQL

### Start project

`./gradlew build -x test && docker-compose up --build`

### Create Author

```graphql
mutation {
  createAuthor(author:{
   	fullname: "Douglas Adams",
		email: "douglas.adams@hitchhiker.co.uk"
  }) {
    fullname,
  	email
  } 
}
```

### Find Author

##### Request

```graphql
query {
  findAuthor(email: "douglas.adams@hitchhiker.co.uk") {
    email
    fullname
    books {
      title
      isbn
    }
  }
}
```

##### Response
```json
{
  "data": {
    "findAuthor": {
      "email": "douglas.adams@hitchhiker.co.uk",
      "fullname": "Douglas Adams",
      "books": [
        {
          "title": "The hitchhiker's guide to the galaxy",
          "isbn": "09346259-348e-4a12-b908-d833d92d07f0"
        },
        {
          "title": "The Restaurant at the End of the Universe",
          "isbn": "4e10a8f9-014f-452a-8d2a-f82f56fd2b9e"
        },
        {
          "title": "So Long, and Thanks for All the Fish",
          "isbn": "5ac92f3b-5a9a-42eb-8f97-f3012708f389"
        }
      ]
    }
  }
}
```

#### Create Book

```graphql
mutation {
  createBook(email:"douglas.adams@hitchhiker.co.uk", book: {
    title: "Mostly Harmless",
    subject: "fiction"
  }) {
    title
    subject
  }
}
```

### Find Book

```graphql
query {
  findBook(isbn: "09346259-348e-4a12-b908-d833d92d07f0") {
    author {
      email
      fullname
    }
    title
  }
}

```
