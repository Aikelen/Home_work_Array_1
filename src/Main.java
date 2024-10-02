public class Main {
    public static void main(String[] args) {

        //1
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double[] fractionalNumbers = {1.57, 7.654, 9.986};

        String[] randomArray = {"First", "Second", "Third"};

        printArrayInt(weight);
        printArrayDouble(fractionalNumbers);
        printArrayString(randomArray);

        printArrayIntReserve(weight);
        printArrayDoubleResrve(fractionalNumbers);
        printArrayStringReserve(randomArray);

        printArrayEventNumbers(weight);
    }
    //2
    public static void printArrayInt(int[] array){
        for(int i = 0; i < array.length;i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }
    public static void printArrayDouble(double[] array){
        for(int i = 0; i < array.length;i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }
    public static void printArrayString(String[] array){
        for(int i = 0; i < array.length;i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();
    }
    //3

    public static void printArrayIntReserve(int[] array){
        for (int i = array.length - 1; i>=0;i--){
            if(i==0){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i]+", ");
            }
        }
        System.out.println();
    }
    public static void printArrayDoubleResrve(double[] array){
        for (int i = array.length - 1; i>=0;i--){
            if(i==0){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i]+", ");
            }
        }
        System.out.println();
    }
    public static void printArrayStringReserve(String[] array){
        for (int i = array.length - 1; i>=0;i--){
            if (i==0){
                System.out.print(array[i]);

            } else {
                System.out.print(array[i]+", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    //4
    public static void printArrayEventNumbers(int[] array){
        for (int i = 0; i < array.length;i++){
            if (i == array.length-1){
                if (array[i] % 2 != 0){
                    array[i]+=1;
                    System.out.print(array[i]);

                }
            } else {
                if (array[i] % 2 != 0) {
                    array[i]+=1;
                    System.out.print(array[i]+", ");
                }else {
                    System.out.print(array[i]+", ");
                }
            }
        }
    }

}