package com.ssr.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.trc.configuration.LoggingAspectConfig;

@Configuration
@ComponentScan(basePackageClasses = { LoggingAspectConfig.class })
public class AspectConfig {


}
