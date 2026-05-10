package com.example;

public class App {

    public static void main(String[] args) {

        // Immutable String Example

        String sourceText = "DevOps with Jenkins";

        System.out.println("Original Source Text: " + sourceText);

        // Copy source text to destination text

        String destinationText = sourceText;

        System.out.println("Copied Destination Text: " + destinationText);

        // Modify destination string

        destinationText = destinationText + " Pipeline";

        System.out.println("Modified Destination Text: " + destinationText);

        // Original string remains unchanged

        System.out.println("Source Text After Modification: " + sourceText);
    }
}

