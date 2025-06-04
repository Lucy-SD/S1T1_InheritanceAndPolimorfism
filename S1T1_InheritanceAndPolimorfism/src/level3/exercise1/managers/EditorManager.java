package level3.exercise1.managers;

import level3.exercise1.model.Editor;
import level3.exercise1.model.News;

import java.util.ArrayList;
import java.util.Scanner;

public class EditorManager {

    static Scanner scan = new Scanner(System.in);
    public static ArrayList<Editor> editors = new ArrayList<>();
    static int idEditor = -1;

    public int findEditor(int id) {
        int i = 0;
        idEditor = -1;
        boolean found = false;
        while (i < editors.size() && !found) {
            if (id == editors.get(i).getID()) {
                idEditor = i;
                found = true;
            }
            i++;
        }
        return idEditor;
    }

    public String addEditor() {
        String answer;
        String name;
        int id;

        System.out.println("Ingrese el número de identificación del redactor a registrar:");
        id = scan.nextInt();
        scan.nextLine();
        idEditor = findEditor(id);
        if (idEditor != -1) {
            answer = "El número de identificación ingresado corresponde a un redactor ya registrado.\n";
        } else {
            System.out.println("Ingrese el nombre del redactor:");
            name = scan.nextLine();
            editors.add(new Editor(name, id));
            answer = "Redactor añadido correctamente.\n";
        }
        return answer;
    }

    public String seeEditors() {
        String answer = "";

        if (!editors.isEmpty()) {
            for (int i = 0; i < editors.size(); i++) {
                if (answer.isEmpty()) {
                    answer = "El listado de redactores es:\n";
                }
                answer += editors.get(i).toString() + "\n";
            }
        } else {
            answer = "Datos incorrectos.\n";
        }
        return answer;
    }

    public String deleteEditor() {
        String answer = "Datos incorrectos.\n";
        int id;

        System.out.println("Ingrese el número de número de identificación del redactor a eliminar:");
        id = scan.nextInt();
        idEditor = findEditor(id);
        if (idEditor != -1) {
            editors.remove(idEditor);
            answer = "Redactor eliminado correctamente.\n";
        }
        return answer;
    }

    public String showEditorNews() {
        String answer = "";
        int id;

        System.out.println("Ingrese el número de identificación del redactor de su interés:");
        id = scan.nextInt();
        idEditor = findEditor(id);

        if (idEditor != -1 && !editors.get(idEditor).getEditorNews().isEmpty()) {
            for(News news : editors.get(idEditor).getEditorNews()) {
                if (answer.isEmpty()) {
                    answer = "Las noticias de el/la redactor/a " + editors.get(idEditor).getName() + " son:\n";
                }
                answer += "\n" + news.toString();
            }
        }
        if (idEditor != -1 && editors.get(idEditor).getEditorNews().isEmpty()) {
            answer = "El redactor elegido no tiene noticias asociadas.\n";
        }
        if (idEditor == -1){
            answer = "Datos incorrectos.\n";
        }
        return answer;
    }

}
