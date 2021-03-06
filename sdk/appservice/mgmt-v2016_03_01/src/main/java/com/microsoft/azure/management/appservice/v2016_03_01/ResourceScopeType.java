/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ResourceScopeType.
 */
public final class ResourceScopeType extends ExpandableStringEnum<ResourceScopeType> {
    /** Static value ServerFarm for ResourceScopeType. */
    public static final ResourceScopeType SERVER_FARM = fromString("ServerFarm");

    /** Static value Subscription for ResourceScopeType. */
    public static final ResourceScopeType SUBSCRIPTION = fromString("Subscription");

    /** Static value WebSite for ResourceScopeType. */
    public static final ResourceScopeType WEB_SITE = fromString("WebSite");

    /**
     * Creates or finds a ResourceScopeType from its string representation.
     * @param name a name to look for
     * @return the corresponding ResourceScopeType
     */
    @JsonCreator
    public static ResourceScopeType fromString(String name) {
        return fromString(name, ResourceScopeType.class);
    }

    /**
     * @return known ResourceScopeType values
     */
    public static Collection<ResourceScopeType> values() {
        return values(ResourceScopeType.class);
    }
}
