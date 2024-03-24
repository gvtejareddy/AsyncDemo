package com.tejs.Async.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class ThreadPoolConfig {

    @Bean(name = "actorTaskExecutor")
    public Executor actorThreadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(25);
        executor.setThreadNamePrefix("actorTaskExecutor-");
        executor.initialize();
        return executor;
    }


    @Bean(name = "filmTaskExecutor")
    public Executor filmThreadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(25);
        executor.setThreadNamePrefix("filmTaskExecutor-");
        executor.initialize();
        return executor;
    }

    @Bean(name = "customerTaskExecutor")
    public Executor customerThreadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(25);
        executor.setThreadNamePrefix("customerTaskExecutor-");
        executor.initialize();
        return executor;
    }
}
