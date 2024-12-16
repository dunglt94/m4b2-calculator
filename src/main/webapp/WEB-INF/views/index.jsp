<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form method="post">
    <label><input type="text" name="operand1" value="${operand1}"></label>
    <label><input type="text" name="operand2" value="${operand2}"></label>
    <p></p>
    <button type="submit" name="operator" value="add">Addition(+)</button>
    <button type="submit" name="operator" value="subtract">Subtraction(-)</button>
    <button type="submit" name="operator" value="multiply">Multiplication(X)</button>
    <button type="submit" name="operator" value="divide">Division(/)</button>
</form>
<p>Result: <span>${result}</span></p>
</body>
</html>