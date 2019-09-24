<%-- 
    Document   : editNote
    Created on : Sep 20, 2019, 3:19:44 PM
    Author     : 778766
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <div>
            <form action="note" method="post">
                <b>Title:</b> <input type="text" name="lineOne" value="${note.firstLine}"><br>
                <br>
                <b>Contents:</b> 
                <textarea name="lineTwo" rows = "5" cols = "30">${note.secondLine}</textarea><br>
                <br>
                <input type="submit" value="save" name="save">
            </form>
        </div>
    </body>
</html>
