package com.props;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// POJO for Server Property type
@Component
@Data
@Validated
@ConfigurationProperties(prefix = "server")
public class ServerProperties {
    
      // Range of port numbers
      @Min(1025)
    @Max(65535)
    private int port;

      // NotBlank indicates this property cannot be left blank
    @NotBlank(message = "Context path cannot be blank!")
    private String contextPath;
    
      // Specifying the default value if none is given inside properties file
    @Value("${server.connectionTimeout:5000}")
    private int connectionTimeout;

}