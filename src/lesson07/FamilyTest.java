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



}
