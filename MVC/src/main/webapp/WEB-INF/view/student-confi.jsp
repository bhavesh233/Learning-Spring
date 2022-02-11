<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>HELLO WORLD INPUT</title>
</head>
<body>

  <br>

 Student firstName: ${student.firstName}
 <br><br>
 Student lastName : ${student.lastName}
 <br><br>
 Student country : ${student.country}
 <br><br>
 Student favoriteLanguage: ${student.favoriteLanguage}
 <br><br>
 Student operatingSystems:
<ul>
	<c:forEach var="temp" items=" ${student.operatingSystems}">
		<li> ${temp}</li>
	</c:forEach>
</ul>



</body>
</html>