/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website.models;


/**
 * Domain availablility check result.
 */
public class DomainAvailablilityCheckResult {
    /**
     * Name of the domain.
     */
    private String name;

    /**
     * If true then domain can be purchased using CreateDomain Api.
     */
    private Boolean available;

    /**
     * Domain type. Possible values include: 'Regular', 'SoftDeleted'.
     */
    private DomainType domainType;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the available value.
     *
     * @return the available value
     */
    public Boolean getAvailable() {
        return this.available;
    }

    /**
     * Set the available value.
     *
     * @param available the available value to set
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * Get the domainType value.
     *
     * @return the domainType value
     */
    public DomainType getDomainType() {
        return this.domainType;
    }

    /**
     * Set the domainType value.
     *
     * @param domainType the domainType value to set
     */
    public void setDomainType(DomainType domainType) {
        this.domainType = domainType;
    }

}
