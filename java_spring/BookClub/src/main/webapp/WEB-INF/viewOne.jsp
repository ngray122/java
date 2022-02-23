<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!-- c:out ; c:forEach ; c:if -->
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

      <!DOCTYPE html>
      <html>

      <head>
        <meta charset="UTF-8">
        <title>Book Club</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="/css/style.css">
        <script type="text/javascript" src="/js/app.js"></script>
      </head>

      <body class="container text-center">

        <div class="card mt-3 p-3">

          <div class="card-body m-3">
            <c:choose>
              <c:when test='${idOfSession == singleBook.user.id}'>
                <h1 class="card-text"><span class="text-danger">${singleBook.user.name} </span>read <span class="text-primary">${singleBook.title}</span> by <span class="text-success">${singleBook.author}</span>,</h1>
                <h3>${singleBook.user.name}'s thoughts on the book:</h3>
                <p>${singleBook.thoughts}</p>
              </c:when>

              <c:when test='${idOfSession != singleBook.user.id}'>
                <h1>${singleBook.title}</h1>
                <h3>Written By: ${singleBook.author}</h3>
                <p>My thoughts: ${singleBook.thoughts}</p>

              </c:when>
            </c:choose>

            <c:if test='${idOfSession == singleBook.user.id}'>
              <a href="/books/delete/${bookObj.id}" class="btn btn-dark">Delete</a>
              <a href="/books/edit/${id}" class="btn btn-dark">Edit</a></td>
            </c:if>
            <a href="/home" class="btn btn-dark">Bookshelf</a>

          </div>
        </div>
      </body>

      </html>

      </body>

      </html>