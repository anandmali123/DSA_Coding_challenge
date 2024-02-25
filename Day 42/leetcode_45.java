class Solution {
    public int jump(int[] N) {
        int totaljumps = 0;
        int lastjumpIdx = 0;
        int destination = N.length - 1;
        int coverage = 0;
        if (N.length == 1)
            return 0;

        for (int i = 0; i < N.length; i++) {

            coverage = Math.max(i + N[i], coverage);

            if (i == lastjumpIdx) {
                lastjumpIdx = coverage;
                totaljumps++;

                if (coverage >= destination)
                    return totaljumps;
            }

        }
        return totaljumps;
    }
}
