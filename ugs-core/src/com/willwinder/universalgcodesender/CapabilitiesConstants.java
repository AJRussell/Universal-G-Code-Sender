/*
    Copyright 2018 Will Winder

    This file is part of Universal Gcode Sender (UGS).

    UGS is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    UGS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with UGS.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.willwinder.universalgcodesender;

/**
 * Constants for defining capabilities that a controller may support. The constants
 * may be added to a {@link Capabilities} object.
 *
 * @author Joacim Breiler
 */
public class CapabilitiesConstants {
    /**
     * A key for identifying if the hardware have support for jogging.
     */
    public static final String JOGGING = "JOGGING";

    /**
     * A key for identifying if the hardware have support for continuous jogging.
     */
    public static final String CONTINUOUS_JOGGING = "CONTINUOUS_JOGGING";

    /**
     * A key for identifying if the hardware have support for overrides
     */
    public static final String OVERRIDES = "OVERRIDES";
}
