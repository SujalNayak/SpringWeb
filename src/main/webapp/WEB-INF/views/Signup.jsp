<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>signuppp</h1>

  <form action ="saveuser" method="post">

   FirstName:<input type="text" name ="firstName"/><br><br>
    Email:<input type="text" name="email"/><br><br>
    Password:<input type="text" name="password"/><br><br>
    
  Gender:<input type="radio" name="gender" value="male"> Male
  <input type="radio" name="gender" value="female"> Female
  <input type="radio" name="gender" value="other"> Other
  <br><br>

  
  City:<select name="city">
    <option value="">Select city</option>
    <option value="New York">New York</option>
    <option value="London">London</option>
    <option value="Tokyo">Tokyo</option>
  </select>
  <br><br>

 
  Hobby:<input type="checkbox" name="hobby" value="reading"> Reading
  <input type="checkbox" name="hobby" value="sports"> Sports
  <input type="checkbox" name="hobby" value="music"> Music
  <br><br>
    
    
    
    
    <input type="submit" value="signup"/>

    </form>

<br><br> <a href="login">login</a>

</body>
</html>