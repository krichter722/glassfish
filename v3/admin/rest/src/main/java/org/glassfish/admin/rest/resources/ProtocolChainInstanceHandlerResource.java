/**
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
* Copyright 2009 Sun Microsystems, Inc. All rights reserved.
* Generated code from the com.sun.enterprise.config.serverbeans.*
* config beans, based on  HK2 meta model for these beans
* see generator at org.admin.admin.rest.GeneratorResource
* date=Tue Jul 28 17:11:42 PDT 2009
* Very soon, this generated code will be replace by asm or even better...more dynamic logic.
* Ludovic Champenois ludo@dev.java.net
*
**/
package org.glassfish.admin.rest.resources;
import com.sun.enterprise.config.serverbeans.*;
import javax.ws.rs.*;
import org.glassfish.admin.rest.TemplateResource;
import org.glassfish.admin.rest.provider.GetResult;
import com.sun.grizzly.config.dom.ProtocolChainInstanceHandler;
public class ProtocolChainInstanceHandlerResource extends TemplateResource<ProtocolChainInstanceHandler> {

public String[][] getCommandResourcesPaths() {
return new String[][]{};
}

	@Path("protocol-chain/")
	public ProtocolChainResource getProtocolChainResource() {
		ProtocolChainResource resource = resourceContext.getResource(ProtocolChainResource.class);
		resource.setEntity(getEntity().getProtocolChain() );
		return resource;
	}
}
