package guru.springframework.spring6webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("serviceEnv")
public class EnvironmentServiceUat implements EnvironmentService {
    @Override
    public String getEnv() {
        return "this is uat env";
    }
}
