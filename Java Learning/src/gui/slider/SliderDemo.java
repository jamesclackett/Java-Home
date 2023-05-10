package gui.slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    JFrame frame;
    JSlider slider;

    SliderDemo(){
        frame = new JFrame("Slider Demo");
        slider = new JSlider(0,100, 25); // parameters = minimum, maximum, start point

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25); // needed for labels to work
        slider.setPaintTrack(true);
        slider.setPaintLabels(true);
        slider.setOrientation(SwingConstants.VERTICAL);

        frame.add(slider);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // Example
    }
}
