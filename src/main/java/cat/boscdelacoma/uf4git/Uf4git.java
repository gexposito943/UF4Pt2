package cat.boscdelacoma.uf4git;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uf4git {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        // Aquí irá la lógica principal de la aplicación
        // Por ejemplo, un menú sencillo para agregar tareas, marcarlas como completadas y mostrar la lista

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Afegir Feina");
            System.out.println("2. Marca feina feta");
            System.out.println("3. Veure tasques");
            System.out.println("4. Sortir");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    
                    System.out.print("Introdueix la descripcio de la tasca: ");
                    String taskDescription = scanner.nextLine();
                    tasks.add(new Task(taskDescription));
                    System.out.println("Tasca afegida: " + taskDescription);
                    break;
                case 2:
                    
                    System.out.print("Introdueix l'índex de la tasca a marcar com a completada ");
                    int taskIndex = scanner.nextInt();
                    if (taskIndex >= 0 && taskIndex < tasks.size()) {
                        tasks.get(taskIndex).setCompleted(true);
                        System.out.println("Tasca marcada com a completada: " + tasks.get(taskIndex).getDescription());
                    } else {
                        System.out.println("Índex de tasca no vàlid.");
                    }
                    break;
                case 3:
                    
                    System.out.println("Llista de tasques:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ": " + tasks.get(i));
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Opció no vàlida, si us plau torna a intentar.");
            }
        }
    }
}
