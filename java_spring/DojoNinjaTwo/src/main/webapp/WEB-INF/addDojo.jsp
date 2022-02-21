<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                <div class="container">
                    <form:form action="/dojo/create" method="post" modelAttribute="dojo" class="m-3">
                        <h1>Add Dojo</h1>
                      <div>
                            <form:label path="name" class="form-label">Name:</form:label>
                            <form:errors path="name" class="text-danger"/>
                            <form:input path="name" class="form-control"/>
                        </div>
                
                        <input type="submit" value="Submit" class="btn btn-dark m-3"/>
                        <a href="/ninja/new" class="btn btn-dark">Add Ninja</a>
                    </form:form>


                    <table class="table m-4">
  
                        <thead>
                        
                          <tr class="table">
                      
                            <th scope="col"> Select a Dojo to view respective Ninja's</th>
                      
                          </tr>
                        </thead>
                        <tbody>
                          <c:forEach items='${ dojoWithNinja }' var='dojoObj'>
                            <tr class="table">
                              <td><a class="text-decoration-none text-black" href="/dojos/${dojoObj.id}">${dojoObj.name}</a></td>
                  
                    
                            </tr>
                      
                          </c:forEach>
                      
                        </tbody>
                      </table>
                  
                </div>

      

            </body>

            </html>