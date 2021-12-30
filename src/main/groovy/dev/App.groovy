package dev

import javax.swing.*
import com.formdev.flatlaf.FlatLightLaf

class App {

    static void main(String[] args) {
        new App().initGUI()
    }

    void lafList() {
        UIManager.LookAndFeelInfo[] lookAndFeels = UIManager.getInstalledLookAndFeels()

        for (UIManager.LookAndFeelInfo lookAndFeel : lookAndFeels) {
            println 'Name      = ' + lookAndFeel.name()
            println 'ClassName = ' + lookAndFeel.className()
        }
    }

    void initGUI() {
        //FlatLightLaf.setup();
        JFrame frame = new JFrame('GUI one')
        try {
            UIManager.setLookAndFeel('com.formdev.flatlaf.FlatLightLaf')
        } catch (Exception e) {
            e.printStackTrace()
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        frame.setSize(300, 300)
        JLabel label = new JLabel('asd asd')
        JButton button = new JButton('Press')
        frame.getContentPane().add(label)
        frame.getContentPane().add(button)
        frame.setVisible(true)
    }

}
