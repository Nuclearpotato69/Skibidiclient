package skibidi.client;

import skibidi.client.modules.*;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Example");

    @Override
    public void onInitialize() {
        LOG.info("Initializing SkibidiClient");

        // Modules
        Modules.get().add(new AntiAim());
        Modules.get().add(new BetterSkibidiSign());
        Modules.get().add(new SKibidiDmSpam());
        Modules.get().add(new SkibidiStrike());
        Modules.get().add(new HandOfSkibidi());

        // Commands

    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "skibidi.client";
    }
}
