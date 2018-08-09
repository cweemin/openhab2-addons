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
 * The {@link PartitionBridgeConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author WeeMin Chan - Initial contribution
 */

public class PartitionBridgeConfiguration {

    public final static String PARTITION_NUMBER = "partitionNumber";

    public int partitionNumber;
    public String userCode;
}
