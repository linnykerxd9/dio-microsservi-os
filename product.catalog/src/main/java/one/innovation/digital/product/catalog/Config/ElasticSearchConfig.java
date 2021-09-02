package one.innovation.digital.product.catalog.Config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "one.innovation.digital.product.catalog.repository")
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

    @Bean
    @Override
    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration config = ClientConfiguration.builder()
                .connectedTo("localhost:9200", "localhost:9300")
                .withConnectTimeout(1500000)
                .withSocketTimeout(15000000)
                .build();
        return RestClients.create(config).rest();
    }
}
