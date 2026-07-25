class Solution {
    public void calculate(int a, int b, int operator) {
        // code here
        switch(operator){
            case 1:
                System.out.print(a+b);
                break;
            case 2:
                System.out.print(a-b);
                break;
            case 3:
                System.out.print(a*b);
                break;
            default:
                System.out.print("Invalid Input");
        }
    }
}
