package guru.springframework.spring6webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("serviceEnv")
public class EnvironmentServiceQa implements EnvironmentService {
    @Override
    public String getEnv() {
        return "this is qa env";
    }
}
