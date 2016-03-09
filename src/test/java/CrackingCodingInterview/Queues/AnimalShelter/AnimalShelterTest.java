package CrackingCodingInterview.Queues.AnimalShelter;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/27/15.
 */
public class AnimalShelterTest {
    AnimalShelter a = new AnimalShelter();

    @Test
    public void test() throws Exception {
        Dog dog1 = new Dog("danny");
        Dog dog2 = new Dog("dammy");
        Cat cat1 = new Cat("ttt");
        Dog dog3 = new Dog("tom");
        Cat cat2 = new Cat("rrr");
        Dog dog4 = new Dog("puttu");
        a.enQueue(dog1);
        Assert.assertEquals(a.deQueue().name, "danny");

        a.enQueue(dog2);
        Assert.assertEquals(a.deQueueDog().name, "dammy");
        a.enQueue(cat1);
        a.enQueue(dog3);
        a.enQueue(cat2);
        a.enQueue(dog4);

        Assert.assertEquals(a.deQueueCat().name , "ttt");



    }
}