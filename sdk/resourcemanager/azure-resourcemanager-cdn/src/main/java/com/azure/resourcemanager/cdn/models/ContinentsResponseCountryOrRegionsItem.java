// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContinentsResponseCountryOrRegionsItem model. */
@Fluent
public final class ContinentsResponseCountryOrRegionsItem {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The continentId property.
     */
    @JsonProperty(value = "continentId")
    private String continentId;

    /** Creates an instance of ContinentsResponseCountryOrRegionsItem class. */
    public ContinentsResponseCountryOrRegionsItem() {
    }

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the ContinentsResponseCountryOrRegionsItem object itself.
     */
    public ContinentsResponseCountryOrRegionsItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the continentId property: The continentId property.
     *
     * @return the continentId value.
     */
    public String continentId() {
        return this.continentId;
    }

    /**
     * Set the continentId property: The continentId property.
     *
     * @param continentId the continentId value to set.
     * @return the ContinentsResponseCountryOrRegionsItem object itself.
     */
    public ContinentsResponseCountryOrRegionsItem withContinentId(String continentId) {
        this.continentId = continentId;
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
