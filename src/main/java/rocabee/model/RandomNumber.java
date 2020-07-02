package rocabee.model;

import java.util.*;



    public class RandomNumber {

        private ArrayList<Integer> numbers = new ArrayList<>(9);
        private int nrSwitch=3;

        public RandomNumber() {
        }

        public ArrayList myNumbers() {
            Random rd = new Random();
            int duplicate_for_number_1 = 0;
            int duplicate_for_number_2 = 0;
            int duplicate_for_number_3 = 0;
            int duplicate_for_number_4 = 0;
            int duplicate_for_number_5 = 0;
            int duplicate_for_number_6 = 0;
            int duplicate_for_number_7 = 0;
            int duplicate_for_number_8 = 0;
            int duplicate_for_number_9 = 0;


            int sum;

            do {

                Integer random_number = rd.nextInt(9) +1;
                switch (random_number) {
                    case 1:
                        if((duplicate_for_number_1 == nrSwitch)  || (duplicate_for_number_1==4))
                            break;
                        numbers.add(random_number);
                        duplicate_for_number_1++;
                        break;
                    case 2:
                        if ((duplicate_for_number_2 == nrSwitch)  || (duplicate_for_number_2==4)){
                            break;
                        }
                        numbers.add(random_number);
                        duplicate_for_number_2++;
                        break;
                    case 3:
                        if ((duplicate_for_number_3 == nrSwitch)  || (duplicate_for_number_3==4)) {
                            break;
                        }
                        numbers.add(random_number);
                        duplicate_for_number_3++;
                        break;
                    case 4:
                        if ((duplicate_for_number_4 == nrSwitch)  || (duplicate_for_number_4==4)){
                            break;
                        }
                        numbers.add(random_number);
                        duplicate_for_number_4++;
                        break;
                    case 5:
                        if ((duplicate_for_number_5 == nrSwitch)  || (duplicate_for_number_5==4)) {
                            break;
                        }
                        numbers.add(random_number);
                        duplicate_for_number_5++;
                        break;
                    case 6:
                        if ((duplicate_for_number_6== nrSwitch)  || (duplicate_for_number_6==4)) {
                            break;
                        }
                        numbers.add(random_number);
                        duplicate_for_number_6++;
                        break;
                    case 7:
                        if ((duplicate_for_number_7 == nrSwitch)  || (duplicate_for_number_7==4)) {
                            break;
                        }
                        numbers.add(random_number);
                        duplicate_for_number_7++;
                        break;
                    case 8:
                        if ((duplicate_for_number_8 == nrSwitch)  || (duplicate_for_number_8 ==4)){
                            break;
                        }
                        numbers.add(random_number);
                        duplicate_for_number_8++;
                        break;
                    case 9:
                        if ((duplicate_for_number_9 == nrSwitch)  || (duplicate_for_number_9==4)) {
                            break;
                        }
                        numbers.add(random_number);
                        duplicate_for_number_9++;
                        break;
                }
                ArrayList<Integer> duplicates = new ArrayList<>(Arrays.asList(duplicate_for_number_1, duplicate_for_number_2, duplicate_for_number_3,
                        duplicate_for_number_4, duplicate_for_number_5, duplicate_for_number_6,
                        duplicate_for_number_7, duplicate_for_number_8, duplicate_for_number_9));

                sum = duplicates.get(0) + duplicates.get(1) + duplicates.get(2) + duplicates.get(3) + duplicates.get(4) + duplicates.get(5)
                        + duplicates.get(6) + duplicates.get(7) + duplicates.get(8);

                for (int e : duplicates) {
                    if (e == 3) {
                        nrSwitch = 2;
                    }
                }
            } while (sum < 8);
            return numbers;
        }


    }