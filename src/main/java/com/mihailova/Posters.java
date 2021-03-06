package com.mihailova;

public class Posters {

    String posterSize;
    String typePaper;
    boolean isEmbossing; //тиснение
    int numberOfPosters;
    String nomber;

    public Posters(String posterSize, String typePaper, boolean isEmbossing, int numberOfPosters, String nomber) {
        this.posterSize = posterSize;
        this.typePaper = typePaper;
        this.isEmbossing = isEmbossing;
        this.numberOfPosters = numberOfPosters;
        this.nomber = nomber;
    }
        public void printing() {
        System.out.print("Отправка на печать " + nomber + "\n\n");
    }
        public void showMespecifications() {
        System.out.println("Характеристики вашего плаката:");
        System.out.println("- Порядковый номер: " + nomber);
        if (isEmbossing) {
        System.out.println("- Есть тиснение");
        } else {
        System.out.println("- Нет тиснения");
        }
        System.out.println("- Размер: " + posterSize + "\n" +
            "- " + "Тип бумаги: " + typePaper);
        System.out.print("- Количество: ");
        if (numberOfPosters == 0) {
        System.out.println("Вы не выбрали количество копий\n");
        }
        if (numberOfPosters == 1) {
        System.out.println(numberOfPosters + " копия\n");
        }
        if (numberOfPosters > 1 && numberOfPosters < 5) {
        System.out.println(numberOfPosters + " копии\n");
        }
        if (numberOfPosters > 4 && numberOfPosters < 20) {
        System.out.println(numberOfPosters + " копий\n");
        }
        if (numberOfPosters >= 21) {
        System.out.println("Максимальное количество копий = 20\n");
        }
    }
}











