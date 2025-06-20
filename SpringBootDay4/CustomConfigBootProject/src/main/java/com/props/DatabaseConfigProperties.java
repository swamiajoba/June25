package com.props;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

// POJO for Database Configuration Property type
@Component
@Data
@Validated
@ConfigurationProperties(prefix = "spring.datasource")
public class DatabaseConfigProperties {
    @NotBlank(message = "URL field cannot be Blank!")
    private String url;

    @NotBlank(message = "You should specify the appropriate driver class!")
    private String driverClassName;

    @NotBlank(message = "Username field cannot be Blank!")
    private String username;

    @NotBlank(message = "Password field can not be Blank!")
    private String password;
}
