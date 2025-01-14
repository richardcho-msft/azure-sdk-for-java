// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.quantum.models.ProviderProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about an offering. A provider offering is an entity that offers Targets to run Azure Quantum Jobs. */
@Fluent
public final class ProviderDescriptionInner {
    /*
     * Unique provider's id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Provider's display name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * A list of provider-specific properties.
     */
    @JsonProperty(value = "properties")
    private ProviderProperties properties;

    /** Creates an instance of ProviderDescriptionInner class. */
    public ProviderDescriptionInner() {
    }

    /**
     * Get the id property: Unique provider's id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique provider's id.
     *
     * @param id the id value to set.
     * @return the ProviderDescriptionInner object itself.
     */
    public ProviderDescriptionInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Provider's display name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the properties property: A list of provider-specific properties.
     *
     * @return the properties value.
     */
    public ProviderProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: A list of provider-specific properties.
     *
     * @param properties the properties value to set.
     * @return the ProviderDescriptionInner object itself.
     */
    public ProviderDescriptionInner withProperties(ProviderProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
