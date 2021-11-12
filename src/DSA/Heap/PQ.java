package DSA.Heap;

public class PQ {
    int[] num;
    int size;

    public PQ() {
        num = new int[50];
        size = -1;
    }

    public int parent(int i){
        return (i - 1)/2;
    }

    public int left(int i){
        return (2 * i) + 1;
    }

    public int right(int i){
        return (2 * i) + 2;
    }

    public void shiftUp(int i){
        while (i > 0 && num[parent(i)] < num[i]){
            swap(parent(i),i);
            i = parent(i);
        }
    }

    public void shiftDown(int i){
        int max = i;
        if(left(i) <= size && num[left(i)] > num[max]){
            max = left(i);
        }

        if(right(i) <= size && num[right(i)] > num[max]){
            max = right(i);
        }

        if(i != max){
            swap(i,max);
            shiftDown(max);
        }
    }
    // add number
    public void add(int n){
        size = size + 1;
        num[size] = n;
        shiftUp(size);
    }

    public void remove(int i){
        num[i] = peek() + 1;
        shiftUp(i);
        exactMax();
    }

    public int exactMax(){
        int res = num[0];
        num[0] = num[size];
        size = size - 1;

        shiftDown(0);
        return res;
    }

    public int peek(){
        return num[0];
    }



    public void swap(int i, int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
}
