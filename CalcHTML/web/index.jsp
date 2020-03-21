<%-- 
    Document   : index
    Created on : Mar 18, 2020, 9:27:48 PM
    Author     : Ксюшонок
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>_CALCULATOR_</title>
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
            td {
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div id="box">
            <form name="add" action="CalcServlet" method="POST">
                <table> 
                    <tr>
                        <td><input type="text" name="n1" size="12"></td>
                        <td><input type="text" name="n2" size="12"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="b1" value="Сложить"/></td>
                        <td><input type="submit" name="b2" value="Очистить"/>   
                        </td>
                    </tr>
                </table>
            </form>
            <form name="mult" action="CalcServlet" method="POST">
                <table> 
                    <tr>
                        <td><input type="text" name="n1" size="12"></td>
                        <td><input type="text" name="n2" size="12"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="b1" value="Умножить"/>      
                        </td>
                        <td>
                            <input type="submit" name="b2" value="Очистить"/>   
                        </td>
                    </tr>
                </table>
            </form>
<!--            JSP code: shows result if it is present. -->          
            <%String result = (String) request.getAttribute("result");
                    if (result != null){
                        out.println("<h2>" + result + "</h2>");
                    }
            %>
        </div>
    </body>
</html>