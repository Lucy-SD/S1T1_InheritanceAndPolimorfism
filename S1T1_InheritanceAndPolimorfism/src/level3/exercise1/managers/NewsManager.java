package level3.exercise1.managers;

import level3.exercise1.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewsManager {
    static Scanner scan = new Scanner(System.in);
    private EditorManager editorManager = new EditorManager();
    public List<News> news = new ArrayList<News>();
    static int idEditor = -1;
    static int idNews = -1;
    static Editor editor;

    public String addNews() {
        String answer = "Datos incorrectos.\n";
        int id;
        int newsType;

        System.out.println("Ingrese el número de identificación del redactor:");
        id = scan.nextInt();
        idEditor = editorManager.findEditor(id);
        if (idEditor != -1) {

            System.out.println("De qué deporte es la noticia ¿?\n" +
                    "1. Fútbol;\n" +
                    "2. Basquet;\n" +
                    "3. Tennis;\n" +
                    "4. F1;\n" +
                    "5. Motociclimso.\n");
            newsType = scan.nextInt();
            scan.nextLine();
            switch (newsType) {
                case 1:
                    answer = addSoccerNews();
                    break;
                case 2:
                    answer = addBasketNews();
                    break;
                case 3:
                    answer = addTennisNews();
                    break;
                case 4:
                    answer = addF1News();
                    break;
                case 5:
                    answer = addMotoNews();
                    break;
            }
        }
        return answer;
    }

    public String addSoccerNews() {
        String headline;
        String competition;
        String club;
        String player;
        SoccerNews soccer;

        System.out.println("Ingese el titular de la noticia:");
        headline = scan.nextLine();
        System.out.println("A que competencia hace referencia la noticia ¿?");
        competition = scan.nextLine();
        System.out.println("A que club ¿?");
        club = scan.nextLine();
        System.out.println("A que jugador ¿?");
        player = scan.nextLine();
        soccer = new SoccerNews(headline, competition, club, player);
        news.add(soccer);
        EditorManager.editors.get(idEditor).setEditorNews(soccer);
        return "Noticia creada correctamente.\n";
    }

    public String addBasketNews() {
        String headline;
        String competition;
        String club;
        BasketballNews basket;

        System.out.println("Ingese el titular de la noticia:");
        headline = scan.nextLine();
        System.out.println("A que competencia hace referencia la noticia ¿?");
        competition = scan.nextLine();
        System.out.println("A que club ¿?");
        club = scan.nextLine();
        basket = new BasketballNews(headline, competition, club);
        news.add(basket);
        EditorManager.editors.get(idEditor).setEditorNews(basket);

        return "Noticia creada correctamente.\n";
    }

    public String addTennisNews() {
        String headline;
        String competition;
        String player;
        TennisNews tennis;

        System.out.println("Ingese el titular de la noticia:");
        headline = scan.nextLine();
        System.out.println("A que competencia hace referencia la noticia ¿?");
        competition = scan.nextLine();
        System.out.println("A que tenista ¿?");
        player = scan.nextLine();
        tennis = new TennisNews(headline, competition, player);
        news.add(tennis);
        EditorManager.editors.get(idEditor).setEditorNews(tennis);

        return "Noticia creada correctamente.\n";
    }

    public String addF1News() {
        String headline;
        String team;
        F1News f1;

        System.out.println("Ingese el titular de la noticia:");
        headline = scan.nextLine();
        System.out.println("A que equipo hace referencia ¿?");
        team = scan.nextLine();
        f1 = new F1News(headline, team);
        news.add(f1);
        EditorManager.editors.get(idEditor).setEditorNews(f1);

        return "Noticia creada correctamente.\n";
    }

    public String addMotoNews() {
        String headline;
        String team;
        MotorcycleNews moto;

        System.out.println("Ingese el titular de la noticia:");
        headline = scan.nextLine();
        System.out.println("A que equipo hace referencia ¿?");
        team = scan.nextLine();
        moto = new MotorcycleNews(headline, team);
        news.add(moto);
        EditorManager.editors.get(idEditor).setEditorNews(moto);

        return "Noticia creada correctamente.\n";
    }

    public int findNews() {
        int i = 0;
        boolean found = false;
        int id;
        String headline;

        System.out.println("Ingrese el número de identificación del redactor de la noticia:");
        id = scan.nextInt();
        scan.nextLine();
        idEditor = editorManager.findEditor(id);

        if (idEditor != -1) {
            editor = new Editor(EditorManager.editors.get(idEditor).getName(), EditorManager.editors.get(idEditor).getID());
            System.out.println(("Ingrese el titular de la noticia:"));
            headline = scan.nextLine();
            while ((i < EditorManager.editors.get(idEditor).getEditorNews().size() && !found)) {
                if (headline.equalsIgnoreCase(EditorManager.editors.get(idEditor).getEditorNews().get(i).getHeadline())) {
                    idNews = i;
                    found = true;
                }
                i++;
            }
        }
        return idNews;
    }

    public String deleteNews() {
        String answer = "Datos incorrectos.\n";
        idNews = findNews();
        if (idEditor != -1 && idNews != -1) {
            EditorManager.editors.get(idEditor).getEditorNews().remove(idNews);
            answer = "Noticia eliminada correctamente.\n";
        }
        return answer;
    }

    public String calculateScore() {
        String answer = "Datos incorrectos.\n";
        idNews = findNews();
        int score = 0;

        News news = EditorManager.editors.get(idEditor).getEditorNews().get(idNews);

        if (news instanceof SoccerNews) {
            score = ((SoccerNews) news).calculateNewsScore();
        }
        if (news instanceof BasketballNews) {
            score = ((BasketballNews) news).calculateNewsScore();
        }
        if (news instanceof TennisNews) {
            score = ((TennisNews) news).calculateNewsScore();
        }
        if (news instanceof F1News) {
            score = ((F1News) news).calculateNewsScore();
        }
        if (news instanceof MotorcycleNews) {
            score = ((MotorcycleNews) news).calculateNewsScore();
        }

        if (score != 0) {
            answer = "La puntuación de la noticia selecicionada es de: " + score + ".\n";
        }

        return answer;
    }

    public String calculatePrice() {
        String answer = "Datos incorrectos.\n";
        idNews = findNews();
        int price = 0;
        News news = EditorManager.editors.get(idEditor).getEditorNews().get(idNews);

        if (news instanceof SoccerNews) {
            price = ((SoccerNews) news).calculateNewsPrice();
        }
        if (news instanceof BasketballNews) {
            price = ((BasketballNews) news).calculateNewsPrice();
        }
        if (news instanceof TennisNews) {
            price = ((TennisNews) news).calculateNewsPrice();
        }
        if (news instanceof F1News) {
            price = ((F1News) news).calculateNewsPrice();
        }
        if (news instanceof MotorcycleNews) {
            price = ((MotorcycleNews) news).calculateNewsPrice();
        }

        if (price != 0) {
            answer = "El precio de la noticia selecicionada es de: " + price + "€.\n";
        }

        return answer;
    }
}
