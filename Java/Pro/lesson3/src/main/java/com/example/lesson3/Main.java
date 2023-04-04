package com.example.lesson3;

public class Main {
    public static void main(String[] args) {
        Graduate graduate = new Graduate("FirstName","SecondName", Gender.MALE, 1,"Group1", false,true);
        AnnotationStats.countAnnotatedMethods(graduate, FirstAnnotation.class);
        AnnotationStats.countAnnotatedParameter(graduate, SecondAnnotation.class);
    }
}
