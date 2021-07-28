
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Exercise");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Exercise");
        assertTrue("Exercise", management.exerciseList().contains("Exercise"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("Exercise");
        management.markAsCompleted("Exercise");
        assertTrue(management.isCompleted("Exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
    
    @Test
    public void removingExercises() {
        management.add("Exercise one");
        management.add("Exercise two");
        management.removeExercise("Exercise one");
        assertEquals(1, management.exerciseList().size());
    }
}
