package dev

import javax.swing.*
import com.formdev.flatlaf.FlatLightLaf

class App {

    static void main(String[] args) {
        new App().initGUI()
    }

    void initGUI() {
        FlatLightLaf.setup();
        JFrame frame = new JFrame('GUI one')
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        frame.setSize(300, 300)
        JLabel label = new JLabel('asd asd')
        JButton button = new JButton('Press')
        frame.getContentPane().add(label)
        frame.getContentPane().add(button)
        frame.setVisible(true)
    }

}
