package level3.exercise1.managers;

import level3.exercise1.model.*;

import java.util.Scanner;

public class ProgramRunner {
    public void run() {


        EditorManager editorManager = new EditorManager();
        NewsManager newsManager = new NewsManager();
        Scanner scan = new Scanner(System.in);
        int option;
        String answer;


        Editor gime = new Editor("Gime", 1111);
        Editor lala = new Editor("Lala", 2222);
        Editor tito = new Editor("Tito", 3333);
        EditorManager.editors.add(gime);
        EditorManager.editors.add(lala);
        EditorManager.editors.add(tito);

        News futbol = new SoccerNews("Ganó River ¡!", "Eurocopa", "Madrid", "Ferran");
        News basquet = new BasketballNews("Honores para Ginobilli", "UE", "Barcelona");
        News tennis = new TennisNews("Gran Final ¡!", "GrandSlam", "Nadal");
        News f1 = new F1News("Carreras del fin de semana", "mercedes");
        News moto = new MotorcycleNews("Últimas novedades de Mattioli", "Honda");

        lala.setEditorNews(futbol);
        lala.setEditorNews(basquet);
        gime.setEditorNews(f1);
        gime.setEditorNews(moto);
        lala.setEditorNews(tennis);


        do {
            System.out.println("Bienvenido a la Redacción.\nElija una opción:\n" +
                    "1. Introducir redactor.\n" +
                    "2. Ver lista de los redactores.\n" +
                    "3. Eliminar redactor.\n" +
                    "4. Introducir noticia a un redactor.\n" +
                    "5. Eliminar noticia.\n" +
                    "6. Mostrar todas las noticias por redactor.\n" +
                    "7. Calcular puntuación de la noticia.\n" +
                    "8. Calcular precio de la noticia.\n" +
                    "0. Salir.\n");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 0:
                    answer = "Gracias por su visita. Hasta pronto = )";
                    break;
                case 1:
                    answer = editorManager.addEditor();
                    break;
                case 2:
                    answer = editorManager.seeEditors();
                    break;
                case 3:
                    answer = editorManager.deleteEditor();
                    break;
                case 4:
                    answer = newsManager.addNews();
                    break;
                case 5:
                    answer = newsManager.deleteNews();
                    break;
                case 6:
                    answer = editorManager.showEditorNews();
                    break;
                case 7:
                    answer = newsManager.calculateScore();
                    break;
                case 8:
                    answer = newsManager.calculatePrice();
                    break;
                default:
                    answer = "Elija una opción válida (entre 0 y 7).\n";
            }
            System.out.println(answer);
        }
        while (option != 0);

    }

}




