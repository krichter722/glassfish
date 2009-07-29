/**
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
* Copyright 2009 Sun Microsystems, Inc. All rights reserved.
* Generated code from the com.sun.enterprise.config.serverbeans.*
* config beans, based on  HK2 meta model for these beans
* see generator at org.admin.admin.rest.GeneratorResource
* date=Tue Jul 28 17:11:44 PDT 2009
* Very soon, this generated code will be replace by asm or even better...more dynamic logic.
* Ludovic Champenois ludo@dev.java.net
*
**/
package org.glassfish.admin.rest.resources;
import com.sun.enterprise.config.serverbeans.*;
import javax.ws.rs.*;
import java.util.List;
import org.glassfish.admin.rest.TemplateListOfResource;
import org.glassfish.admin.rest.provider.GetResultList;
import com.sun.enterprise.config.serverbeans.Application;
public class ListApplicationResource extends TemplateListOfResource<Application> {


	@Path("{Name}/")
	public ApplicationResource getApplicationResource(@PathParam("Name") String id) {
		ApplicationResource resource = resourceContext.getResource(ApplicationResource.class);
		for (Application c: entity){
			if(c.getName().equals(id)){
				resource.setEntity(c);
			}
		}
		return resource;
	}

@Path("commands/deploy")
@POST
@Produces({javax.ws.rs.core.MediaType.TEXT_HTML, javax.ws.rs.core.MediaType.APPLICATION_JSON, javax.ws.rs.core.MediaType.APPLICATION_XML})
public org.glassfish.admin.rest.provider.GetResultList execDeploy(
	 @QueryParam("name")  @DefaultValue("")  String Name 
 ,
	 @QueryParam("contextroot")  @DefaultValue("")  String Contextroot 
 ,
	 @QueryParam("virtualservers")  @DefaultValue("")  String Virtualservers 
 ,
	 @QueryParam("libraries")  @DefaultValue("")  String Libraries 
 ,
	 @QueryParam("force")  @DefaultValue("false")  String Force 
 ,
	 @QueryParam("precompilejsp")  @DefaultValue("false")  String Precompilejsp 
 ,
	 @QueryParam("verify")  @DefaultValue("false")  String Verify 
 ,
	 @QueryParam("retrieve")  @DefaultValue("")  String Retrieve 
 ,
	 @QueryParam("dbvendorname")  @DefaultValue("")  String Dbvendorname 
 ,
	 @QueryParam("createtables")  @DefaultValue("")  String Createtables 
 ,
	 @QueryParam("dropandcreatetables")  @DefaultValue("")  String Dropandcreatetables 
 ,
	 @QueryParam("uniquetablenames")  @DefaultValue("")  String Uniquetablenames 
 ,
	 @QueryParam("deploymentplan")  @DefaultValue("")  String Deploymentplan 
 ,
	 @QueryParam("enabled")  @DefaultValue("true")  String Enabled 
 ,
	 @QueryParam("generatermistubs")  @DefaultValue("false")  String Generatermistubs 
 ,
	 @QueryParam("availabilityenabled")  @DefaultValue("false")  String Availabilityenabled 
 ,
	 @QueryParam("target")  @DefaultValue("")  String Target 
 ,
	 @QueryParam("keepreposdir")  @DefaultValue("false")  String Keepreposdir 
 ,
	 @QueryParam("logReportedErrors")  @DefaultValue("true")  String LogReportedErrors 
 ,
	 @QueryParam("path")  @DefaultValue("")  String Path 
 ,
	 @QueryParam("description")  @DefaultValue("")  String Description 
 ,
	 @QueryParam("properties")  @DefaultValue("")  String Properties 
 ,
	 @QueryParam("property")  @DefaultValue("")  String Property 
 ,
	 @QueryParam("type")  @DefaultValue("")  String Type 
 	) {
	java.util.Properties p = new java.util.Properties();
	p.put("name", Name);
	p.put("contextroot", Contextroot);
	p.put("virtualservers", Virtualservers);
	p.put("libraries", Libraries);
	p.put("force", Force);
	p.put("precompilejsp", Precompilejsp);
	p.put("verify", Verify);
	p.put("retrieve", Retrieve);
	p.put("dbvendorname", Dbvendorname);
	p.put("createtables", Createtables);
	p.put("dropandcreatetables", Dropandcreatetables);
	p.put("uniquetablenames", Uniquetablenames);
	p.put("deploymentplan", Deploymentplan);
	p.put("enabled", Enabled);
	p.put("generatermistubs", Generatermistubs);
	p.put("availabilityenabled", Availabilityenabled);
	p.put("target", Target);
	p.put("keepreposdir", Keepreposdir);
	p.put("logReportedErrors", LogReportedErrors);
	p.put("path", Path);
	p.put("description", Description);
	p.put("properties", Properties);
	p.put("property", Property);
	p.put("type", Type);
	org.glassfish.api.ActionReport ar = org.glassfish.admin.rest.RestService.habitat.getComponent(org.glassfish.api.ActionReport.class);
	org.glassfish.api.admin.CommandRunner cr = org.glassfish.admin.rest.RestService.habitat.getComponent(org.glassfish.api.admin.CommandRunner.class);
	cr.doCommand("deploy", p, ar);
	System.out.println("exec command =" + ar.getActionExitCode());
	return get(1);
}
public String[][] getCommandResourcesPaths() {
return new String[][]{};
}


public String getPostCommand() {
	return "deploy";
}
}
