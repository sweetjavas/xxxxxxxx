package ExtendsThreadDemo;


public class ProcessDemo {
    public static void main(String[] args) throws Exception {
        Runtime rt= Runtime.getRuntime();
        rt.exec("notepad");
        ProcessBuilder pd = new ProcessBuilder("calc");
        pd.start();
    }
}
