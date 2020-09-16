package config;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient
public class GatewayDiscoveryConfig {
    @Bean
    DiscoveryClientRouteDefinitionLocator discoveryRoutes(DiscoveryClient dc, DiscoveryLocatorProperties dlp) {
        return new DiscoveryClientRouteDefinitionLocator(dc, dlp);
    }
}
