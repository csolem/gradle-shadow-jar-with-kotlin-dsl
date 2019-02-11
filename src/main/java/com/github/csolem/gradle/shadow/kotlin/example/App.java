package com.github.csolem.gradle.shadow.kotlin.example;

import com.google.common.collect.ImmutableSet;

public class App {

    private static ImmutableSet<String> strings = ImmutableSet.of("Hello world. It workds");

    public static void main(String[] args) {
        System.out.println(strings);
    }
}
