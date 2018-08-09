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
 * The {@link EnvisalinkBridgeConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author WeeMin Chan - Initial contribution
 */

public class EnvisalinkBridgeConfiguration {

    public final static String IP_ADDRESS = "ipAddress";
    /**
     * The IP address of the Envisalink Ethernet TCP interface
     */
    public String ipAddress;

    /**
     * The port number of the Envisalink Ethernet TCP interface
     */
    public Integer port;

    /**
     * The password of the Envisalink Ethernet TCP interface
     */
    public String password;

    /**
     * The Socket connection timeout for the Envisalink Ethernet TCP interface
     */
    public Integer connectionTimeout;

    /**
     * The Panel Poll Period. Can be set in range 1-15 minutes. Default is 1 minute;
     */

    public Integer pollPeriod;
}
