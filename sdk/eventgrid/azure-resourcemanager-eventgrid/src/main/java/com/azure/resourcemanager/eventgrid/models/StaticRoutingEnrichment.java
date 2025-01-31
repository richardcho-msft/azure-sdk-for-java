// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Static routing enrichment details.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "valueType",
    defaultImpl = StaticRoutingEnrichment.class)
@JsonTypeName("StaticRoutingEnrichment")
@JsonSubTypes({ @JsonSubTypes.Type(name = "String", value = StaticStringRoutingEnrichment.class) })
@Fluent
public class StaticRoutingEnrichment {
    /*
     * Static routing enrichment key.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Creates an instance of StaticRoutingEnrichment class.
     */
    public StaticRoutingEnrichment() {
    }

    /**
     * Get the key property: Static routing enrichment key.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Static routing enrichment key.
     * 
     * @param key the key value to set.
     * @return the StaticRoutingEnrichment object itself.
     */
    public StaticRoutingEnrichment withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
