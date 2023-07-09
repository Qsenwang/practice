package guru.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

@Service("impl")
public class EnvironmentServiceImpl implements EnvironmentService {
    @Override
    public String getEnv() {
        return "impl";
    }
}
