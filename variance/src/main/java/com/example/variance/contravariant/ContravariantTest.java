package com.example.variance.contravariant;

import com.example.variance.Animal;
import com.example.variance.GoldHamster;
import com.example.variance.Hamster;

import java.util.Arrays;
import java.util.List;

public class ContravariantTest {

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Hamster("ANIMAL"));
        List<Hamster> hamsters = Arrays.asList(new Hamster("A"), new Hamster("B"));
        List<GoldHamster> goldHamsters = Arrays.asList(new GoldHamster("G"), new GoldHamster("G2"));


        ContravariantList<Hamster> middleTypeList = new ContravariantList<>(goldHamsters);

        middleTypeList.clone(animals);
//        middleTypeList.clone(goldHamsters);
    }
}
