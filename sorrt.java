class sorrt {
    int[] arr;
    double[] ar;

    sorrt(int[] newarr) {
        arr = newarr;
    }

    void suort(int array[]) {
        int temp, ptr, ptr1;
        ptr = array[0];
        ptr1 = array[1];
        if (ptr1 < ptr) {
            temp = ptr1;
            ptr1 = ptr;
            ptr = temp;
        }
    }
}
