/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.MongoDBResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.MongoDBDatabaseGetResults;
import java.util.List;
import rx.Completable;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.ThroughputSettingsGetResults;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.ThroughputSettingsUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.MongoDBCollectionGetResults;

class MongoDBResourcesImpl extends WrapperImpl<MongoDBResourcesInner> implements MongoDBResources {
    private final CosmosDBManager manager;

    MongoDBResourcesImpl(CosmosDBManager manager) {
        super(manager.inner().mongoDBResources());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public MongoDBDatabaseGetResultsImpl defineMongodbDatabasis(String name) {
        return wrapMongodbDatabasisModel(name);
    }

    @Override
    public MongoDBCollectionGetResultsImpl defineCollection(String name) {
        return wrapCollectionModel(name);
    }

    private MongoDBDatabaseGetResultsImpl wrapMongodbDatabasisModel(String name) {
        return new MongoDBDatabaseGetResultsImpl(name, this.manager());
    }

    private MongoDBCollectionGetResultsImpl wrapCollectionModel(String name) {
        return new MongoDBCollectionGetResultsImpl(name, this.manager());
    }

    private MongoDBDatabaseGetResultsImpl wrapMongoDBDatabaseGetResultsModel(MongoDBDatabaseGetResultsInner inner) {
        return  new MongoDBDatabaseGetResultsImpl(inner, manager());
    }

    private MongoDBCollectionGetResultsImpl wrapMongoDBCollectionGetResultsModel(MongoDBCollectionGetResultsInner inner) {
        return  new MongoDBCollectionGetResultsImpl(inner, manager());
    }

    private Observable<MongoDBDatabaseGetResultsInner> getMongoDBDatabaseGetResultsInnerUsingMongoDBResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "mongodbDatabases");
        MongoDBResourcesInner client = this.inner();
        return client.getMongoDBDatabaseAsync(resourceGroupName, accountName, databaseName);
    }

    private Observable<MongoDBCollectionGetResultsInner> getMongoDBCollectionGetResultsInnerUsingMongoDBResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "mongodbDatabases");
        String collectionName = IdParsingUtils.getValueFromIdByName(id, "collections");
        MongoDBResourcesInner client = this.inner();
        return client.getMongoDBCollectionAsync(resourceGroupName, accountName, databaseName, collectionName);
    }

    @Override
    public Observable<MongoDBDatabaseGetResults> getMongoDBDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        MongoDBResourcesInner client = this.inner();
        return client.getMongoDBDatabaseAsync(resourceGroupName, accountName, databaseName)
        .flatMap(new Func1<MongoDBDatabaseGetResultsInner, Observable<MongoDBDatabaseGetResults>>() {
            @Override
            public Observable<MongoDBDatabaseGetResults> call(MongoDBDatabaseGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((MongoDBDatabaseGetResults)wrapMongoDBDatabaseGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<MongoDBDatabaseGetResults> listMongoDBDatabasesAsync(String resourceGroupName, String accountName) {
        MongoDBResourcesInner client = this.inner();
        return client.listMongoDBDatabasesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<MongoDBDatabaseGetResultsInner>, Observable<MongoDBDatabaseGetResultsInner>>() {
            @Override
            public Observable<MongoDBDatabaseGetResultsInner> call(List<MongoDBDatabaseGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MongoDBDatabaseGetResultsInner, MongoDBDatabaseGetResults>() {
            @Override
            public MongoDBDatabaseGetResults call(MongoDBDatabaseGetResultsInner inner) {
                return wrapMongoDBDatabaseGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteMongoDBDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        MongoDBResourcesInner client = this.inner();
        return client.deleteMongoDBDatabaseAsync(resourceGroupName, accountName, databaseName).toCompletable();
    }

    @Override
    public Observable<ThroughputSettingsGetResults> getMongoDBDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName) {
        MongoDBResourcesInner client = this.inner();
        return client.getMongoDBDatabaseThroughputAsync(resourceGroupName, accountName, databaseName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> updateMongoDBDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName, ThroughputSettingsUpdateParameters updateThroughputParameters) {
        MongoDBResourcesInner client = this.inner();
        return client.updateMongoDBDatabaseThroughputAsync(resourceGroupName, accountName, databaseName, updateThroughputParameters)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> getMongoDBCollectionThroughputAsync(String resourceGroupName, String accountName, String databaseName, String collectionName) {
        MongoDBResourcesInner client = this.inner();
        return client.getMongoDBCollectionThroughputAsync(resourceGroupName, accountName, databaseName, collectionName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> updateMongoDBCollectionThroughputAsync(String resourceGroupName, String accountName, String databaseName, String collectionName, ThroughputSettingsUpdateParameters updateThroughputParameters) {
        MongoDBResourcesInner client = this.inner();
        return client.updateMongoDBCollectionThroughputAsync(resourceGroupName, accountName, databaseName, collectionName, updateThroughputParameters)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MongoDBCollectionGetResults> getMongoDBCollectionAsync(String resourceGroupName, String accountName, String databaseName, String collectionName) {
        MongoDBResourcesInner client = this.inner();
        return client.getMongoDBCollectionAsync(resourceGroupName, accountName, databaseName, collectionName)
        .flatMap(new Func1<MongoDBCollectionGetResultsInner, Observable<MongoDBCollectionGetResults>>() {
            @Override
            public Observable<MongoDBCollectionGetResults> call(MongoDBCollectionGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((MongoDBCollectionGetResults)wrapMongoDBCollectionGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<MongoDBCollectionGetResults> listMongoDBCollectionsAsync(String resourceGroupName, String accountName, String databaseName) {
        MongoDBResourcesInner client = this.inner();
        return client.listMongoDBCollectionsAsync(resourceGroupName, accountName, databaseName)
        .flatMap(new Func1<List<MongoDBCollectionGetResultsInner>, Observable<MongoDBCollectionGetResultsInner>>() {
            @Override
            public Observable<MongoDBCollectionGetResultsInner> call(List<MongoDBCollectionGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MongoDBCollectionGetResultsInner, MongoDBCollectionGetResults>() {
            @Override
            public MongoDBCollectionGetResults call(MongoDBCollectionGetResultsInner inner) {
                return wrapMongoDBCollectionGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteMongoDBCollectionAsync(String resourceGroupName, String accountName, String databaseName, String collectionName) {
        MongoDBResourcesInner client = this.inner();
        return client.deleteMongoDBCollectionAsync(resourceGroupName, accountName, databaseName, collectionName).toCompletable();
    }

}
