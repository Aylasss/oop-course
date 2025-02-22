package lesson07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class FamilyTest {
    @Test
    public void testAddChild() {
        Human mother = new Human ();
        Human father = new Human ();

        Family family = new Family(mother, father);

        Human child = new Human ();
        family.addChild(child);
        assertEquals(3, family.countFamily());

    }

    @Test

    public void testDeleteChildByObject() {

        Human mother = new Human();
        Human father = new Human();

        Human child1 = new Human();
        Human child2 = new Human();

        Family family = new Family(mother, father);

        family.addChild(child1);
        family.addChild(child2);
        family.deleteChild(child1);

        assertEquals(3, family.countFamily());

    }

    @Test

    public void testDeleteChildByIndex() {

        Human mother = new Human();
        Human father = new Human();
        Pet pet = new Pet();
        Human child1 = new Human();
        Human child2 = new Human();

        Family family = new Family(mother, father, pet);

        family.addChild(child1);
        family.addChild(child2);
        family.deleteChild(0);

        assertEquals(4, family.countFamily());

    }





    @Test
    public void testEquals() {
        Pet pet = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});
        Human mother = new Human("Alice", "Smith", 40, 85, null, null);
        Human father = new Human("Bob", "Smith", 42, 90, null, null);
        Human[] children = {new Human("Charlie", "Smith", 15, 75, null, null)};
        Family family1 = new Family(mother, father, pet);
        family1.addChild(children[0]);


        Pet pet2 = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});
        Human mother2 = new Human("Alice", "Smith", 40, 85, null, null);
        Human father2 = new Human("Bob", "Smith", 42, 90, null, null);
        Human[] children2 = {new Human("Charlie", "Smith", 15, 75, null, null)};
        Family family2 = new Family(mother2, father2, pet2);
        family2.addChild(children2[0]);

        assertTrue(family1.equals(family2));
    }


    @Test
    public void testEqualsDifferentObjects() {
        Pet pet = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});
        Human mother = new Human("Alice", "Smith", 40, 85, null, null);
        Human father = new Human("Bob", "Smith", 42, 90, null, null);
        Human[] children = {new Human("Charlie", "Smith", 15, 75, null, null)};
        Family family1 = new Family(mother, father, pet);
        family1.addChild(children[0]);

        Pet pet2 = new Pet(Species.DOG, "Bella", 4, 70, new String[]{"run", "sleep"});
        Human mother2 = new Human("Carol", "Johnson", 38, 80, null, null);
        Human father2 = new Human("David", "Johnson", 40, 88, null, null);
        Human[] children2 = {new Human("Dylan", "Johnson", 10, 80, null, null)};
        Family family2 = new Family(mother2, father2, pet2);
        family2.addChild(children2[0]);

        assertFalse(family1.equals(family2));
    }



    @Test
    public void testHashCode() {
        Pet pet = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});
        Human mother = new Human("Alice", "Smith", 40, 85, null, null);
        Human father = new Human("Bob", "Smith", 42, 90, null, null);
        Human[] children = {new Human("Charlie", "Smith", 15, 75, null, null)};
        Family family1 = new Family(mother, father, pet);
        family1.addChild(children[0]);

        Pet pet2 = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});
        Human mother2 = new Human("Alice", "Smith", 40, 85, null, null);
        Human father2 = new Human("Bob", "Smith", 42, 90, null, null);
        Human[] children2 = {new Human("Charlie", "Smith", 15, 75, null, null)};
        Family family2 = new Family(mother2, father2, pet2);
        family2.addChild(children2[0]);

        assertEquals(family1.hashCode(), family2.hashCode());
    }



    @Test
    public void testHashCodeDifferentObjects() {
        Pet pet = new Pet(Species.BIRD, "Cedric", 2, 60, new String[]{"eat", "sleep"});
        Human mother = new Human("Alice", "Smith", 40, 85, null, null);
        Human father = new Human("Bob", "Smith", 42, 90, null, null);
        Human[] children = {new Human("Charlie", "Smith", 15, 75, null, null)};
        Family family1 = new Family(mother, father, pet);
        family1.addChild(children[0]);

        Pet pet2 = new Pet(Species.DOG, "Bella", 4, 70, new String[]{"run", "sleep"});
        Human mother2 = new Human("Carol", "Johnson", 38, 80, null, null);
        Human father2 = new Human("David", "Johnson", 40, 88, null, null);
        Human[] children2 = {new Human("Dylan", "Johnson", 10, 80, null, null)};
        Family family2 = new Family(mother2, father2, pet2);
        family2.addChild(children2[0]);

        assertNotEquals(family1.hashCode(), family2.hashCode());
    }

}
