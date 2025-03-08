Create Dynamic Web Project

1. Class need to extends HttpServlet
	there should be methos name Service(HttpServletRequest req, HttpServletResponse res)
	HttpServletRequest req, HttpServletResponse res are interfaces implementation Done by Tom Cat
	As Service is part of Servlet Lifecycle

click --> request to Tom cat --> look for --> web.xml(confugration)
(
<servlet>
<servlet-name>abc</servlet-name>
<servlet-class>com.mkr.AddServlet</servlet-class>
</servlet>

<servlet-mapping>
<servlet-name>abc</servlet-name>
<url-pattern>/add</url-pattern>
</servlet-mapping>
)
 --> Response on page -->res.getWriter().println(k);


2. Http Protocal
	-->doPost --> only post requests
	-->doGet

3. call servlet from servlet 
	--> Request dispatcher and redirect
	--> Add data in reqest object
4. Redirect
	--> URl Rewriting
5. Session Management 
6. Session Cookie
	-->HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
		session.setAttribute("k", k);
7. context Params
	--> Servlet config -->one for each Servlet
	--> Servlet context --> one for whole

8. Servlet Annotation configuration
	-->@WebServlet("/add")

9.JSP --> Java Server Pages
	--> <% written between these tags goes into service Method %>(Scriptlet tag)
	--> <%! Declarative Tag %> goes out side the service method
	--> <%@ Declarative Tag %> To import packages
	-->  <%= Expression Tag %>

10. JSP Directive
	-->@page
	-->@nclude
	-->@taglib
11. Object 
	--> Request
	-->Response
	--> PageContext
	--> Out
	--> Session
	--> Application
	-->Config
12. Exception Handling --> errorPage
13. JSP JDBC
14. expression language --> ${AttributeName}
15.JSTL (Java Server Pages Standard Tag Library) in Java (
			<c:if test="${user != null}">
    			Welcome ${user}
			</c:if>
			)
16. using object in JSP need to use beans(getters and setters)
17. SQL Tags --> <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/sql" %>
18.Functional Tags --> ex : length of string
19. Filters -->Filter Chaining
20. Session > cookies
	--> HttpSession
21. cache