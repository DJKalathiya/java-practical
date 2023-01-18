public class Practice23 {
    public static void main(String[] args) {
        int value = 1;
        Integer[][] list = new Integer[10][10];
        for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                list[i][j] = value++;
            }
        }
        System.out.println("Minimum Elements is " + min(list));
    }

    public static <E extends Comparable<E>> E min(E[][] list) {
        E min = list[0][0];
        for(E[] elements : list){
            for(E element : elements){
                if(element.compareTo(min)>0)
                    min = element;
            }
        }
    return min;
    }
}
