package com.zouzhao.question12;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals =new Animal[]{new Dog("tom"),new Cat("ts"),new Dog("tom1"),new Cat("ts2")};
        Dog[] dogs = getAllDogs(animals);
        for (Dog dog : dogs) {
           if (dog!=null)System.out.println(dog.getName());
        }

    }
    public static Dog[] getAllDogs(Animal[] as){
        Dog[] dogs = new Dog[as.length];
        int index=0;
        for (Animal a : as) {
            if (a instanceof Dog){
                dogs[index]=(Dog)a;
                index++;
            }
        }
        return dogs;
    }

}
