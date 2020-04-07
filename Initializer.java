/*package com.example.application;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer {

	@Override
	 public void onStartup(ServletContext container) throws ServletException {
	        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
	        ctx.setServletContext(container);
	        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
	        servlet.setLoadOnStartup(1);
	        servlet.addMapping("/");
	    }

	

 * this method is used for ViewConfig.Class
 
@Override
public void onStartup(ServletContext servletContext)throws ServletException
{
AnnotationConfigWebApplicationContext mvcContext = new AnnotationConfigWebApplicationContext();
mvcContext.register(ViewConfig.class);
mvcContext.refresh();
// Register and map the dispatcher servlet
ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(mvcContext));
dispatcher.setLoadOnStartup(1);
dispatcher.addMapping("/");
}
	
	
}*/