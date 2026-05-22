package trabalhoIndividual.biblioteca.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI myOpenAPI(){
        return new OpenAPI()
        .info(new Info()
                .title("Biblioteca Inclusiva - API")
                .version("1.0")
                .description("Trabalho Individual API Serratec")
                .contact( new Contact()
                        .name("Marcelo Pozzato Rabello Mayrinck")
                        .email("marceloprmayrinck@gmail.com"))
                .license(new License()
                        .name("Apache 2.0")
                        .url("https://github.com/marceloprmayrinck/trabalhoIndividualAPI")))
                .addServersItem(new Server()
                        .url("http://localhost:8080")
                        .description("Servidor Local"));
    }
}



