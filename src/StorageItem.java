public class StorageItem {
    private String name;
    private String date;
    private int size;

    public StorageItem (String name){
        this.name = name;
        this.date = Main.rnd.toString();
    }

    public void setName (String name){ this.name = name; }
    public String getName () { return  name; }
    public void setDate (String date){ this.name = date; }
    public String getDate () { return  date; }

    public int getSize(){ return size; }

    }
}
