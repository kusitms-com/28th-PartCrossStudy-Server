package kusitms.server.domain.global;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("큐시즘 28기 파트크로스 스터디 API Document")
                .description("큐시즘 28기 파트크로스 스터디 서버")
                .version("1.0.0");

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }



}
