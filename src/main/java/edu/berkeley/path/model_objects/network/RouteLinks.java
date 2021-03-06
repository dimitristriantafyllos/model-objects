/**
 * Copyright (c) 2012, Regents of the University of California
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *   Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *   Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 **/

package edu.berkeley.path.model_objects.network;

import edu.berkeley.path.model_objects.jaxb.CrudFlag;
import edu.berkeley.path.model_objects.jaxb.LinkReference;
import edu.berkeley.path.model_objects.jaxb.LinkReferences;

import java.util.List;
import java.util.ArrayList;

/** Route class
* @author Matthew Juhn (mnjuhn@berkeley.edu)
*/
public class RouteLinks extends edu.berkeley.path.model_objects.jaxb.RouteLinks {

    /**
     * Return id of route link
     *
     * @return id of route link as long
     */
    @Override
    public long getId() {
        return super.getId();
    }

    /**
     * Set id of route link
     *
     * @param id of route link
     */
    @Override
    public void setId(long id) {
        super.setId(id);
    }

    /**
     * Get CRUD (Create, Retrieve, Update, Delete) Action Flag for object
     *
     * @return CRUD Flag enumeration
     */
    @Override
    public CrudFlag getCrudFlag() {
        // Check if CRUDFlag is null, if so return NONE enumeration
        if (super.getCrudFlag() == null) {
            return CrudFlag.NONE;
        }
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
     * Gets the value of the modStamp property.
     *
     * @return String representation of mod-stamp
     */
    @Override
    public String getModStamp() {
        return super.getModStamp();
    }

    /**
     * Sets the value of the modStamp property.
     *
     * @param String value of database mod-stamp
     */
    @Override
    public void setModStamp(String value) {
        this.modStamp = value;
    }

    /**
     * Return order of route link
     *
     * @return order of route link as long
     */
    @Override
    public long getLinkOrder() {
        return super.getLinkOrder();
    }

    /**
     * Set order of route link
     *
     * @param order of route link
     */
    @Override
    public void setLinkOrder(long order) {
        super.setLinkOrder(order);
    }

    /**
     * Return id of link reference
     *
     * @return id of link reference as Long
     */
    public Long getLinkReferenceId() {
        Long id = null;
        if (getLinkReferences() != null) {
            List<LinkReference> linkRef = getLinkReferences().getLinkReference();
            if (linkRef.size() > 0) {
                id = linkRef.get(0).getId();
            }
        }
        return id;
    }

    /**
     * Set id of link
     *
     * @param id of link reference
     */
    public void setLinkReferenceId(Long id) {
        // define Link reference
        LinkReference linkRef = new LinkReference();
        linkRef.setId(id);
        LinkReferences linkRefs = new LinkReferences();

        // Set link reference defined above
        linkRefs.getLinkReference().add(linkRef);

        // add link reference object
        setLinkReferences(linkRefs);
    }
}