package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* import javax.swing.*;
 import java.awt.*; */
public class App extends JFrame { // App будет создавать рамку у приложения за счет JFrame
    public  int result = 0;// Глобальная переменная результата

     public App(){ //Конструктор класса App
         setTitle("Calculator"); //Надпись в титуле
         JPanel panel = new JPanel(); //Заполнение рамки
         JButton plus = new JButton("+"); //Кнопки
         JButton minus = new JButton("-");
         JButton multi = new JButton("*");
         JButton div = new JButton("/");
         JLabel res = new JLabel();  //Декларируем результат вычисления

         JTextField x1 = new JTextField("1"); //Первое значение
         JTextField x2 = new JTextField("2");
         //Обработка любого события, происходящего с кнопкой
         ActionListener listenerPlus = new ActionListener() { //Обработчик событий
             @Override
             public void actionPerformed(ActionEvent e) {
                 int x_1 = Integer.parseInt(x1.getText()); //Меняем введенное строковое число на int
                 int x_2 = Integer.parseInt(x2.getText());
                 result = x_1+x_2;
                 res.setText(String.valueOf(res)); //Переводим полученный результат обратно в строку
             }
         };
         ActionListener listenerMinus = new ActionListener() { //Обработчик событий
             @Override
             public void actionPerformed(ActionEvent e) {
                 int x_1 = Integer.parseInt(x1.getText()); //Меняем введенное строковое число на int
                 int x_2 = Integer.parseInt(x2.getText());
                 result = x_1 - x_2;
                 res.setText(String.valueOf(res)); //Переводим полученный результат обратно в строку
             }
         };
         ActionListener listenerMulti = new ActionListener() { //Обработчик событий
             @Override
             public void actionPerformed(ActionEvent e) {
                 int x_1 = Integer.parseInt(x1.getText()); //Меняем введенное строковое число на int
                 int x_2 = Integer.parseInt(x2.getText());
                 result = x_1 * x_2;
                 res.setText(String.valueOf(res)); //Переводим полученный результат обратно в строку
             }
         };
         ActionListener listenerDiv = new ActionListener() { //Обработчик событий
             @Override
             public void actionPerformed(ActionEvent e) {
                 int x_1 = Integer.parseInt(x1.getText()); //Меняем введенное строковое число на int
                 int x_2 = Integer.parseInt(x2.getText());
                 result = x_1 / x_2;
                 res.setText(String.valueOf(res)); //Переводим полученный результат обратно в строку
             }
         };
         plus.addActionListener(listenerPlus); //Написанное поведение кнопок привязываем к самим кнопкам
         minus.addActionListener(listenerMinus);
         multi.addActionListener(listenerMulti);
         div.addActionListener(listenerDiv);
         panel.setSize(new Dimension(500,500)); //Задаем размер панели
         add(panel); //Добавляем панель к рамке - App сейчас рамка(jframe);
         panel.add(res); //На панель добавляем результат
         panel.add(plus); //Добавляем на панель кнопки
         panel.add(minus);
         panel.add(multi);
         panel.add(div);
         panel.add(x1);
         panel.add(x2);
         setPreferredSize(new Dimension(600, 600)); // Предпочитаемый размер по умолчанию
         setVisible(true); //Приложение будет запускаться в активном режиме, становится видимым
         setDefaultCloseOperation(EXIT_ON_CLOSE); //Выход из программы
         pack(); //Собираем все в кучу

     }
}
