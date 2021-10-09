package com.mihailova;

public class SimpleWebSite {

    //описание свойств класса (объекта)/ Объявляем свойства класса
    String url = null;
    int viewCount = 0;
    boolean isFunnySite = false;

    // массив Вместо этих стрёх строчек
    String menuItem0 = "Login";
    String menuItem1 = "Logout";
    String menuItem2 = "Profile";

    // можно сделать массив вот так:
    //String [] menuItems = new String [3] {"Login", "Logout", "Profile"};
    // Вот так писать верно:
    String [] menuItems = {"Login", "Logout", "Profile"};



    public SimpleWebSite(String url, boolean isFunnySite) {
        this.url = url;
        this.isFunnySite = isFunnySite;
    }
    // конструктор можно вызвать: левый Alt + Insert
    public SimpleWebSite() {


    }

    void setViewCount(int count) {

        this.viewCount = count;
    }

    boolean isThisSiteIsFunny() {
        System.out.println("!!!!");
        return isFunnySite;
    }

    void open() {
        if (isFunnySite){ // Если это тру, то
            // if (viewCount > 0 && isFunnySite); - Если viewCount больше нуля и isFunnySite тру (это весёлый сайт), то...

            // Если поставить && (два вместо одного) (можно использовать символ или ||),
            // то если viewCount > 0 будет фолс, то java не будет проверять следующей выражение
        System.out.print(":D");

    } else {
            System.out.println(":(");
        }
    }

    void printItems() {
        // цикл с индексом i завели индекс i,
        // дали ему изначальное значение = 0,
        // i < menuItems.length - когда цикл будет ещё работать.
        // цикл будет работать пока индекс будет меньше длины массива
        // на этом месте должен быть boolean, если установить true,
        // то это будет бесконечный цикл
        // i++ - описывается выражение, которе с каждым циклом как-то изменяется,
        // ++ это добавление единицы, i++ тоже, что и i = i + 1
        for (int i= 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }


    }
}

