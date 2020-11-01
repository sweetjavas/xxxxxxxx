package ArrayCopyDemo;

public class ArrayCopyDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] src=new int[]{1,2,3,4,5,6,7,8,9,};

        int[] dest=new int[]{};
        System.out.print(dest);
        System.arraycopy(src,2,dest,5,4);
    }

}
