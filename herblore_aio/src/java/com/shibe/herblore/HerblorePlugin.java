package java.com.shibe.herblore;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import org.pf4j.Extension;

@Extension
@PluginDescriptor(

        name = "Shibe Herblore",
        description = "Private Plugin For Sebastion",
        tags = {"herblore","shibe","smile"})

@Slf4j
public class HerblorePlugin extends Plugin {
    @Override
    protected void startUp() throws Exception {

    }

    @Override
    protected void shutDown() throws Exception {

    }

    @Provides
    HerbloreConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(HerbloreConfig.class);
    }

    @Subscribe
    private void onGameTick(GameTick tick) {

    }
}
