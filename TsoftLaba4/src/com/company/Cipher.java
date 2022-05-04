package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cipher {
    private int key;
    private String word;
    static StringBuilder text;

    public void calculate(int key, String word) {
        String outputSrc = "/Users/dimitriskidis/IdeaProjects/TsoftLaba4/src/Output.txt";
        this.key = key;
        this.word = word;

        try(FileWriter writer = new FileWriter(outputSrc, true))
        {
        String output = "Зашифрованное сообщение: ";
        boolean loop = true;
            boolean flag = true;
            while (loop) {
                int tmp = 0;
                String temp;
                if ( key == 999 ) {
                    output = "Error: ключ должен быть числом!";
                    flag = false;
                    break;
                }
                if (key < 0 || key >= 26) {
                    output = "Error: сдвиг должен быть от 1 до 25!";
                    flag = false;
                    break;
                }

                if (word.length() > 20 || word.length() == 0 || word.length() == 1) {
                    output = "Error: нужно ввести сообщение больше 1 символа и меньше 21!";
                    flag = false;
                    break;
                }

                for (int i = 0; i < word.length(); i++) {
                    tmp = word.charAt(i);
                    if ((tmp >= 'a' && tmp <= 'z') || (tmp >= 'A' && tmp <= 'Z')) {
                    } else {
                        output = "Error: нужно ввести пароль, использую только буквы английского алфавита!";
                        flag = false;
                        break;
                    }
                }
                if ( !flag ) {
                    break;
                }
                StringBuilder result = new StringBuilder();
                for (char character : word.toCharArray()) {
                    if (character != ' ') {
                        int originalAlphabetPosition = character - 'a';
                        int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                        char newCharacter = (char) ('a' + newAlphabetPosition);
                        result.append(newCharacter);
                    } else {
                        result.append(character);
                    }
                }
                output += result.toString();

                flag = true;
                break;
                }

            text = new StringBuilder();
            text.append(flag + ": " + output).append("\n");
            writer.write(text.toString());
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
}
}
