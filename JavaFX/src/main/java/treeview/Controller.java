package treeview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TreeView<String> treeView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> rootItem = new TreeItem<>("Files", new ImageView(
                new Image(getClass().getResourceAsStream("folder_icon.png"))));
        TreeItem<String> branchItem1 = new TreeItem<>("Music");
        TreeItem<String> branchItem2 = new TreeItem<>("Video");
        TreeItem<String> branchItem3 = new TreeItem<>("Pictures");
        rootItem.getChildren().addAll(branchItem1,branchItem2,branchItem3);

        TreeItem<String> leafItem1 = new TreeItem<>("Music1");
        TreeItem<String> leafItem2 = new TreeItem<>("Music2");
        TreeItem<String> leafItem3 = new TreeItem<>("Video1");
        TreeItem<String> leafItem4 = new TreeItem<>("Video2");
        TreeItem<String> leafItem5 = new TreeItem<>("Pictures1");
        TreeItem<String> leafItem6 = new TreeItem<>("Pictures2");
        branchItem1.getChildren().addAll(leafItem1,leafItem2);
        branchItem2.getChildren().addAll(leafItem3,leafItem4);
        branchItem3.getChildren().addAll(leafItem5,leafItem6);

        treeView.setRoot(rootItem);
        //treeView.setShowRoot(false);

    }

    public void selectItem(){
        TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
        if (item != null){
            System.out.println(item.getValue());
        }
    }



}
