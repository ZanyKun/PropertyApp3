package acres.config;

import java.net.UnknownHostException;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "acres.elastic")
public class ElasticConfig {
	
	@Bean
	public RestHighLevelClient client() throws UnknownHostException {
		ClientConfiguration clientConfiguration = ClientConfiguration.builder()
				.connectedTo("localhost:9230").build();
		
		return RestClients.create(clientConfiguration).rest();
	}	
	
}
