package guru.springframework.spring6webapp.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("qa")
@SpringBootTest
class EnvironmentControllerQaTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void testDefaultEnv(){
        assertEquals("this is qa env", environmentController.getEnv());
    }
}