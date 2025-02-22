package lesson07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    public void testHumanToString(){
        String[][] schedule = {
                {DayOfWeek.MONDAY.name(), "Gym"},
                {DayOfWeek.TUESDAY.name(), "Reading"}
        };

        Human human = new Human("John", "Doe", 21, 90, schedule, null);
        String expected = "Human{name = 'John', surname = 'Doe', year = 21, iq = 90, schedule = [[MONDAY, Gym], [TUESDAY, Reading]]}";
        assertEquals(expected, human.toString());
    }

    @Test
    // They should be equal
    public void testEquals() {
        String[][] schedule1 = {
                {DayOfWeek.MONDAY.name(), "Gym"},
                {DayOfWeek.TUESDAY.name(), "Reading"}
        };
        String[][] schedule2 = {
                {DayOfWeek.MONDAY.name(), "Gym"},
                {DayOfWeek.TUESDAY.name(), "Reading"}
        };

        Human human1 = new Human("John", "Doe", 21, 90, schedule1, null);
        Human human2 = new Human("John", "Doe", 21, 90, schedule2, null);

        assertTrue(human1.equals(human2));
    }

    @Test
    // They should not be equal
    public void testEqualsDifferentObjects() {
        String[][] schedule = {
                {DayOfWeek.MONDAY.name(), "Gym"},
                {DayOfWeek.TUESDAY.name(), "Reading"}
        };

        Human human1 = new Human("John", "Doe", 21, 90, schedule, null);
        Human human2 = new Human("Jane", "Doe", 22, 85, schedule, null);

        assertFalse(human1.equals(human2));
    }

    @Test
    // Same hashcode for equal objects
    public void testHashCode() {
        String[][] schedule = {
                {DayOfWeek.MONDAY.name(), "Gym"},
                {DayOfWeek.TUESDAY.name(), "Reading"}
        };

        Human human1 = new Human("John", "Doe", 21, 90, schedule, null);
        Human human2 = new Human("John", "Doe", 21, 90, schedule, null);

        assertEquals(human1.hashCode(), human2.hashCode());
    }

    @Test
    // Different hashcodes for non-equal objects
    public void testHashCodeDifferentObjects() {
        String[][] schedule1 = {
                {DayOfWeek.MONDAY.name(), "Gym"},
                {DayOfWeek.TUESDAY.name(), "Reading"}
        };
        String[][] schedule2 = {
                {DayOfWeek.MONDAY.name(), "Gym"},
                {DayOfWeek.TUESDAY.name(), "Reading"}
        };

        Human human1 = new Human("John", "Doe", 21, 90, schedule1, null);
        Human human2 = new Human("Jane", "Doe", 22, 85, schedule2, null);

        assertNotEquals(human1.hashCode(), human2.hashCode());
    }
}

