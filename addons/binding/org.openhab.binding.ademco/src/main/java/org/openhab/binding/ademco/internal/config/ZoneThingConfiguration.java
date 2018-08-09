/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.ademco.internal.config;

/**
 * The {@link ZoneThingConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author WeeMin Chan - Initial contribution
 */

public class ZoneThingConfiguration {

    /**
     * The Zone Number. Can be in the range of 1-64. This is a required parameter for a zone.
     */

    public final static String ZONE_NUMBER = "zoneNumber";

    public Integer zoneNumber;
}
