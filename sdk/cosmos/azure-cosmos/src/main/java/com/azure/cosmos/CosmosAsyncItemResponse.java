// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos;

import com.azure.cosmos.implementation.Document;
import com.azure.cosmos.implementation.ResourceResponse;

public class CosmosAsyncItemResponse extends CosmosResponse<CosmosItemProperties>{
    private CosmosAsyncItem itemClient;

    CosmosAsyncItemResponse(ResourceResponse<Document> response, PartitionKey partitionKey, CosmosAsyncContainer container) {
        super(response);
        if(response.resourceAsString == null){
            super.setProperties(null);
        }else{
            CosmosItemProperties cip = new CosmosItemProperties(response.resourceAsString);
            super.setProperties(cip);
            itemClient = new CosmosAsyncItem(cip.getId(), partitionKey, container);
        }
    }

    /**
     * Gets the itemSettings
     * @return the itemSettings
     */
    public CosmosItemProperties getProperties() {
        return super.getProperties();
    }

    /**
     * Gets the CosmosAsyncItem
     * @return the cosmos item
     */
    public CosmosAsyncItem getItem() {
        return itemClient;
    }
}
