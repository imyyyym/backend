package com.bezkoder.spring.jpa.h2;

import org.junit.jupiter.api.Test;

import com.bezkoder.spring.jpa.h2.model.Tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TutorialTest {

    @Test
    public void testTutorialGettersAndSetters() {
        Tutorial tutorial = new Tutorial();
        tutorial.setId(1);
        tutorial.setTitle("Test Title");
        tutorial.setDescription("Test Description");
        tutorial.setPublished(true);

        assertEquals(1, tutorial.getId());
        assertEquals("Test Title", tutorial.getTitle());
        assertEquals("Test Description", tutorial.getDescription());
        assertEquals(true, tutorial.isPublished());
    }
}
