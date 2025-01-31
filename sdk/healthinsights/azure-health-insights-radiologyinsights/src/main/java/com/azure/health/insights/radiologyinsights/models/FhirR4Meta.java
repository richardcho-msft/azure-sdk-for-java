// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Metadata about a resource
 * Based on [FHIR Meta](https://www.hl7.org/fhir/R4/resource.html#Meta).
 */
@Fluent
public final class FhirR4Meta {

    /*
     * The version specific identifier, as it appears in the version portion of the URL. This value changes when the
     * resource is created, updated, or deleted.
     */
    @Generated
    @JsonProperty(value = "versionId")
    private String versionId;

    /*
     * When the resource last changed - e.g. when the version changed.
     */
    @Generated
    @JsonProperty(value = "lastUpdated")
    private String lastUpdated;

    /*
     * A uri that identifies the source system of the resource. This provides a minimal amount of Provenance
     * information that can be used to track or differentiate the source of information in the resource. The source may
     * identify another FHIR server, document, message, database, etc.
     */
    @Generated
    @JsonProperty(value = "source")
    private String source;

    /*
     * A list of profiles (references to [StructureDefinition](https://www.hl7.org/fhir/structuredefinition.html)
     * resources) that this resource claims to conform to. The URL is a reference to
     * [StructureDefinition.url](https://www.hl7.org/fhir/structuredefinition-definitions.html#StructureDefinition.url).
     */
    @Generated
    @JsonProperty(value = "profile")
    private List<String> profile;

    /*
     * Security labels applied to this resource. These tags connect specific resources to the overall security policy
     * and infrastructure.
     */
    @Generated
    @JsonProperty(value = "security")
    private List<FhirR4Coding> security;

    /*
     * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and
     * workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.
     */
    @Generated
    @JsonProperty(value = "tag")
    private List<FhirR4Coding> tag;

    /**
     * Creates an instance of FhirR4Meta class.
     */
    @Generated
    public FhirR4Meta() {
    }

    /**
     * Get the versionId property: The version specific identifier, as it appears in the version portion of the URL.
     * This value changes when the resource is created, updated, or deleted.
     *
     * @return the versionId value.
     */
    @Generated
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * Set the versionId property: The version specific identifier, as it appears in the version portion of the URL.
     * This value changes when the resource is created, updated, or deleted.
     *
     * @param versionId the versionId value to set.
     * @return the FhirR4Meta object itself.
     */
    @Generated
    public FhirR4Meta setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * Get the lastUpdated property: When the resource last changed - e.g. when the version changed.
     *
     * @return the lastUpdated value.
     */
    @Generated
    public String getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set the lastUpdated property: When the resource last changed - e.g. when the version changed.
     *
     * @param lastUpdated the lastUpdated value to set.
     * @return the FhirR4Meta object itself.
     */
    @Generated
    public FhirR4Meta setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get the source property: A uri that identifies the source system of the resource. This provides a minimal amount
     * of Provenance information that can be used to track or differentiate the source of information in the resource.
     * The source may identify another FHIR server, document, message, database, etc.
     *
     * @return the source value.
     */
    @Generated
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: A uri that identifies the source system of the resource. This provides a minimal amount
     * of Provenance information that can be used to track or differentiate the source of information in the resource.
     * The source may identify another FHIR server, document, message, database, etc.
     *
     * @param source the source value to set.
     * @return the FhirR4Meta object itself.
     */
    @Generated
    public FhirR4Meta setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the profile property: A list of profiles (references to
     * [StructureDefinition](https://www.hl7.org/fhir/structuredefinition.html) resources) that this resource claims to
     * conform to. The URL is a reference to
     * [StructureDefinition.url](https://www.hl7.org/fhir/structuredefinition-definitions.html#StructureDefinition.url).
     *
     * @return the profile value.
     */
    @Generated
    public List<String> getProfile() {
        return this.profile;
    }

    /**
     * Set the profile property: A list of profiles (references to
     * [StructureDefinition](https://www.hl7.org/fhir/structuredefinition.html) resources) that this resource claims to
     * conform to. The URL is a reference to
     * [StructureDefinition.url](https://www.hl7.org/fhir/structuredefinition-definitions.html#StructureDefinition.url).
     *
     * @param profile the profile value to set.
     * @return the FhirR4Meta object itself.
     */
    @Generated
    public FhirR4Meta setProfile(List<String> profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get the security property: Security labels applied to this resource. These tags connect specific resources to
     * the overall security policy and infrastructure.
     *
     * @return the security value.
     */
    @Generated
    public List<FhirR4Coding> getSecurity() {
        return this.security;
    }

    /**
     * Set the security property: Security labels applied to this resource. These tags connect specific resources to
     * the overall security policy and infrastructure.
     *
     * @param security the security value to set.
     * @return the FhirR4Meta object itself.
     */
    @Generated
    public FhirR4Meta setSecurity(List<FhirR4Coding> security) {
        this.security = security;
        return this;
    }

    /**
     * Get the tag property: Tags applied to this resource. Tags are intended to be used to identify and relate
     * resources to process and workflow, and applications are not required to consider the tags when interpreting the
     * meaning of a resource.
     *
     * @return the tag value.
     */
    @Generated
    public List<FhirR4Coding> getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: Tags applied to this resource. Tags are intended to be used to identify and relate
     * resources to process and workflow, and applications are not required to consider the tags when interpreting the
     * meaning of a resource.
     *
     * @param tag the tag value to set.
     * @return the FhirR4Meta object itself.
     */
    @Generated
    public FhirR4Meta setTag(List<FhirR4Coding> tag) {
        this.tag = tag;
        return this;
    }
}
