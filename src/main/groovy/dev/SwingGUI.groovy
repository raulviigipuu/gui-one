package dev

import com.formdev.flatlaf.FlatLightLaf

import javax.swing.*
import java.awt.*

class SwingGUI {

    static int clickCount = 0

    void runner() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            void run() {
                initGUI()
            }
        })
    }

    void initGUI() {
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
