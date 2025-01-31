// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResearchStudyArm model.
 */
@Fluent
public final class ResearchStudyArm {

    /*
     * Label for study arm
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * Categorization of study arm
     */
    @Generated
    @JsonProperty(value = "type")
    private FhirR4CodeableConcept type;

    /*
     * Short explanation of study path
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of ResearchStudyArm class.
     *
     * @param name the name value to set.
     */
    @Generated
    @JsonCreator
    public ResearchStudyArm(@JsonProperty(value = "name") String name) {
        this.name = name;
    }

    /**
     * Get the name property: Label for study arm.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the type property: Categorization of study arm.
     *
     * @return the type value.
     */
    @Generated
    public FhirR4CodeableConcept getType() {
        return this.type;
    }

    /**
     * Set the type property: Categorization of study arm.
     *
     * @param type the type value to set.
     * @return the ResearchStudyArm object itself.
     */
    @Generated
    public ResearchStudyArm setType(FhirR4CodeableConcept type) {
        this.type = type;
        return this;
    }

    /**
     * Get the description property: Short explanation of study path.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Short explanation of study path.
     *
     * @param description the description value to set.
     * @return the ResearchStudyArm object itself.
     */
    @Generated
    public ResearchStudyArm setDescription(String description) {
        this.description = description;
        return this;
    }
}
