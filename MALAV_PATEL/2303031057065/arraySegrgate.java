public class arraySegrgate {

    public static void main(String[] args) {
    
    int[] arr = { 0, 1, 2, 1, 0, 2, 1, 0, 2, 0, 1, 2, 0 };
    
    int zero = 0, one = 0, two = 0;
    for (int num : arr) {
    
    if (num == 0) {
    zero++;
    } else if (num == 1) { one++;
    } else if (num == 2) { two++;
    }
    }
    int index = 0;
    for (int i = 0; i < zero; i++) { arr[index++] = 0;
    }
    for (int i = 0; i < one; i++) { arr[index++] = 1;
    }
    for (int i = 0; i < two; i++) { arr[index++] = 2;
    }
    
    for (int num : arr) { System.out.print(num + " ");
    }
    
    }
    
    }
    