package dev

import javax.swing.*
import com.formdev.flatlaf.FlatLightLaf

import java.awt.GridBagConstraints
import java.awt.GridBagLayout

class App {

    public static int clickCount = 0

    static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            void run() {
                initGUI()
            }
        })
    }

    static void initGUI() {
        FlatLightLaf.setup()
        JFrame frame = new JFrame('GUI one')
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        frame.setSize(300, 300)
        JButton btnClickCount = new JButton('Press me')
        JLabel lblClickCount = new JLabel('Click count: 0')
        btnClickCount.addActionListener(actionEvent -> {
            clickCount++
            lblClickCount.setText("Click count: $clickCount")
        })
        JPanel panel = new JPanel(new GridBagLayout())
        GridBagConstraints constraints = new GridBagConstraints()
        constraints.gridx = 0
        constraints.gridy = 0
        panel.add(btnClickCount, constraints)
        constraints.gridx = 0
        constraints.gridy = 1
        panel.add(lblClickCount, constraints)
        frame.getContentPane().add(panel)
        frame.setVisible(true)
    }

}
