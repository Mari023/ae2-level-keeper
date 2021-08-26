package net.examplemod;

import appeng.core.AEConfig;
import appeng.items.tools.powered.powersink.AEBasePoweredItem;

public class ae2TestItem extends AEBasePoweredItem {
    public ae2TestItem() {
        super(AEConfig.instance().getWirelessTerminalBattery(), new Properties().stacksTo(1).tab(ExampleMod.EXAMPLE_TAB));
    }
}
