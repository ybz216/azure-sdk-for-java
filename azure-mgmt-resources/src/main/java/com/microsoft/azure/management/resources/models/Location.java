/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Location information.
 */
public class Location {
    /**
     * Gets or sets the ID of the resource (/subscriptions/SubscriptionId).
     */
    private String id;

    /**
     * Gets or sets the subscription Id.
     */
    private String subscriptionId;

    /**
     * Gets or sets the location name.
     */
    private String name;

    /**
     * Gets or sets the display name of the location.
     */
    private String displayName;

    /**
     * Gets or sets the latitude of the location.
     */
    private String latitude;

    /**
     * Gets or sets the longitude of the location.
     */
    private String longitude;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the subscriptionId value.
     *
     * @return the subscriptionId value
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId value.
     *
     * @param subscriptionId the subscriptionId value to set
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

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
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Get the latitude value.
     *
     * @return the latitude value
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * Set the latitude value.
     *
     * @param latitude the latitude value to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Get the longitude value.
     *
     * @return the longitude value
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * Set the longitude value.
     *
     * @param longitude the longitude value to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
