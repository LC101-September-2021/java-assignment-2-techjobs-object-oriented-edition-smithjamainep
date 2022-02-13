package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
//declaring a variable
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        assertEquals(1, job2.getId() - job1.getId());
    }


        @Test
        public void testJobConstructorSetsAllFields() {
            Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            assertEquals("Product tester", job3.getName());
            assertEquals("ACME", job3.getEmployer().toString());
            assertEquals("Desert", job3.getLocation().toString());
            assertEquals("Quality control", job3.getPositionType().toString());
            assertEquals("Persistence", job3.getCoreCompetency().toString());
            assertTrue(job3.getName() instanceof String);
            assertTrue(job3.getEmployer() instanceof Employer);
            assertTrue(job3.getLocation() instanceof Location);
            assertTrue(job3.getPositionType() instanceof PositionType);
            assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
//            assertFalse(job3.job2)




        }



        }


