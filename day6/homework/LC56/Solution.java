class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {
            if (list.isEmpty()) {
                list.add(interval);
            } else {
                int[] last = list.get(list.size() - 1);

                if (interval[0] <= last[1]) {
                    last[1] = Math.max(last[1], interval[1]);
                } else {
                    list.add(interval);
                }
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}