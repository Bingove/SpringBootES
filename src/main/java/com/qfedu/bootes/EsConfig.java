package com.qfedu.bootes;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;

/**
 * @Author Bingove
 * @Date 2018/8/8 0008 下午 20:22
 */
@Configuration
@EnableElasticsearchRepositories("com.qfedu.bootes.dao")
public class EsConfig {
    // ElasticsearchOperations elasticsearchOperations;
    @Value("${es.clustername}")
    private String clustername;

    @Value("${es.host}")
    private String host;

    @Value("${es.port}")
    private int port;

    //创建客户端对象
    @Bean
    public Client createClient() throws Exception {
        Settings settings = Settings.builder().put("cluster.name", clustername).build();
        return new PreBuiltTransportClient(settings).addTransportAddress(
                new InetSocketTransportAddress(InetAddress.getByName(host), port));
    }

    //创建Spring Data 模板对象
    @Bean
    public ElasticsearchOperations createESOp() throws Exception {
        return new ElasticsearchTemplate(createClient());
    }
}
