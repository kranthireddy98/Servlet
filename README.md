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

4. Session Management 
