<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Insert title here</title>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
                integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
                crossorigin="anonymous">
        </head>

        <body>
            <div class="container mx-3">
                <h1>Welcome, ${loggedInUser.name}!</h1>
                <h3>Pick a favorite read from everyone's shelf</h3>
                <a href="/books/new" class="btn btn-dark">Add a new Book</a>
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">ID#</th>
                            <th scope="col">Title</th>
                            <th scope="col">Author Name</th>
                            <th scope="col">Posted By</th>
                            <th scope="col">Actions</th>

                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach items='${ allBooks }' var='bookObj'>
                            <tr></tr>
                            <th scope="row">${bookObj.id}</th>
                            <td><a href="/books/detail/${bookObj.id}">${bookObj.title}</a></td>
                            <td>${bookObj.author}</td>
                            <td>${bookObj.user.name}</td>
                            <td> 
                            <c:if test='${loggedInUser.id == bookObj.user.id}'>
                                <a href="/books/delete/${bookObj.id}" class="btn btn-dark">Delete</a>
                                <a href="/books/edit/${bookObj.id}" class="btn btn-dark">Edit</a></td>
                            </c:if>
                                </tr>

                        </c:forEach>
              
                    </tbody>
                </table>
                <a href="/logout" class="btn btn-dark">Logout</a>
               

            </div>

        </body>

        </html>