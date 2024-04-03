package day_08;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test_08 {
    public static void main(String[] args) {
        int[] winningArray = getRandomArray();
//        int[] myNumber = getMyNumber();
//        int rewards = calculateRewards(winningArray, myNumber);
//        System.out.println("您最后获得的奖金是:");
//        try {
//            TimeUnit.SECONDS.sleep(4);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(rewards + "元!!!");
        System.out.println("本期中奖号码是:" + Arrays.toString(winningArray));
        int totalRewards = tryManyTimes(winningArray);
        System.out.println("您最后的获奖总额是:" + totalRewards);
    }

    private static int tryManyTimes(int[] winningArray) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您一共想购买的彩票数量是:");
        int totalNumber = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < totalNumber; i++) {
            int[] currArray = getRandomArray();
            int currRewards = calculateRewards(winningArray, currArray);
            if(currRewards >= 5000000) {
                System.out.println("一张中大奖彩票是:" + Arrays.toString(currArray) + "该彩票中奖" + currRewards + "元!!!");
            }
            sum += currRewards;
        }
        return sum;
    }

    private static int calculateRewards(int[] winningArray, int[] myNumber) {
        int redMatchNumber = calculateRedMatch(winningArray, myNumber);
        int blueMatchNumber = calculateBlueMath(winningArray, myNumber);
        if(blueMatchNumber > 0 && redMatchNumber <= 2) {
            return 5;
        }
        if((blueMatchNumber > 0 && redMatchNumber == 3) || (blueMatchNumber == 0 && redMatchNumber == 4)) {
            return 10;
        }
        if((blueMatchNumber > 0 && redMatchNumber == 4) || (blueMatchNumber == 0 && redMatchNumber == 5)) {
            return 200;
        }
        if(blueMatchNumber == 1 && redMatchNumber == 5) {
            return 3000;
        }
        if(blueMatchNumber == 0 && redMatchNumber == 6) {
            return 5000000;
        }
        if(blueMatchNumber == 1 && redMatchNumber == 6) {
            return 10000000;
        }
        return 0;
    }

    private static int calculateBlueMath(int[] winningArray, int[] myNumber) {
        return winningArray[6] == myNumber[6] ? 1 : 0;
    }

    private static int calculateRedMatch(int[] winningArray, int[] myNumber) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 6; i++) {
            set.add(winningArray[i]);
        }
        int count = 0;
        for(int i = 0; i < 6; i++) {
            if(set.contains(myNumber[i])) {
                count++;
            }
        }
        return count;
    }

    private static int[] getMyNumber() {
        Scanner sc = new Scanner(System.in);
        int[] myNumber = new int[7];
        for (int i = 0; i < 6; i++) {
            System.out.print("请输入您当前的红色球号码:");
            myNumber[i] = sc.nextInt();
        }
        System.out.print("请输入您当前的蓝色球号码:");
        myNumber[6] = sc.nextInt();
        System.out.println();
        System.out.println("您当前选择的号码是:" + Arrays.toString(myNumber));
        return myNumber;
    }

    private static int[] getRandomArray() {
        int[] result = new int[7];
        int[] redNumbers = new int[33];
        for(int i = 0; i < 33; i++) {
            redNumbers[i] = i + 1;
        }
        int[] blueNumbers = new int[16];
        for(int i = 0; i < 16; i++) {
            blueNumbers[i] = i + 1;
        }
        shuffle(redNumbers);
        shuffle(blueNumbers);
        result[6] = blueNumbers[0];
        System.arraycopy(redNumbers, 0, result, 0, 6);
        return result;
    }

    private static void shuffle(int[] redNumbers) {
        Random rd = new Random();
        for(int i = 0; i < redNumbers.length; i++) {
            swap(redNumbers, i, rd.nextInt(redNumbers.length));
        }
    }

    private static void swap(int[] redNumbers, int i, int j) {
        int temp = redNumbers[i];
        redNumbers[i] = redNumbers[j];
        redNumbers[j] = temp;
    }
}
