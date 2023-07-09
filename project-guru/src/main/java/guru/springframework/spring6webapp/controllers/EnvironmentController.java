package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("serviceEnv") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnv() {
        System.out.println(environmentService.getEnv());
        return environmentService.getEnv();
    }
}
