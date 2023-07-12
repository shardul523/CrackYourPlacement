package Maths.Easy; 

class HappyNumber {

    int digitsSquare(int n) {
        int sum = 0;
        
        while (n > 0) {
            int d = n % 10;
            sum += d*d;
            n /= 10;
        }

        return sum;
    }

    boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            fast = digitsSquare(digitsSquare(fast));
            slow = digitsSquare(slow);

            if (fast == 1)
                return true;
        } while (fast != slow);

        //cout<<slow<<" "<<fast<<endl;

        return false;
    }
};