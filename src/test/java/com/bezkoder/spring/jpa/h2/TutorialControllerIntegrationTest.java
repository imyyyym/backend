package com.bezkoder.spring.jpa.h2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class TutorialControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllTutorials() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/tutorials"))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testGetTutorialById() throws Exception {
        // Assuming there is a tutorial with ID 1 in your test data
        long tutorialId = 1;

        mockMvc.perform(MockMvcRequestBuilders.get("/api/tutorials/{id}", tutorialId))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
