package org.example.Anotace;

import org.example.MyMin;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SeznamAnotaci {

    public static void main(String[] args) {

        MyMin s = new MyMin();

        /** Reflection API
         *
         * sada metod které nám řeknou podorbné informace o programu
         * @Override přepisuje metodu kterou dědí
         * **/

        try {
            Class<?> clazz = s.getClass();

            ArrayList<Method> seznamMetod = new ArrayList<>(List.of(clazz.getMethods()));

            seznamMetod.sort(Comparator.comparing(Method::getName));

            ArrayList<Annotation> seznamAnotaci = null;


            for (Method method : seznamMetod) {

                System.out.println("MET " + method);

                seznamAnotaci = new ArrayList<>(List.of(method.getAnnotations()));

                for (Annotation a : seznamAnotaci) {

                    System.out.println("anotace " + a);
                }
            }

            assert seznamAnotaci != null;
            System.out.println(seznamAnotaci.size());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
