package com.zouzhao.question12;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals =new Animal[]{new Dog("tom"),new Cat("ts"),new Dog("tom1"),new Cat("ts2")};
        Dog[] dogs = getAllDogs(animals);
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getName());
        }

    }
    public static Dog[] getAllDogs(Animal[] as){
        int index=0;
        for (Animal a : as) {
            if (a instanceof Dog){
                index++;
            }
        }
        Dog[] dogs = new Dog[index];
        int i=0;
        for (Animal a : as) {
            if (a instanceof Dog){
                dogs[i++]=(Dog) a;
            }
        }
        return dogs;
    }

}
