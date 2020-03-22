

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator_JSP</title>
    <style>
        body {
                background-color:#AFA;
            }
            #box {
                position: absolute;
                top: 50%;
                left: 50%;
                margin: -90px 0 0 -190px;
                width: 360px;
                height: 150px;
                border: outset 6px green;
                background-color: #AAA;
                padding:10px;
               
            }
            table {
                width: 100%;
                height: 100%;
                border: solid red 1px;
            }
<!-- центрирование текста в полях и кнопках -->      
            td {
                text-align: center;                 
            }
        </style>
    </head>
    <body>
         <div id ="box">
            <form action="CalcServl" method="Get">
               <table>
                   <tr>
               <td> <input type="text" name="addP1" size="20"/>  </td>
               <td> <input type="text" name="addP2" size="20"/>  </td>
                </tr>
                <tr>
               <td> <input type="submit" name="add_button" value="Сложить"/> </td>
               <td> <input type="reset" value="Очистить"/> </td>
                </tr>
                 </table>
            </form>              

            <form action="CalcServl" method="Post">
                 <table>
                   <tr>
               <td> <input type="text" name="multp1" size="20"/>  </td>
                <td> <input type="text" name="multp2" size="20"/>  </td>
                 </tr>
                <tr>
                <td> <input type="submit" name="multy_button" value="Умножить"/> </td>
                <td> <input type="reset"  value="Очистить"/> </td>
            </tr>
                 </table>
            </form>              
<!-- Вывод результата в строке -->
        <% String result = (String)request.getAttribute("result");
        if (result != null)
        out.println("<h2>"+ result +"</h2>");
    
    %>
    </body>
</html>
