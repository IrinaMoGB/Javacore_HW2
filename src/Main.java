public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Сумма массива: " + getSumm(Arrays.arrayRight));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + getSumm(Arrays.arraySizeException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + getSumm(Arrays.arrayDataException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }
    }

    static void checkValue(String[][] array) throws MyArraySizeException{
        int sizeA = 4;
        int sizeB = 4;
        if(array.length!=sizeA|| array[0].length!=sizeB) throw new MyArraySizeException();
    }

    static Integer getSumm(String[][] array) throws MyArrayDataException,MyArraySizeException{
        checkValue(array);
        Integer result = 0;
        int i =0;
        int j =0;
        try {
            for (; i < array.length; i++) {
                j =0;
                for (; j < array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex){
            throw new  MyArrayDataException("Ошибка в позиции: " + i+","+j);
        }

        return result;
    }

    }

