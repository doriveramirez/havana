package Vista;

/********************************************************************************
 ** Form generated from reading ui file 'tareaHotel.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import javax.swing.JFrame;

public class Ui_MainWindow implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QWidget centralwidget;
    public QWidget gridLayoutWidget;
    public QGridLayout gridLayout;
    public QFrame frame_9;
    public QFrame frame_4;
    public QLabel label_9;
    public QFrame frame;
    public QTextEdit textEdit;
    public QLabel label;
    public QLabel label_2;
    public QFrame frame_2;
    public QTextEdit textEdit_2;
    public QLabel label_3;
    public QFrame frame_3;
    public QDateEdit dateEdit;
    public QLabel label_4;
    public QFrame frame_6;
    public QSpinBox spinBox;
    public QLabel label_5;
    public QFrame frame_8;
    public QRadioButton radioButton_2;
    public QRadioButton radioButton_4;
    public QRadioButton radioButton_3;
    public QLabel label_6;
    public QFrame frame_5;
    public QComboBox comboBox;
    public QLabel label_7;
    public QFrame frame_7;
    public QSpinBox spinBox_2;
    public QCheckBox checkBox;
    public QPushButton pushButton_2;
    public QPushButton pushButton;
    public QLabel label_8;
    public QStatusBar statusbar;

    public Ui_MainWindow() { super(); }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(811, 509).expandedTo(MainWindow.minimumSizeHint()));
        MainWindow.setMaximumSize(new QSize(811, 509));
        MainWindow.setStyleSheet("background-color: rgb(255, 255, 255)");
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        gridLayoutWidget = new QWidget(centralwidget);
        gridLayoutWidget.setObjectName("gridLayoutWidget");
        gridLayoutWidget.setGeometry(new QRect(0, 0, 811, 511));
        gridLayout = new QGridLayout(gridLayoutWidget);
        gridLayout.setObjectName("gridLayout");
        frame_9 = new QFrame(gridLayoutWidget);
        frame_9.setObjectName("frame_9");
        frame_9.setMaximumSize(new QSize(850, 800));
        QPalette palette= new QPalette();
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        frame_9.setPalette(palette);
        frame_9.setAutoFillBackground(false);
        frame_9.setStyleSheet("background-color: rgb(255, 255, 255);");
        //frame_9.setFrameShape(QFrame::StyledPanel);
        //frame_9.setFrameShadow(QFrame::Raised);
        frame_4 = new QFrame(frame_9);
        frame_4.setObjectName("frame_4");
        frame_4.setGeometry(new QRect(0, 0, 811, 101));
        frame_4.setMaximumSize(new QSize(850, 800));
        QPalette palette1= new QPalette();
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(21, 152, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(21, 152, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(21, 152, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(21, 152, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(21, 152, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(21, 152, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(21, 152, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(21, 152, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(21, 152, 255));
        frame_4.setPalette(palette1);
        frame_4.setAutoFillBackground(false);
        frame_4.setStyleSheet("background-color: rgb(21, 152, 255);");
        //frame_4.setFrameShape(QFrame::StyledPanel);
        //frame_4.setFrameShadow(QFrame::Raised);
        label_9 = new QLabel(frame_4);
        label_9.setObjectName("label_9");
        label_9.setGeometry(new QRect(10, 20, 791, 61));
        QFont font = new QFont();
        font.setFamily("Mongolian Baiti");
        font.setPointSize(49);
        label_9.setFont(font);
        //label_9.setAlignment(.createQFlags(Qt::AlignCenter));
        frame = new QFrame(frame_9);
        frame.setObjectName("frame");
        frame.setGeometry(new QRect(10, 160, 701, 51));
        QPalette palette2= new QPalette();
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        frame.setPalette(palette2);
        frame.setAutoFillBackground(false);
        frame.setStyleSheet("background-color: rgb(184, 184, 184);\n"+
"border-style: outset;\n"+
"border-width: 2px;\n"+
"border-radius: 10px;\n"+
"border-color: beige;\n"+
"min-width: 10em;\n"+
"padding: 6px;");
        //frame.setFrameShape(QFrame::StyledPanel);
        //frame.setFrameShadow(QFrame::Raised);
        textEdit = new QTextEdit(frame);
        textEdit.setObjectName("textEdit");
        textEdit.setGeometry(new QRect(0, 0, 701, 51));
        QFont font1 = new QFont();
        font1.setFamily("MS Gothic");
        font1.setPointSize(15);
        textEdit.setFont(font1);
        label = new QLabel(frame_9);
        label.setObjectName("label");
        label.setGeometry(new QRect(10, 140, 101, 16));
        label_2 = new QLabel(frame_9);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(10, 220, 111, 16));
        frame_2 = new QFrame(frame_9);
        frame_2.setObjectName("frame_2");
        frame_2.setGeometry(new QRect(10, 240, 301, 51));
        QPalette palette3= new QPalette();
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        frame_2.setPalette(palette3);
        frame_2.setAutoFillBackground(false);
        frame_2.setStyleSheet("background-color: rgb(184, 184, 184);\n"+
"border-style: outset;\n"+
"border-width: 2px;\n"+
"border-radius: 10px;\n"+
"border-color: beige;\n"+
"min-width: 10em;\n"+
"padding: 6px;");
        //frame_2.setFrameShape(QFrame::StyledPanel);
        //frame_2.setFrameShadow(QFrame::Raised);
        textEdit_2 = new QTextEdit(frame_2);
        textEdit_2.setObjectName("textEdit_2");
        textEdit_2.setGeometry(new QRect(0, 0, 301, 51));
        QFont font2 = new QFont();
        font2.setFamily("MS Gothic");
        font2.setPointSize(15);
        textEdit_2.setFont(font2);
        label_3 = new QLabel(frame_9);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(330, 220, 31, 16));
        frame_3 = new QFrame(frame_9);
        frame_3.setObjectName("frame_3");
        frame_3.setGeometry(new QRect(330, 240, 301, 51));
        QPalette palette4= new QPalette();
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        frame_3.setPalette(palette4);
        frame_3.setAutoFillBackground(false);
        frame_3.setStyleSheet("background-color: rgb(184, 184, 184);\n"+
"border-style: outset;\n"+
"border-width: 2px;\n"+
"border-radius: 10px;\n"+
"border-color: beige;\n"+
"min-width: 10em;\n"+
"padding: 6px;");
        //frame_3.setFrameShape(QFrame::StyledPanel);
        //frame_3.setFrameShadow(QFrame::Raised);
        dateEdit = new QDateEdit(frame_3);
        dateEdit.setObjectName("dateEdit");
        dateEdit.setGeometry(new QRect(0, 0, 301, 51));
        QFont font3 = new QFont();
        font3.setFamily("Mongolian Baiti");
        font3.setPointSize(14);
        dateEdit.setFont(font3);
        label_4 = new QLabel(frame_9);
        label_4.setObjectName("label_4");
        label_4.setGeometry(new QRect(660, 220, 91, 16));
        frame_6 = new QFrame(frame_9);
        frame_6.setObjectName("frame_6");
        frame_6.setGeometry(new QRect(660, 240, 51, 51));
        frame_6.setStyleSheet("background-color: rgb(184, 184, 184);\n"+
"border-style: outset;\n"+
"border-width: 2px;\n"+
"border-radius: 10px;\n"+
"border-color: beige;\n"+
"padding: 6px;");
        //frame_6.setFrameShape(QFrame::StyledPanel);
        //frame_6.setFrameShadow(QFrame::Raised);
        spinBox = new QSpinBox(frame_6);
        spinBox.setObjectName("spinBox");
        spinBox.setGeometry(new QRect(0, 0, 51, 51));
        QFont font4 = new QFont();
        font4.setFamily("Mongolian Baiti");
        font4.setPointSize(14);
        spinBox.setFont(font4);
        label_5 = new QLabel(frame_9);
        label_5.setObjectName("label_5");
        label_5.setGeometry(new QRect(10, 310, 91, 16));
        frame_8 = new QFrame(frame_9);
        frame_8.setObjectName("frame_8");
        frame_8.setGeometry(new QRect(330, 330, 301, 51));
        QPalette palette5= new QPalette();
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        frame_8.setPalette(palette5);
        frame_8.setAutoFillBackground(false);
        frame_8.setStyleSheet("background-color: rgb(184, 184, 184);\n"+
"border-style: outset;\n"+
"border-width: 2px;\n"+
"border-radius: 10px;\n"+
"border-color: beige;\n"+
"padding: 6px;");
        //frame_8.setFrameShape(QFrame::StyledPanel);
        //frame_8.setFrameShadow(QFrame::Raised);
        radioButton_2 = new QRadioButton(frame_8);
        radioButton_2.setObjectName("radioButton_2");
        radioButton_2.setGeometry(new QRect(110, 10, 81, 31));
        radioButton_4 = new QRadioButton(frame_8);
        radioButton_4.setObjectName("radioButton_4");
        radioButton_4.setGeometry(new QRect(10, 10, 81, 31));
        radioButton_3 = new QRadioButton(frame_8);
        radioButton_3.setObjectName("radioButton_3");
        radioButton_3.setGeometry(new QRect(210, 10, 81, 31));
        label_6 = new QLabel(frame_9);
        label_6.setObjectName("label_6");
        label_6.setGeometry(new QRect(660, 310, 91, 16));
        frame_5 = new QFrame(frame_9);
        frame_5.setObjectName("frame_5");
        frame_5.setGeometry(new QRect(10, 330, 301, 51));
        QPalette palette6= new QPalette();
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(184, 184, 184));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(89, 138, 160));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(184, 184, 184));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(184, 184, 184));
        frame_5.setPalette(palette6);
        frame_5.setAutoFillBackground(false);
        frame_5.setStyleSheet("background-color: rgb(184, 184, 184);\n"+
"border-style: outset;\n"+
"border-width: 2px;\n"+
"border-radius: 10px;\n"+
"border-color: beige;\n"+
"min-width: 10em;\n"+
"padding: 6px;");
        //frame_5.setFrameShape(QFrame::StyledPanel);
        //frame_5.setFrameShadow(QFrame::Raised);
        comboBox = new QComboBox(frame_5);
        comboBox.setObjectName("comboBox");
        comboBox.setGeometry(new QRect(0, 0, 301, 51));
        QFont font5 = new QFont();
        font5.setFamily("Mongolian Baiti");
        font5.setPointSize(14);
        comboBox.setFont(font5);
        comboBox.setStyleSheet("");
        label_7 = new QLabel(frame_9);
        label_7.setObjectName("label_7");
        label_7.setGeometry(new QRect(330, 310, 91, 16));
        frame_7 = new QFrame(frame_9);
        frame_7.setObjectName("frame_7");
        frame_7.setGeometry(new QRect(660, 330, 51, 51));
        frame_7.setStyleSheet("background-color: rgb(184, 184, 184);\n"+
"border-style: outset;\n"+
"border-width: 2px;\n"+
"border-radius: 10px;\n"+
"border-color: beige;\n"+
"padding: 6px;");
        //frame_7.setFrameShape(QFrame::StyledPanel);
        //frame_7.setFrameShadow(QFrame::Raised);
        spinBox_2 = new QSpinBox(frame_7);
        spinBox_2.setObjectName("spinBox_2");
        spinBox_2.setEnabled(false);
        spinBox_2.setGeometry(new QRect(0, 0, 51, 51));
        QFont font6 = new QFont();
        font6.setFamily("Mongolian Baiti");
        font6.setPointSize(14);
        spinBox_2.setFont(font6);
        checkBox = new QCheckBox(frame_9);
        checkBox.setObjectName("checkBox");
        checkBox.setGeometry(new QRect(290, 420, 31, 41));
        checkBox.setStyleSheet("background-color: rgb(184, 184, 184);\n"+
"border-style: outset;\n"+
"border-width: 2px;\n"+
"border-radius: 10px;\n"+
"border-color: beige;\n"+
"padding: 6px;");
        pushButton_2 = new QPushButton(frame_9);
        pushButton_2.setObjectName("pushButton_2");
        pushButton_2.setGeometry(new QRect(580, 420, 146, 41));
        pushButton_2.setStyleSheet("background-color: rgb(184, 184, 184);\n"+
"border-style: outset;\n"+
"border-width: 2px;\n"+
"border-radius: 10px;\n"+
"border-color: beige;\n"+
"min-width: 10em;\n"+
"padding: 6px;");
        pushButton = new QPushButton(frame_9);
        pushButton.setObjectName("pushButton");
        pushButton.setGeometry(new QRect(380, 420, 146, 41));
        pushButton.setStyleSheet("background-color: rgb(21, 152, 255);\n"+
"border-style: outset;\n"+
"border-width: 2px;\n"+
"border-radius: 10px;\n"+
"border-color: beige;\n"+
"min-width: 10em;\n"+
"padding: 6px;");
        label_8 = new QLabel(frame_9);
        label_8.setObjectName("label_8");
        label_8.setGeometry(new QRect(160, 430, 111, 16));

        gridLayout.addWidget(frame_9, 1, 0, 1, 1);

        MainWindow.setCentralWidget(centralwidget);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);
        retranslateUi(MainWindow);
        //radioButton_3.toggled.connect(spinBox_2, "setEnabled(bool)");

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Reservas del Sal\u00f3n HAVANA", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Nombre del contacto", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Tel\u00e9fono del contacto", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Fecha", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "N\u00ba de personas", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Cocina", null));
        radioButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Jornada", null));
        radioButton_4.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Banquete", null));
        radioButton_3.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Congreso", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "N\u00ba de d\u00edas", null));
        comboBox.clear();
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Buffet", null));
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Carta", null));
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Pedir cita", null));
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "No precisa", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Tipo de evento", null));
        checkBox.setText("");
        pushButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Cancelar", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Aceptar", null));
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "\u00bfNecesitas habitaci\u00f3n?", null));
    } // retranslateUi

}

