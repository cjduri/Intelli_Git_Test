package ch05.sec09;

public class ArrayCopyByForExam {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2, 3};

        int[] newIntArray = new int[5];

        for(int i=0; i<newIntArray.length; i++)
            System.out.print(newIntArray[i] + ", ");
        System.out.println(newIntArray);

        int k = 2;
        k = newIntArray.length+k>8?newIntArray.length+1:newIntArray.length;
        for(int i=0; i<oldIntArray.length; i++)
            newIntArray[i+k] = oldIntArray[i];
//        System.arraycopy(oldIntArray, 0, newIntArray, 3, oldIntArray.length);

        for(int i=0; i<k; i++)
            System.out.print(newIntArray[i] + ", ");
        System.out.println(newIntArray);
    }
}
