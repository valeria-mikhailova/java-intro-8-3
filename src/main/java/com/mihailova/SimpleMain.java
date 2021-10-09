package com.mihailova;

public class SimpleMain {
    //типы данных:
    char aChar = 'c'; // символ. Всегда в одинарных ковычках

    // Целочисленные типы:
    byte aByte = 1; // 8 бит
    short aShort = 2; // 16 бит
    Short bShort = 2; // 16 бит

    int anInt = 3 ; // 32 бита - чаще используется
    int anInt0 ; // значит, что тут лежит число ноль
    Integer bnInt = 0 ; // значит, что тут лежит число ноль

    long aLong = 5; // 64 бита

    // число с плавающей точкой - чаще используется
    float aFloat = 0.12f; // 32 в конце надо писать букву f
    double aDouble = 0.12; // 64 - обычно используется

    boolean aBoolean = true; // true \ false - истина или ложь - чаще используется
    Boolean bBoolean = true; // true \ false - истина или ложь - чаще используется

    // объектный или ссылочный тип данных
    String aString; // строка

    String bString = "Hello"; // строка всегда в двойных кавычках
    String cString = null; // устанавливаетсчя по дефолту



    // обработка данных
    public static void main(String[] args) {
        //из чего состаит java программа - создание объектов, вызов методов

        // WebSite site = new WebSite(); // создали объект WebSite
        // WebSite - тип данных
        // site - переменная
        // new - ключевое слово, с которого начинается создание всех объектов в java
        // WebSite() - названиме класса объекта , которого мы хотим создать и ставим скобочки
        SimpleWebSite mewsSite = new SimpleWebSite("yandex.ru/news", false);
        SimpleWebSite ytSite = new SimpleWebSite("youtube.com", true);

        mewsSite.setViewCount(10);
        System.out.println(mewsSite.viewCount);
        System.out.println(ytSite.viewCount);

        mewsSite.printItems();



        // объект String можно создавать без ключевого слова new
       // String aString = "Hello";



    }
}
