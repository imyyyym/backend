package com.bezkoder.spring.jpa.h2;

import com.bezkoder.spring.jpa.h2.model.Tutorial;
import com.bezkoder.spring.jpa.h2.repository.TutorialRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class TutorialRepositoryTest {

    @Autowired
    private TutorialRepository tutorialRepository;

    @Test
    public void testFindByPublished() {
        // Assuming there is a published tutorial in your test data
        List<Tutorial> publishedTutorials = tutorialRepository.findByPublished(true);
        assertEquals(1, publishedTutorials.size());
    }

    @Test
    public void testFindByTitleContainingIgnoreCase() {
        // Assuming there is a tutorial with a specific title in your test data
        String title = "Specific Title";
        List<Tutorial> tutorials = tutorialRepository.findByTitleContainingIgnoreCase(title);
        assertEquals(1, tutorials.size());
        assertEquals(title, tutorials.get(0).getTitle());
    }
}
