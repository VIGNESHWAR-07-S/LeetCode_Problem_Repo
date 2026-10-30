class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> v = new ArrayList<>();

        for(int i=1;i<=n;i++) {
            if (i%3==0 && i%5== 0) {
                v.add("FizzBuzz");
            }
            else if (i%3==0) {
                v.add("Fizz");
            }
            else if (i%5==0) {
                v.add("Buzz");
            }
            else {
                v.add(i + "");
            }
        }

        return v;
    }
}