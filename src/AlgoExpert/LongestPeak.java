package AlgoExpert;

public class LongestPeak {
    public static int longestPeak(int[] array) {

        int i = 0, j = -1, k = -1,
                p = 0, d = 0, n = 0;

        // If the size of array is less than 3,
        // the array won't show mountain like
        // behaviour
        if (array.length < 3)
            return 0;

        for(i = 0; i < array.length - 1; i++)
        {
            if (array[i + 1] > array[i])
            {

                // When a new mountain sub-array is
                // found, there is a need to set the
                // variables k, j to -1 in order to
                // help calculate the length of new
                // mountain sub-array
                if (k != -1)
                {
                    k = -1;
                    j = -1;
                }

                // j marks the starting index of a
                // new mountain sub-array. So set the
                // value of j to current index i.
                if (j == -1)
                    j = i;
            }
            else
            {

                // Checks if next element is
                // less than current element
                if (array[i + 1] < array[i])
                {

                    // Checks if starting element exists
                    // or not, if the starting element of
                    // the mountain sub-array exists then
                    // the index of ending element is
                    // stored in k
                    if (j != -1)
                        k = i + 1;

                    // This condition checks if both
                    // starting index and ending index
                    // exists or not, if yes,the length
                    // is calculated.
                    if (k != -1 && j != -1)
                    {

                        // d holds the lenght of the
                        // longest mountain sub-array.
                        // If the current length is
                        // greater than the calculated
                        // length, then value of d is
                        // updated.
                        if (d < k - j + 1)
                            d = k - j + 1;
                    }
                }

                // Ignore if there is no increase
                // or decrease in the value of the
                // next element
                else
                {
                    k = -1;
                    j = -1;
                }
            }
        }

        // Checks and calculates the length
        // if last element of the array is
        // the last element of a mountain sub-array
        if (k != -1 && j != -1)
        {
            if (d < k - j + 1)
                d = k - j + 1;
        }
        return d;
    }



}
