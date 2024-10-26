public class Analysis {
    int[] analyze(int[] input){
        int n = input.length;
        int[] result = new int[n];
        boolean sort = n > 1 && input[0] < 0;

        for(int i = 0; i < n; i++) {
            result[i] = input[i] * input[i];
        }

        if(sort) {
            int min, temp;
            for(int i = 0; i < n-1; i++) {
                min = i;
                for(int j = i+1; j < n; j++) {
                    if(result[j] < result[min])
                        min = j;
                }
                if (min != i){
                    temp = result[i];
                    result[i] = result[min];
                    result[min] = temp;
                }
            }
        }
        return result;
    }
}
