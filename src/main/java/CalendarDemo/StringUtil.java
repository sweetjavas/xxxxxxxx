package CalendarDemo;

class BlankStringUtil {
    private BlankStringUtil (){}
    public static boolean hasLength(String str){
        return str!=null&& !"".equals(str.trim());
    }
    public static  boolean isBlank(String str){
        return !hasLength(str);
    }
}
