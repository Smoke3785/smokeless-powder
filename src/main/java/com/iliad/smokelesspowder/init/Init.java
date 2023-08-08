package com.iliad.smokelesspowder.init;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import com.iliad.smokelesspowder.Main;

public class Init {
    private final DeferredRegister<?> REGISTER;

    public Init(IForgeRegistry<?> forgeRegistryType) {
        this.REGISTER = DeferredRegister.create(forgeRegistryType, Main.MODID);
    }

    public DeferredRegister<?> getRegister() {
        return REGISTER;
    }

    public void register(IEventBus bus) {
        REGISTER.register(bus);
    }
}
