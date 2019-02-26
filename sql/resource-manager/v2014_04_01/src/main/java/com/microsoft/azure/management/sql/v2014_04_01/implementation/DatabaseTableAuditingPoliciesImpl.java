/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.DatabaseTableAuditingPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.sql.v2014_04_01.DatabaseTableAuditingPolicyListResult;
import com.microsoft.azure.management.sql.v2014_04_01.DatabaseTableAuditingPolicy;

class DatabaseTableAuditingPoliciesImpl extends WrapperImpl<DatabaseTableAuditingPoliciesInner> implements DatabaseTableAuditingPolicies {
    private final SqlManager manager;

    DatabaseTableAuditingPoliciesImpl(SqlManager manager) {
        super(manager.inner().databaseTableAuditingPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private DatabaseTableAuditingPolicyImpl wrapModel(DatabaseTableAuditingPolicyInner inner) {
        return  new DatabaseTableAuditingPolicyImpl(inner, manager());
    }

    private DatabaseTableAuditingPolicyImpl wrapModel(String name) {
        return new DatabaseTableAuditingPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<DatabaseTableAuditingPolicyListResult> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabaseTableAuditingPoliciesInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .map(new Func1<DatabaseTableAuditingPolicyListResultInner, DatabaseTableAuditingPolicyListResult>() {
            @Override
            public DatabaseTableAuditingPolicyListResult call(DatabaseTableAuditingPolicyListResultInner inner) {
                return new DatabaseTableAuditingPolicyListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DatabaseTableAuditingPolicy> getAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabaseTableAuditingPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .map(new Func1<DatabaseTableAuditingPolicyInner, DatabaseTableAuditingPolicy>() {
            @Override
            public DatabaseTableAuditingPolicy call(DatabaseTableAuditingPolicyInner inner) {
                return wrapModel(inner);
            }
       });
    }

}