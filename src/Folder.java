import java.util.ArrayList;

public class Folder {

    private String name;
    private ArrayList<File> files;

    public Folder (String name){
        this.name = name;
        this.files = null;
    }

    public int getSize(){
        int size = 0;
        for (int i = 0; i< files.size(); i++){
            size += files.get(i).getSize();
        }
        return size;
    }

    boolean addItem (StorageItem item){

    }
}
