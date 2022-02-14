<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


        <!DOCTYPE html>
        <html>

        <head>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            <meta charset="UTF-8">
            <title>Omikuji</title>
        </head>

        <body>
            <div class="container">
                <h1>Send an Omikuji!</h1>
                <form class="m-3" method="POST" action="/submitForm">
                    <div class="form-group">
                        <label for="num">Pick a number between 5 and 15:</label>
                        <input type="number" class="form-control" name="num">
                    </div>
                    <div class="form-group">
                        <label for="city">Enter the name of any city:</label>
                        <input type="text" class="form-control" name="city">
                    </div>
                    <div class="form-group">
                        <label for="name">Enter full name:</label>
                        <input type="text" class="form-control" name="name">
                    </div>
                    <div class="form-group">
                        <label for="hobby">Enter profession or hobby:</label>
                        <input type="text" class="form-control" name="hobby">
                    </div>
                    <div class="form-group">
                        <label for="thing">Enter any type of living thing:</label>
                        <input type="text" class="form-control" name="thing">
                    </div>
                    <div class="form-group">
                        <label for="enterTextArea">Say something nice to someone:</label>
                        <textarea type="text" class="form-control" name="enterTextArea" rows="5"></textarea>
                    </div>
                  
                    <button type="submit" class="btn btn-primary m-3">Submit</button>
                </form>



            </div>



        </body>

        </html>