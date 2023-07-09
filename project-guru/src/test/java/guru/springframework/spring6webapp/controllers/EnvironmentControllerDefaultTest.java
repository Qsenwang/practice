package guru.springframework.spring6webapp.controllers;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EnvironmentControllerDefaultTest {
    @Autowired EnvironmentController environmentController;

    @Test
    void testDefaultEnv(){
        assertEquals("this is dev env", environmentController.getEnv());
    }
}