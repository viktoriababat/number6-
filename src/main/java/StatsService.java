
    public class StatsService {
        public int minSales(long[] sales) {
            int minMonth = 0;
            int month = 0; // переменная для индекса рассматриваемого месяца в массиве
            for (long sale : sales) {
                // sales[minMonth] - продажи в месяце minMonth
                // sale - продажи в рассматриваемом месяце
                if (sale <= sales[minMonth]) {
                    minMonth = month;
                }
                month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
            }
            return minMonth + 1;
        }

        public int calculateTheAmount(int[] sales) {
            int total= 0;
            for (int sale : sales) {
                total += sale;
            }
            return total;
        }

        public double calculateAverageSum(int[] sales) {
            return calculateTheAmount(sales) / sales.length;

        }

        public int calculateFindMax(int[] sales) {
            int findMax = 0;
            for (int i = 1; i < sales.length; i++) {
                if (sales[findMax] <= sales[i]) {
                    findMax = i;
                }
            }
            findMax +=1;
            return findMax;
        }

        public int calculateFindMin(int[] sales) {
            int findMin = 0;
            for (int i = 1; i < sales.length; i++) {
                if (sales[findMin] >= sales[i]) {
                    findMin = i;
                }
            }
            findMin += 1;
            return findMin;
        }

        public int calculateUnAverage(int[] sales) {
            int count = 0;
            double averageSum = calculateAverageSum(sales);
            for (int sale : sales) {
                if (sale < averageSum) {
                    count = count + 1;
                }
            }
            return count;
        }

        public int calcUpAverage(int[] sales) {
            int count = 0;
            double averageSum = calculateAverageSum(sales);
            for (int sale : sales) {
                if (sale > averageSum) {
                    count = count + 1;
                }
            }
            return count;
        }

    }
