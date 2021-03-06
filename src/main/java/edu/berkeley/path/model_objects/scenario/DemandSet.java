/**
 * Copyright (c) 2013 The Regents of the University of California.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the University nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package edu.berkeley.path.model_objects.scenario;

import java.util.ArrayList;
import java.util.List;

import edu.berkeley.path.model_objects.scenario.DemandProfile;
import edu.berkeley.path.model_objects.jaxb.CrudFlag;
import edu.berkeley.path.model_objects.jaxb.VehicleTypeOrder;

public class DemandSet extends edu.berkeley.path.model_objects.jaxb.DemandSet {

	 /**
	  * Get modstamp
	  * @return
	  */
	@Override
	public String getModStamp() {
        return modStamp;
    }
	
	/**
	 * Set modstamp
	 * @param value
	 */
	@Override
    public void setModStamp(String value) {
        this.modStamp = value;
    }
    
    /**
     * Check if this object is valid
     * @return
     */
	public Boolean isValid() { return true; }
	
	/**
	 * Set value by name
	 * @param Object_Parameter
	 * @
	 */
	public void setByName(Object_Parameter p) {
		
		if (p.name.compareToIgnoreCase("id") == 0 ) setId(p.intParam);
		else if (p.name.compareToIgnoreCase("description") == 0 ) setDescription(p.strParam);
		else if (p.name.compareToIgnoreCase("projectId") == 0 ) setProjectId(p.intParam);
		else if (p.name.compareToIgnoreCase("name") == 0 ) setName(p.strParam);	
		else if (p.name.compareToIgnoreCase("ModStamp") == 0 ) setModStamp(p.strParam);	
	}
	
	/**
	 * Get an array of all parameters
	 * 
	 * @return Object_Parameter array
	 */
	public Object_Parameter[] getAll() {
		
		Object_Parameter[] params = new Object_Parameter[6];
		
		params[0] = new Object_Parameter("id", getId(), 0.0F, null);
		params[1] = new Object_Parameter("description", 0, 0.0F, description);
		params[2] = new Object_Parameter("projectId", getProjectId(), 0.0F, null);
		params[3] = new Object_Parameter("name", 0, 0.0F, getName());
		params[4] = new Object_Parameter("ModStamp", 0, 0.0F, getModStamp());
		params[5] = new Object_Parameter("crud", getCrudFlag().ordinal(), 0.0F, null);
		
		Object_Parameter.setPositions(params);
		
		return params;

	}

	  /**
	   * Get CRUD (Create, Retrieve, Update, Delete) Action Flag for object
	   *
	   * @return CRUD Flag enumeration
	   */
	  @Override
	  public CrudFlag getCrudFlag() {
	    return super.getCrudFlag();
	  }

	  /**
	   * Set CRUD (Create, Retrieve, Update, Delete) Action Flag for object
	   *
	   * @param CRUD Flag enumeration
	   */
	  @Override
	  public void setCrudFlag(CrudFlag flag) {
	    super.setCrudFlag(flag);
	  }
	   /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	@Override
	public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the vehicleTypeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeOrder }
     *     
     */
    @Override
    public VehicleTypeOrder getVehicleTypeOrder() {
        return vehicleTypeOrder;
    }

    /**
     * Sets the value of the vehicleTypeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeOrder }
     *     
     */
    @Override
    public void setVehicleTypeOrder(VehicleTypeOrder value) {
        this.vehicleTypeOrder = value;
    }

	/**
	 * Get DemandProfile list
	 * @return DemandProfile list
	 */
    @SuppressWarnings("unchecked")
    public List<DemandProfile> getDemandProfileList() {
    	
        if (demandProfile == null) {
        	
        	demandProfile = new ArrayList<edu.berkeley.path.model_objects.jaxb.DemandProfile>();
        }
        return (List<DemandProfile>)(List<?>)this.demandProfile;
    }

    /**
     * Set DemandProfile list
     * @param DemandProfile list
     */
	@SuppressWarnings("unchecked")
	public void setDemandProfileList(List<DemandProfile> dpList) {

		if ( demandProfile == null ) {
			
		  demandProfile = new ArrayList<edu.berkeley.path.model_objects.jaxb.DemandProfile>();  
		}
		demandProfile.clear();
		demandProfile.addAll((List<edu.berkeley.path.model_objects.jaxb.DemandProfile>)(List<?>)dpList);
	}
	  
    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Override
    public long getProjectId() {   
            return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Override
    public void setProjectId(long value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    @Override
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    @Override
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getName() {
        if (name == null) {
            return "";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setName(String value) {
        this.name = value;
    }
    
    
}
