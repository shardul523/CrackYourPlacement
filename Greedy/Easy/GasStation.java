package Greedy.Easy;

class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currFuel = 0;
        int totalFuel = 0;
        int startStation = 0;
        int stations = gas.length;

        for (int i = 0; i < stations; i++) {
            currFuel += gas[i] - cost[i];
            totalFuel += gas[i] - cost[i];
            if (currFuel < 0) {
                currFuel = 0;
                startStation = i + 1;
            }
        }

        if (totalFuel < 0)
            return -1;

        return startStation;
    }
}