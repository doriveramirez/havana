/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package havana;

import Controlador.Controlador;
import Vista.Ui_MainWindow;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;

/**
 *
 * @author AlumnadoTarde
 */
public class Havana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QApplication.initialize(args);ASD
        QMainWindow mw = new QMainWindow();
        Ui_MainWindow mainWindow = new Ui_MainWindow();
        mainWindow.setupUi(mw);
        mw.show();
        //new Controlador();
        QApplication.execStatic();
    }
    
}
