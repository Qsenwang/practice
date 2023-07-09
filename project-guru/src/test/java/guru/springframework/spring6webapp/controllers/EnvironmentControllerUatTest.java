package guru.springframework.spring6webapp.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("uat")
@SpringBootTest
class EnvironmentControllerUatTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void testDefaultEnv(){
        assertEquals("this is uat env", environmentController.getEnv());
    }
}