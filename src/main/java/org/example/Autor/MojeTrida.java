package org.example.Autor;

@Autor(jmeno = "JA JSEM AUTOR")
public class MojeTrida {

    @Zpracuj
    public void metoda1() {
        System.out.println("Zpracovávám metodu 1");
    }

    @Zpracuj(priorita = 15)
    public void metoda2() {
        System.out.println("Zpracovávám metodu 2");
    }

    public void metoda3() {
        System.out.println("Metoda 3 není označena anotací");
    }
}
