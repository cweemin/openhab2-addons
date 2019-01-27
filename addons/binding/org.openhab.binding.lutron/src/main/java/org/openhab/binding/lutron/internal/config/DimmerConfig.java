/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.lutron.internal.config;

import java.math.BigDecimal;

/**
 * Configuration settings for a {@link org.openhab.binding.lutron.internal.handler.DimmerHandler}.
 *
 * @author Allan Tong - Initial contribution
 */
public class DimmerConfig {
    private static final int DEFAULT_FADE = 1;

    private int integrationId;
    private BigDecimal fadeInTime = new BigDecimal(DEFAULT_FADE);
    private BigDecimal fadeOutTime = new BigDecimal(DEFAULT_FADE);

    public int getIntegrationId() {
        return this.integrationId;
    }

    public void setIntegrationId(int integrationId) {
        this.integrationId = integrationId;
    }

    public BigDecimal getFadeInTime() {
        return this.fadeInTime;
    }

    public void setFadeInTime(BigDecimal fadeInTime) {
        this.fadeInTime = fadeInTime;
    }

    public BigDecimal getFadeOutTime() {
        return this.fadeOutTime;
    }

    public void setFadeOutTime(BigDecimal fadeOutTime) {
        this.fadeOutTime = fadeOutTime;
    }
}
