/*
 * Minecraft Forge
 * Copyright (c) 2016-2018.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.fml.common.event;

import net.minecraftforge.fml.ModContainer;

/**
 * Called before {@link PostRegistrationEvent} during mod startup.
 *
 * This is the first of three commonly called events during mod initialization.
 *
 * Recommended activities:
 * Setup your logging {@link #getModLog()}
 * Load any configuration data you might have {@link #getSuggestedConfigurationFile()}
 * Search for a version.properties file and load it {@link #getVersionProperties()}
 * Configure your {@link ModMetadata} programmatically {@link #getModMetadata()}
 * Discover parts of your mod by using annotation search {@link #getAsmData()}
 *
 * @see net.minecraftforge.fml.common.Mod.EventHandler for how to subscribe to this event
 * @author cpw
 */
public class FMLPreregistrationEvent extends ModLifecycleEvent
{
    public FMLPreregistrationEvent(final ModContainer container)
    {
        super(container);
    }
}