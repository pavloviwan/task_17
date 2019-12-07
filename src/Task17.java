/** Задача №17
 * Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
 * Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
 * Пользователь при тестировании программы по правилу черного ящика должен понимать,
 * какой принцип остановки записи в файл он должен подать.
 */
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task17 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter nFile = new FileWriter("out/myNotes.txt");
        System.out.println("Введите текст, ваш текст будет записан в файл myNotes.txt, чтобы завершить напишите: stop");
        String line;
        while (!(line = reader.readLine()).equals("stop"))
            nFile.write(line);
        nFile.close();
    }
}
