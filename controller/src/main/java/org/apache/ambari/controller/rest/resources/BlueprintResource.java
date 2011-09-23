package org.apache.ambari.controller.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.apache.ambari.common.rest.entities.Blueprint;

/** BlueprintResource represents a Hadoop blueprint to be installed on a 
 *  cluster. Blueprints define a collection of Hadoop components that are
 *  installed together on a cluster and their configuration.
 */
@Path(value = "/blueprints/{blueprintName}")
public class BlueprintResource {
	
	/** Get a blueprint
	 * 
	 *  <p>
	 *  REST:<br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;URL Path                                    : /blueprints/{blueprintName}<br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;HTTP Method                                 : GET <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;HTTP Request Header	                        : <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Content-type        = application/json <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Accept              = application/json <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;HTTP Response Header                        : <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Content-type        = application/json <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Accept              = application/json <br>
	 *  <p> 
	 *  
	 * 	@param	blueprintName	Name of the blueprint
         *      @param  revision        The optional blueprint revision to get
	 * 	@return			blueprint definition
	 * 	@throws	Exception	throws Exception (TBD)
     */
    @GET
	@Produces({"application/json", "application/xml"})
      public Blueprint getBlueprint(@PathParam("blueprintName") String blueprintName, 
                                    @QueryParam("revision") int revision) throws Exception {
      return null;
	}
    
    /* 
     * Delete blueprint
     */
    /** Delete the blueprint
     * 
     *  <p>
	 *  REST:<br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;URL Path                                    : /blueprints/{blueprintName}<br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;HTTP Method                                 : DELETE <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;HTTP Request Header	                        : <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Content-type        = application/json <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Accept              = application/json <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;HTTP Response Header                        : <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Content-type        = application/json <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Accept              = application/json <br>
	 *  <p> 
	 *  
     * @param stackName		Name of the Hadoop stack
     * @throws Exception	throws Exception (TBD)
     */
    @DELETE
	@Consumes({"application/json", "application/xml"})
	public void deleteBlueprint(@PathParam("blueprintName") String blueprintName) throws Exception {
	}
    
    /** Update a current blueprint.
     *  <p>
     * 	Updates a current blueprint to update some of its fields.
     *  <p>
	 *  REST:<br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;URL Path                                    : /blueprints/{blueprintName}<br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;HTTP Method                                 : PUT <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;HTTP Request Header	                        : <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Content-type        = application/json <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Accept              = application/json <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;HTTP Response Header                        : <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Content-type        = application/json <br>
	 *  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Accept              = application/json <br>
	 *  <p> 
     * 
     * @param blueprintName		Name of the blueprint
     * @param blueprint			Input blueprint object specifying the blueprint definition
     * @return					Returns the new revision of the blueprint
     * @throws Exception		throws Exception
     */
    @Path(value = "/blueprints/{blueprintName}")
    @PUT
    @Consumes
    public Blueprint updateBlueprint(@PathParam("blueprintName") String blueprintName, Blueprint blueprint) throws Exception {
    	return null;
    }
    
}