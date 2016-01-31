package com.example;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rober on 31/01/2016.
 */
@Configuration
public class CustomFlywayConfiguration extends FlywayAutoConfiguration.FlywayConfiguration
{
    @Value("${loadData:false}")
    private boolean loadData;

    @Override
    public Flyway flyway()
    {
        Flyway flyway = super.flyway();
        Map<String, String> placeholders = new HashMap<>();
        placeholders.put("startComment", loadData ? "" : "/*");
        placeholders.put("endComment", loadData ? "" : "*/");
        flyway.setPlaceholders(placeholders);
        return flyway;
    }
}
