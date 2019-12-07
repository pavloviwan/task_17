/** Задача №17
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
 * а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
 * Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
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
