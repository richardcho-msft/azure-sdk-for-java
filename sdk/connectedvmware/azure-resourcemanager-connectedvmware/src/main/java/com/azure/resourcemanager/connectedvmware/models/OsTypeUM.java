// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OsTypeUM. */
public final class OsTypeUM extends ExpandableStringEnum<OsTypeUM> {
    /** Static value Windows for OsTypeUM. */
    public static final OsTypeUM WINDOWS = fromString("Windows");

    /** Static value Linux for OsTypeUM. */
    public static final OsTypeUM LINUX = fromString("Linux");

    /**
     * Creates or finds a OsTypeUM from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OsTypeUM.
     */
    @JsonCreator
    public static OsTypeUM fromString(String name) {
        return fromString(name, OsTypeUM.class);
    }

    /**
     * Gets known OsTypeUM values.
     *
     * @return known OsTypeUM values.
     */
    public static Collection<OsTypeUM> values() {
        return values(OsTypeUM.class);
    }
}