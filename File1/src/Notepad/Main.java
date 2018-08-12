/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alena
 */
public class Main implements ActionListener{
    File file= new File("");
    public Main() {
        final JFrame frame = new JFrame("Notepad");// создание рамки
        frame.setSize(800, 700);// размеры
        frame.setVisible(true);// видимость окна
       
  
                
        JButton buttonOpen = new JButton("Open");
        buttonOpen.setLocation(10, 10);// положение кнопки
        buttonOpen.setSize(80, 30);// размер кнопки
        
        JButton buttonSave= new JButton("Save");
        buttonSave.setLocation(120, 10);// положение кнопки
        buttonSave.setSize(80, 30);
        
        JButton buttonNew= new JButton("New");
        buttonNew.setLocation(230, 10);// положение кнопки
        buttonNew.setSize(80, 30);
        
        final JTextArea area= new JTextArea();// создание текстового поля
        area.setLocation(10, 70);
        area.setSize(530, 790);
        ///////////////////////////
        buttonOpen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser= new JFileChooser();// ???
                chooser.showOpenDialog(frame);
                file= chooser.getSelectedFile();//???
                
                try(FileReader reader = new FileReader(file)){
                    char[] buf = new char[(int)file.length()];//??
                    reader.read(buf);//чтение файла в буфер
                    area.setText(new String(buf));// помещение буфера в поле текста
                   
                } catch (Exception e2){}
            }
        });
        
        
        buttonSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              try(FileWriter   writer= new FileWriter(file)){
              writer.write(area.getText());// считывание с поля
              writer.flush();// запись
              } catch(Exception e1){}
            
            }
        });
        
        
        buttonNew.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             JFileChooser chooser= new JFileChooser();
             //если файл открыт:
             if(chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
             file= chooser.getSelectedFile();
             try(FileWriter   writer= new FileWriter(file)){
              writer.write("");// считывание с поля
              writer.flush();// запись
              } catch(Exception e1){}
             }
            }
        });
        
        ///////////////////////////
        frame.add(buttonOpen);
        frame.add(buttonSave);
        frame.add(buttonNew);
        frame.add(area);
        frame.add(new JLabel());
        
        
        
}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
              
                new Main();// ????
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
