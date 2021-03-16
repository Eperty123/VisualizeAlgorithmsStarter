package visualizealgorithms.bll;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.IAlgorithm;

public class BubbleSortAlgorithm implements IAlgorithm {

    protected int[] data;

    @Override
    public void doWork() {
        int n = data.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (data[j - 1] > data[j]) {
                    //swap the elements!
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public void setData(Object data) {
        this.data = (int[]) data;
    }

    @Override
    public AlgorithmType getType() {
        // Hardcoded???
        return AlgorithmType.SORTING;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
