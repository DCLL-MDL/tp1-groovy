/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * Modified by raclet(github) on March, 2015.
 */

package org.tp1.exo3

class Exo3 extends GroovyTestCase {

    void test01_IntroToGroovyBeans() {
        // JavaBeans (or POJOs) are simple Java objects with getters (getX) and setters (setX) for its members
        JavaPerson javaPerson = new JavaPerson("Argus", "Filch", "1234");

        // Groovy introduces an easier way to create JavaBeans. They're called GroovyBeans.
        // Have a read here: http://groovy.jmiguel.eu/groovy.codehaus.org/Groovy+Beans.html
        GroovyPerson groovyPerson = new GroovyPerson('Harry', 'Potter', '3322')

        // Explore the differences between JavaPerson and GroovyPerson and read some of the user guide above.
        // When you're done, add the necessary getters to get the respective first names
        // Hint: The reason you don't have a place to add code in Groovy is because you don't have to!
        def javaFirstName
        def groovyFirstName
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------

        assert javaFirstName == 'Argus'
        assert groovyFirstName == 'Harry'
    }

    void test02_ReadOnlyFieldInGroovyBean() {
        // You've probably noticed how Groovy automatically generates getters/setters for you. But what if you don't
        // want to generate a setter because it's a read-only field? Just mark it with 'final'. Groovy will understand.

        // Try to modify Ken's ssn. You should get a ReadOnlyPropertyException.
        def person = new GroovyPerson('Ken', 'Kousen', '7878')
        def failed = true
        shouldFail (ReadOnlyPropertyException) {
            // ------------ START EDITING HERE ----------------------

            // ------------ STOP EDITING HERE  ----------------------
            failed = false
        }

        assert failed

        // The code wrapping your additions verifies that the ReadOnlyProperty exception has been thrown.
        // The curly brackets ({}) represent a closure. We'll get into what that means very soon.
    }

    void test03_NamedParametersInConstructors() {
        // To enhance code clarity, Groovy allows using named arguments in methods.
        def quote = new SimpleGroovyBean(title: 'Quote object',
                data: "Never trust anything that can think for itself if you can't see where it keeps its brain")

        // If you pay close attention, you'll see that 'data' is actually untyped.
        // Practically, it's the same as specifying an 'Object' as the type.

        // Create a SimpleGroovyBean using named arguments, to represent a transaction with -30 as its data.
        def transaction
        // ------------ START EDITING HERE ----------------------

        // ------------ STOP EDITING HERE  ----------------------

        assert transaction.data == -30
    }

}
