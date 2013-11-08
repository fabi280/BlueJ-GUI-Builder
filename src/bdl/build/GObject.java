package bdl.build;

import javafx.scene.image.Image;

public abstract class GObject {

    private String fieldName;

    public GObject(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     *
     * @return The name of this field in the java file
     */
    public String getFieldName(){
        Image i = new Image("");
        double d = i.getWidth();

        return fieldName;

    }


}