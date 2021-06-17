public class File {

    private String name;
    private String type;
    private String content;

    public File (String name, String type){
        this.name = name;
        this.type = type;
        this.content = "";
    }

    public String getName(){ return name + "." + type; }
    public int getSize(){ return content.length(); }

    public void printContent(){
        System.out.println( getName() + "Size: " + getSize() + "Mb " + "Created: " + "date" );
    }

}
