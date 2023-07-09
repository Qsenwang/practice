package guru.springframework.spring6webapp.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("dev")
@SpringBootTest
class EnvironmentControllerDevTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void testDefaultEnv(){
        assertEquals("this is dev env", environmentController.getEnv());
    }
}