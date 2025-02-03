package org.example.Autor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        MojeTrida m = new MojeTrida();

        m.metoda1();

        Annotation[] annotations = MojeTrida.class.getAnnotations();

        Class<?> clazz = m.getClass();

        if (clazz.isAnnotationPresent(Autor.class)) {

            // Vypsání obsahu autora třídy MojeTrida
            Autor p = clazz.getAnnotation(Autor.class);

            System.out.println("AUTOR " + p.jmeno());
        }

        for (Method method : clazz.getMethods()) {

            if (method.isAnnotationPresent(Zpracuj.class)) {

                // Vypsání obsahu autora třídy MojeTrida
                Zpracuj p = method.getAnnotation(Zpracuj.class);

                if (p != null) {

                    System.out.println("ANOT: " + p.priorita());

                    // Zavolání metod
                    method.invoke(m);
                }
            }
        }

//        for (Annotation anot : annotations) {
//
//
//            System.out.println("ANOT: " + anot);
//        }
    }
}
