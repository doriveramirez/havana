package Controlador;

import Modelo.Modelo;
import Vista.Ui_MainWindow;
import com.trolltech.qt.gui.QMainWindow;

public class Controlador {

    Ui_MainWindow vista = null;
    Modelo modelo = null;
    final String sql = "select * from alumnos";

    public Controlador() {
        QMainWindow mw = new QMainWindow();
        this.vista = new Ui_MainWindow();
        vista.setupUi(mw);
        this.modelo = new Modelo();
        mw.show();
    }
    
}
