package flyweight.start.point;

import flyweight.flyweight_object.SomeBigObject;
import flyweight.non_flyweight_object.SomeVeryBigObject;

public class Main {
    public static void main(String[] args) {
        int sizeOfNonFlyweightWeightObject = 0;
        //for test lets create 10000 of each class
        //Lets imagine that we have the same first values for each object
        for(int i = 0; i < 10000; i++){
            sizeOfNonFlyweightWeightObject += new SomeVeryBigObject().eachObjectSize;
        }

        System.out.println("Size of non flyweight object: " + sizeOfNonFlyweightWeightObject);
        //Lets imagine that we have the same link for each object of flyweight object
        int sizeOfFlyweightWeightObject = new SomeBigObject().linkSize;
        for(int i = 0; i < 10000; i++){
            sizeOfFlyweightWeightObject += new SomeBigObject().eachObjectSizeIfLinkIsTheSame;
        }

        System.out.println("Size of flyweight object: " + sizeOfFlyweightWeightObject);

        System.out.println("Difference is: " + (sizeOfNonFlyweightWeightObject - sizeOfFlyweightWeightObject) / 1024 + " kilobytes");
    }
}
