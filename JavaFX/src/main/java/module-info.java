module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;
            
                            
    opens stages to javafx.fxml;
    exports stages;

    opens scenes to javafx.fxml;
    exports scenes;

    opens scenebuilder to javafx.fxml;
    exports scenebuilder;

    opens css_styling to javafx.fxml;
    exports css_styling;

    opens switch_scenes to javafx.fxml;
    exports switch_scenes;

    opens controller_communication to javafx.fxml;
    exports controller_communication;

    opens logout_exit_button to javafx.fxml;
    exports logout_exit_button;

    opens imageview to javafx.fxml;
    exports imageview;

    opens textfield to javafx.fxml;
    exports textfield;

    opens checkbox to javafx.fxml;
    exports checkbox;

    opens radio_button to javafx.fxml;
    exports radio_button;

    opens datepicker to javafx.fxml;
    exports datepicker;

    opens choicebox to javafx.fxml;
    exports choicebox;

    opens sliders to javafx.fxml;
    exports sliders;

    opens progress_bar to javafx.fxml;
    exports progress_bar;

    opens spinners to javafx.fxml;
    exports spinners;

    opens listview to javafx.fxml;
    exports listview;

    opens treeview to javafx.fxml;
    exports treeview;

    opens menubar to javafx.fxml;
    exports menubar;

    opens panes.flow_pane to javafx.fxml;
    exports panes.flow_pane;

    opens panes.grid_pane to javafx.fxml;
    exports panes.grid_pane;

    opens key_events to javafx.fxml;
    exports key_events;

    opens animations to javafx.fxml;
    exports animations;

    opens mediaview to javafx.fxml;
    exports mediaview;

    opens webview to javafx.fxml;
    exports webview;

}