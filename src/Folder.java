import java.util.ArrayList;

public class Folder {

    private String name;
    private ArrayList<StorageItem> items;

    public Folder (String name){
        this.name = name;
        this.items = null;
    }

    public int getSize(){
        int size = 0;
        for (int i = 0; i< items.size(); i++){
            size += items.get(i).getSize();
        }
        return size;
    }

    boolean addItem (StorageItem item){
        for (int i=0 ; i< items.size(); i++){
            if (items.get(i).getName() == item.getName())
                return false;
        items.add(item);
        return true;
        }

    }
}
