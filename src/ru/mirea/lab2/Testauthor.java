package ru.mirea.lab2;
import java.lang.*;

public class Testauthor
{
    public static void main(String[] args)
    {
        author a1 = new author("Марина Стрелова","srtela@yandex.ru",'w');
        author a2 = new author("Дмитрий Гуховский","gluhoy@gmail.ru",'m');
        author a3 = new author("Евгений Маркин","mark3@gmail.ru",'m');
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }

}
