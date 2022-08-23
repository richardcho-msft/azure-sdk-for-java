// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Deployment Status. */
public final class DeploymentStatus extends ExpandableStringEnum<DeploymentStatus> {
    /** Static value NotStarted for DeploymentStatus. */
    public static final DeploymentStatus NOT_STARTED = fromString("NotStarted");

    /** Static value Deploying for DeploymentStatus. */
    public static final DeploymentStatus DEPLOYING = fromString("Deploying");

    /** Static value Deployed for DeploymentStatus. */
    public static final DeploymentStatus DEPLOYED = fromString("Deployed");

    /** Static value Failed for DeploymentStatus. */
    public static final DeploymentStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a DeploymentStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentStatus.
     */
    @JsonCreator
    public static DeploymentStatus fromString(String name) {
        return fromString(name, DeploymentStatus.class);
    }

    /**
     * Gets known DeploymentStatus values.
     *
     * @return known DeploymentStatus values.
     */
    public static Collection<DeploymentStatus> values() {
        return values(DeploymentStatus.class);
    }
}