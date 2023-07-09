package guru.springframework.spring6webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("serviceEnv")
public class EnvironmentServiceProd implements EnvironmentService {
    @Override
    public String getEnv() {
        return "this is prod env";
    }
}
