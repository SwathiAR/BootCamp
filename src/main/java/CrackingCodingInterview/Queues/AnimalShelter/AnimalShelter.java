package CrackingCodingInterview.Queues.AnimalShelter;

/**
 * Created by root on 12/26/15.
 */
public class AnimalShelter {

    Node<Animal> oldestDog;
    Node<Animal> oldestCat ;
    int insertionOrder = 0;

    public void enQueue(Animal animal) {

        animal.order = ++insertionOrder;

            if (animal instanceof Dog) {
                if(oldestDog == null) {


                    oldestDog = new Node<Animal>(animal);
                }
                else{
                    Node node= oldestDog;
                    while(node.next != null){
                        node =node.next;
                     }
                    node.setNext(animal);
            }
        }

        else{
                if(oldestCat == null) {

                    oldestCat = new Node<Animal>(animal);
                }
                else{
                    Node node= oldestCat;
                    while(node.next != null){
                        node =node.next;
                    }
                    node.setNext(animal);
                }


        }

    }

    public Animal deQueueDog(){
        if(oldestDog == null){
            throw new RuntimeException("No dog available");
        }
        Animal animal =  oldestDog.getData();
        oldestDog =oldestDog.getNext();
        return animal;
    }

    public Animal deQueueCat(){
        if(oldestCat == null){
            throw new RuntimeException("No  Cat available");
        }
        Animal animal =  oldestCat.getData();
        oldestCat =oldestCat.getNext();
        return animal;
    }

    public Animal deQueue() {
        if (oldestCat == null && oldestDog == null) {
            throw new RuntimeException("No pet available");
        } else if (oldestCat == null) {
            return deQueueDog();
        } else if (oldestDog == null) {
            return deQueueCat();
        } else {
            if (oldestDog.getData().order < oldestCat.getData().order) {
                return deQueueDog();
            } else return deQueueCat();
        }
    }
}
