package lesson07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    public void testPetToString() {
        Pet pet = new Pet(Species.BIRD, "Cedric", 1, 99, new String[]{"eat", "sleep", "fly"});
        String expected = "BIRD with 2 legs, can fly: true, has fur: false {nickname = 'Cedric', age = 1, trickLevel = 99, habits = [eat, sleep, fly]}";
        assertEquals(expected, pet.toString());

    }


    @Test
    public void testEquals() {
        Pet pet1 = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});
        Pet pet2 = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});

        assertTrue(pet1.equals(pet2));
    }

    @Test
    public void testEqualsDifferentObjects() {
        Pet pet1 = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});
        Pet pet2 = new Pet(Species.DOG, "Bella", 4, 70, new String[]{"run", "sleep"});

        assertFalse(pet1.equals(pet2));
    }

    @Test
    public void testHashCode() {
        Pet pet1 = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});
        Pet pet2 = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});

        assertEquals(pet1.hashCode(), pet2.hashCode());
    }

    @Test
    public void testHashCodeDifferentObjects() {
        Pet pet1 = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});
        Pet pet2 = new Pet(Species.DOG, "Bella", 4, 70, new String[]{"run", "sleep"});

        assertNotEquals(pet1.hashCode(), pet2.hashCode());
    }

}