package guru.springframework.spring6webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("serviceEnv")
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnv() {
        return "this is dev env";
    }
}
