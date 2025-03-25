package com.example.variance.covariant;

import com.example.variance.Animal;
import com.example.variance.GoldHamster;
import com.example.variance.Hamster;

import java.util.Arrays;
import java.util.List;

public class CovariantTest {

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Hamster("ANIMAL"));
        List<GoldHamster> goldHamsters = Arrays.asList(new GoldHamster("G"), new GoldHamster("G2"));


        CovariantList<Hamster> middleTypeList;

//        middleTypeList = new CovariantList<>(animals);
        middleTypeList = new CovariantList<>(goldHamsters);
    }
}
