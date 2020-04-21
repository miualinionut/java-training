package code._4_student_effort;

public class Pair_of_3 {
    public static void main(String[] args) {
        System.err.println("Number of pairs from [-1, -1, -1, 2] => " + numberOfPairs(new int[]{-1, -1, -1, 2}));
        System.err.println("Number of pairs from [-1, -1, -1, 2, 2, 3] => " + numberOfPairs(new int[]{-1, -1, -1, 2, 2, 3}));
    }

    private static int numberOfPairs(int[] numbers) {
        // Sort the array
        int aux;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    aux = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }

        // Count number of zeros in the array
        int numberOfZeros = 0;
        for (int number : numbers) {
            if (number == 0)
                numberOfZeros++;
        }

        int numberOfPairs = 0;
        int currentSum;
        boolean needToBreak;
        StringBuilder indexesToIgnore = new StringBuilder();
        // Look for 2 neg numbers and 1 poz number
        for (int i = 0; i < numbers.length - 1; i++) {
            needToBreak = false;
            if (indexesToIgnore.toString().contains(String.valueOf(i))) {
                continue;
            }
            if (numbers[i] < 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (needToBreak) {
                        break;
                    }
                    if (indexesToIgnore.toString().contains(String.valueOf(j))) {
                        continue;
                    }
                    if (numbers[j] < 0) {
                        for (int z = numbers.length - 1; z > j; z--) {
                            if (indexesToIgnore.toString().contains(String.valueOf(z))) {
                                continue;
                            }
                            currentSum = numbers[i] + numbers[j] + numbers[z];
                            if (currentSum > 0) {
                                continue;
                            }

                            if (currentSum < 0) {
                                break;
                            }
                            // Add indexes to ignore on future iteration
                            indexesToIgnore.append(i).append(j).append(z);
                            // Increase the counter pair
                            numberOfPairs++;
                            needToBreak = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        // Look for 2 poz numbers and 1 neg number
        for (int i = numbers.length - 1; i >= 1; i--) {
            needToBreak = false;
            if (indexesToIgnore.toString().contains(String.valueOf(i))) {
                continue;
            }
            if (numbers[i] < 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (needToBreak) {
                        break;
                    }
                    if (indexesToIgnore.toString().contains(String.valueOf(j))) {
                        continue;
                    }
                    if (numbers[j] < 0) {
                        for (int z = 0; z < numbers.length; z++) {
                            if (indexesToIgnore.toString().contains(String.valueOf(z))) {
                                continue;
                            }
                            currentSum = numbers[i] + numbers[j] + numbers[z];
                            if (currentSum < 0) {
                                continue;
                            }
                            if (currentSum > 0) {
                                break;
                            }
                            // Add indexes to ignore on future iteration
                            indexesToIgnore.append(i).append(j).append(z);
                            // Increase the counter pair
                            numberOfPairs++;
                            needToBreak = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        // If we have 0's look for 1 neg number and it's complement
        if (numberOfZeros > 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (numberOfZeros == 0) {
                    break;
                }
                if (indexesToIgnore.toString().contains(String.valueOf(i))) {
                    continue;
                }
                for (int j = numbers.length - 1; j >= 0; j--) {
                    if (i >= j) {
                        break;
                    }
                    if (indexesToIgnore.toString().contains(String.valueOf(j))) {
                        continue;
                    }
                    if (numbers[i] + numbers[j] == 0) {
                        indexesToIgnore.append(i).append(j);
                        numberOfZeros--;
                        numberOfPairs++;
                    }
                }
            }

            // If we have 3 zeros that can be considered a pair
            numberOfPairs += numberOfZeros / 3;
        }

        return numberOfPairs;
    }
}
