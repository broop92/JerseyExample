package com.mkyong.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService 
{
	
	@GET
	public Response getMsg() 
	{
		String output = "Jersey says : Hello World" ;
		return Response.status(200).entity(output).build(); 
	} 
	
	@GET
	@Path("/{param}")
	public Response getName(@PathParam("param") String name) 
	{
		String output = "Jersey says : Hello " + name; 
		return Response.status(200).entity(output).build(); 
	} 

}
